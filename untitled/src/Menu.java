import java.util.Scanner;

public class Menu {
    private int opc;
    private Scanner scn;

    public Menu(){
        scn = new Scanner(System.in);
    }

    public int preguntarMazos(){
        System.out.println("\nCon cuantos mazos desea jugar?");
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

    public int preguntarTomarCarta(){
        System.out.println("Que deseas hacer?");
        System.out.println("[1] Plantarse");
        System.out.println("[2] Tomar Carta");
        if(scn.hasNext()){
            this.opc = scn.nextInt();
        }
        return opc;
    }

    public int deseasVolverAJugar(){
        System.out.println("\nDeseas volver a jugar?");
        System.out.println("[1] Si");
        System.out.println("[2] No");
        if(scn.hasNext()){
            this.opc = scn.nextInt();
        }
        return opc;
    }
}
