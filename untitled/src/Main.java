import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        System.out.println("\n===========Black Jack===========");

        Deck deck = new Deck();
        Deck variasCartas = new Deck();
        Player jugador = new Player();
        Scanner scn = new Scanner(System.in);

        deck.crearMazos();
        deck.imprimirCartas();

        System.out.println("\n\nToma 5 cartas:");

        for(int i = 0; i < 5; i++){
            jugador.tomarCarta(deck);
        }
        jugador.imprimirCartasMano();
        System.out.println("\n\n");

        System.out.println("Cartas sobrantes:\n");
        deck.imprimirCartas();

        System.out.println("Cuantas cartas quieres recoger del mazo de cartas?\n");
        int cuantasCartasQuiere = scn.nextInt();
        ArrayList<Card> cartas = deck.recogerVariasCartas(cuantasCartasQuiere);
        for (Card carta : cartas){
            System.out.println(carta.cartaCompleta());
        }

        System.out.println("\nCarta mas alta: ");
        jugador.determinarCartaMasAlta();
        System.out.println("\nTienes cartas del mismo palo?: " + jugador.mismoPalo());

        System.out.println("Cartas sobrantes:\n");
        deck.imprimirCartas();
    }
}