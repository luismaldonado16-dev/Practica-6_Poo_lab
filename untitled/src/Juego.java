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

    public void blackJack(){

        System.out.println("===============Black Jack===============");

        deck.crearMazos();

        crupier.tomarCarta(deck);
        crupier.tomarCarta(deck);

        player.tomarCarta(deck);
        player.tomarCarta(deck);

        System.out.println("\nCartas del Crupier.");
        crupier.imprimirCartasMano();

        System.out.println("\nCartas del Jugador.");
        player.imprimirCartasMano();
        System.out.println("\n");

        int opcionCartaTomar;

        do{
            opcionCartaTomar = menu.preguntarTomarCarta();

            if(opcionCartaTomar == 2){
                player.tomarCarta(deck);

                System.out.println("\nTomaste carta, ahora este es tu mazo:");
                player.imprimirCartasMano();
                System.out.println("\n");
            }else{

                System.out.println("\nCartas del Crupier.");
                crupier.imprimirTodasCartasMano();

                System.out.println("\nCartas del Jugador.");
                player.imprimirCartasMano();
                System.out.println("\n");

                System.out.println("======Crupier comenzara a tomar cartas...======\n");
            }
        }while(opcionCartaTomar == 2);

    }
}
