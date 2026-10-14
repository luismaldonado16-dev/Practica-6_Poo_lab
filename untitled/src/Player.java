import java.util.ArrayList;

public class Player {
    private ArrayList<Card> cartasMano;

    public Player(){
        cartasMano = new ArrayList<Card>();
    }

    public void tomarCarta(Deck mazoComunitario){
        cartasMano.add(mazoComunitario.darCarta());
    }

    public void imprimirCartasMano (){
        for (Card carta : cartasMano){
            System.out.println(carta.cartaCompleta());
        }
    }
}