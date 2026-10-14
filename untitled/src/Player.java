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

    public void vaciarMano(){
        cartasMano.clear();
    }

    public int contarValoresJug(){
        int valorCarta = 0;
        int valorTotalCartas = 0;
        for (Card carta : cartasMano){
            valorCarta = carta.getValor();
            if(valorCarta == 1 && (valorTotalCartas+11) <= 21){
                valorTotalCartas += 11;
            }else if(valorCarta == 1 && (valorTotalCartas+11) > 21){
                valorTotalCartas += 1;
            }else if(valorCarta == 11 || valorCarta == 12 || valorCarta == 13){
                valorTotalCartas += 10;
            }else{
                valorTotalCartas += valorCarta;
            }
        }
        return valorTotalCartas;
    }
}