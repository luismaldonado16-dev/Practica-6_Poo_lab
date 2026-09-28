import java.util.Scanner;

public class Menu {
    private int opc;
    private Scanner scn;

    public Menu(){
        scn = new Scanner(System.in);
    }

    public int preguntarMazos(){
        System.out.println("Con cuantos mazos desea jugar?");
        System.out.println("[1] 1 Mazo.");
        System.out.println("[2] 2 Mazos.");
        System.out.println("[3] 3 Mazos.");
        System.out.println("[4] 4 Mazos.");
        System.out.println("[5] 5 Mazos.");
        System.out.println("[6] 6 Mazos.");
        System.out.println("[7] 7 Mazos.");
        System.out.println("[8] 10 Mazos.");
        System.out.println("[9] 100 Mazos.");
        if(scn.hasNext()){
            this.opc = scn.nextInt();
        }
        return opc;
    }
}
