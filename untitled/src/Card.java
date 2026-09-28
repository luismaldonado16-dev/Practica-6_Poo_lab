public class Card {
    private int valor;
    private String simbolo;

    public Card(int valor, String simbolo){
        this.valor = valor;
        this.simbolo = simbolo;
    }

    public String cartaCompleta(){
         String val;
         switch (this.valor){
            case 1:
                val = "A";
                break;
            case 11:
                val = "J";
                break;
            case 12:
                val = "Q";
                break;
            case 13:
                val = "K";
                break;
            default:
                val = Integer.toString(this.valor);
                break;
        }
        return val + simbolo;
    }

    public int getValor(){
        return valor;
    }

    public String getSimbolo(){
        return simbolo;
    }
}
