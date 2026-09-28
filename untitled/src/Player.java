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

    public Card determinarCartaMasAlta(){
        if(cartasMano.isEmpty()){
            return null;
        }
        Card cartaMasAlta = cartasMano.getFirst();

        for(Card carta : cartasMano){
            if(carta.getValor() > cartaMasAlta.getValor()){
                cartaMasAlta = carta;
            }
        }
        System.out.println(cartaMasAlta.cartaCompleta());
        return cartaMasAlta;
    }

    public boolean mismoPalo(){
        if(cartasMano.isEmpty()){
            return false;
        }

        String paloCarta = cartasMano.getFirst().getSimbolo();

        for (Card carta : cartasMano){
            if(!paloCarta.equalsIgnoreCase(carta.getSimbolo())){
                return false;
            }
        }
        return true;
    }
}