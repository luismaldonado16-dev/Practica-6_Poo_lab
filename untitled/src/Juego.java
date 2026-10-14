public class Juego {

    private Deck deck;
    private Menu menu;
    private Player player;
    private Crupier crupier;

    public Juego(){
        deck = new Deck();
        menu = new Menu();
        player = new Player();
        crupier = new Crupier();
    }

    public int estatusJuego(){
        int valorJugador = player.contarValoresJug();
        int valorCrupier = crupier.contarValores();

        if(valorJugador > 21 && valorCrupier > 21){
            return 3;
        }
        if(valorJugador > 21){
            return 2;
        }
        if(valorCrupier > 21){
            return 1;
        }

        if(valorJugador > valorCrupier){
            return 1;
        }else if(valorJugador < valorCrupier){
            return 2;
        }
        return 3;
    }

    public void blackJack(){

        int eleccion = 1;
        do {
            System.out.println("===============Black Jack===============");
            int sumaJugador = 0;
            deck.crearMazos();

            crupier.vaciarMano();
            crupier.tomarCarta(deck);
            crupier.tomarCarta(deck);

            player.vaciarMano();
            player.tomarCarta(deck);
            player.tomarCarta(deck);

            System.out.println("\nCartas del Crupier.");
            crupier.imprimirCartasMano();

            System.out.println("\nCartas del Jugador.");
            player.imprimirCartasMano();
            sumaJugador = player.contarValoresJug();
            System.out.println("Valor de las cartas del Jugador: " + sumaJugador);
            System.out.println("\n");

            int opcionCartaTomar;

            do {
                opcionCartaTomar = menu.preguntarTomarCarta();

                if (opcionCartaTomar == 2) {
                    player.tomarCarta(deck);

                    System.out.println("\nTomaste carta, ahora este es tu mazo:");
                    player.imprimirCartasMano();
                    sumaJugador = player.contarValoresJug();
                    System.out.println("Valor de las cartas del Jugador: " + sumaJugador);
                    System.out.println("\n");
                }

            } while (opcionCartaTomar == 2);

            System.out.println("\nCartas del Crupier.");
            crupier.imprimirTodasCartasMano();

            System.out.println("\nCartas del Jugador.");
            player.imprimirCartasMano();
            System.out.println("\n");

            sumaJugador = player.contarValoresJug();
            System.out.println("Valor de las cartas del Jugador: " + sumaJugador);

            System.out.println("\n======Crupier comenzara a tomar cartas...======\n");
            crupier.tomarCartasCrupier(deck, sumaJugador);
            int sumaCrupier = crupier.contarValores();
            crupier.imprimirTodasCartasMano();
            System.out.println("\nValor de las cartas del Crupier: " + sumaCrupier);

            int estatus = estatusJuego();

            switch (estatus) {
                case 1:
                    System.out.println("\nFELICIDADES HAS GANADO JUGADOR!!!");
                    break;
                case 2:
                    System.out.println("\nMas suerte la proxima, crupier ha ganado...");
                    break;
                case 3:
                    System.out.println("\nMas suerte la proxima, hubo un empate.");
                    break;
            }

            eleccion = menu.deseasVolverAJugar();
        }while(eleccion == 1);

        System.out.println("\nVuelva pronto! :D\n");
    }
}
