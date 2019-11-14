package Kapitel9;

import java.util.Scanner;

public class BeräknaAreaOchVolymMeny {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean kör = true;
        while(kör == true){
            int val = introduceraAnvändaren();
            switch (val){
                case 1:
                    // Beräkna area av cirkel:
                    cirkelnsArea();
                    break;
                case 2:
                    // beräkna volym av cylinder:
                    cylinderVolym();
                    break;
                case 3:
                    kör = false;
                    break;
            }
        }
        System.out.println("Tack för idag.");

    }

    // Metod som returnerar de val (1,2 eller 3) som användaren svarade.
    static int introduceraAnvändaren() {
        System.out.println("välkommen till beräknaren!");
        System.out.println("Vad vill du göra?");
        System.out.println("[1]\tBeräkna area av cirkel");
        System.out.println("[2]\tBeräkna volym av cylinder");
        System.out.println("[3]\tAvsluta");
        int val = Integer.valueOf(scan.nextLine());
        return val;

    }


    static void cirkelnsArea() {
        System.out.println("Cirkeln radie?");
        int radie = Integer.valueOf(scan.nextLine());
        double area = areaAvCirkel(radie);
        System.out.println("Arean är " + area);

    }

    private static void cylinderVolym() {
        System.out.println("Radie?");
        int radie = Integer.valueOf(scan.nextLine());
        System.out.println("Höjd?");
        int höjd = Integer.valueOf(scan.nextLine());
        double volym = volymAvCylinder(radie, höjd);
        System.out.println("Volymen är " + volym);

    }

    // Metod som returnerar en cirkels area givet dess radie
    static double areaAvCirkel(int radie){
        return 3.14*radie*radie;
    }

    private static double volymAvCylinder(int radie, int höjd) {
        return höjd*areaAvCirkel(radie);
    }
}
