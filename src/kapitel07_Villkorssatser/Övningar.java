package kapitel07_Villkorssatser;

import java.util.Scanner;

public class Övningar {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        övning7_1();
        övning7_2();
    }

    private static void övning7_1() {
        System.out.println("Övning 7.1:");
        System.out.println("Ålder?");
        int ålder = scan.nextInt();
        if(ålder >= 12){
            System.out.println("Du får delta på tävlingen");
        }
        else{
            System.out.println("Du får tyvärr inte delta på tävlingen.");
        }
    }

    private static void övning7_2() {
        System.out.println("Övning 7.2:");
        double tankVolym = 50;
        double prisPerLiter = 9.50;
        System.out.println("Hur mycker etanol finns i tanken?");
        double etanolITanken = scan.nextDouble();
        if (etanolITanken > 10){
            System.out.println("Kör vidare.");
        }
        else{
            System.out.println("Du bör tanka");
            double literTillFullTank = tankVolym - etanolITanken;
            double prisFörAttFåFullTank = literTillFullTank * prisPerLiter;
            System.out.println("Du bör tanka " + literTillFullTank + " liter, det kommer kosta " + prisFörAttFåFullTank + " kr.");
        }
    }
}
