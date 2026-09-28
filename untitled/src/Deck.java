import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Deck {
    private ArrayList<Card> deck;
    private Card carta;
    private Menu menu;
    private Scanner scn;

    public Deck(){
        deck = new ArrayList<Card>();
        menu = new Menu();
        scn = new Scanner(System.in);
    }

    public Card generarCarta(int valor, String simbolo){
        carta = new Card(valor, simbolo);
        deck.add(carta);
        return carta;
    }

    public void crearMazos() {
        int cantMazos = menu.preguntarMazos();
        int cantidadMazo;
        switch(cantMazos){
            case 8:
                cantidadMazo = 10;
                break;
            case 9:
                cantidadMazo = 100;
                break;
            default:
                cantidadMazo = cantMazos;

        }

        for (int o = 1; o <= cantidadMazo; o++){
            for (int i = 1; i <= 4; i++) {
                for (int c = 1; c <= 13; c++) {
                    if(i == 1){
                        generarCarta(c,"♥");
                    }else if(i == 2) {
                        generarCarta(c,"♣");
                    }else if(i == 3) {
                        generarCarta(c,"♠");
                    }else if(i == 4) {
                        generarCarta(c,"♦");
                    }
                }
            }
        }

        Collections.shuffle(deck);
    }

    public void imprimirCartas(){
        int i = 1;
        for(Card card : deck)
        {
            System.out.println(card.cartaCompleta());
            if(i % 13 == 0){
                System.out.println("\n\n");
                if(i % 52 == 0){
                    System.out.println("\n\n");
                }
            }
            i++;
        }
        System.out.println("Se imprimieron " + deck.size() + " cartas.");

    }

    public Card darCarta(){
        Card cartaDar = deck.getFirst();
        deck.removeFirst();
        return cartaDar;
    }

    public ArrayList<Card> recogerVariasCartas(int cuantasCartasQuiere){

        ArrayList<Card> variasCartas = new ArrayList<>();
        for(int i = 0; i < cuantasCartasQuiere; i++){
            variasCartas.add(darCarta());
        }
        return variasCartas;
    }


}