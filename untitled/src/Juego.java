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


}
