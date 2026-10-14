import java.util.ArrayList;

public class Crupier {

    private ArrayList<Card> cartasCrupier;

    public Crupier(){
        cartasCrupier = new ArrayList<Card>();
    }

    public void tomarCarta(Deck mazoComunitario){
        cartasCrupier.add(mazoComunitario.darCarta());
    }

    public void imprimirCartasMano (){
        for (int i = 1; i < cartasCrupier.size(); i++) {
            System.out.println(cartasCrupier.get(i).cartaCompleta());
        }
    }

    public void imprimirTodasCartasMano (){
        for (Card carta : cartasCrupier){
            System.out.println(carta.cartaCompleta());
        }
    }
}
