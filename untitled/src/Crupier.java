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

    public void vaciarMano(){
        cartasCrupier.clear();
    }

    public int contarValores(){
        int valorCarta = 0;
        int valorTotalCartas = 0;
        for (Card carta : cartasCrupier){
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

    public void tomarCartasCrupier(Deck mazoComunitario,int valorJugador){
        int valorTotalCartaCrupier = contarValores();

        while(valorTotalCartaCrupier < valorJugador && valorTotalCartaCrupier <= 21){

            tomarCarta(mazoComunitario);
            valorTotalCartaCrupier = contarValores();
        }
    }
}
