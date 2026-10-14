import java.util.ArrayList;

public class Crupier {

    private ArrayList<Card> cartasCrupier;

    public void tomarCarta(Deck mazoComunitario){
        cartasCrupier.add(mazoComunitario.darCarta());
    }

}
