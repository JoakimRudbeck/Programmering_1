package kapitel08_Repetitionssatser;

import java.util.Scanner;

public class FYRA_ST_FRUKTER {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int antalFrukterSomMatcharBokstav = 0; // Kollar hur många frukter som har bokstaven i fråga

        System.out.println("Hur många frukter?");
        int N = Integer.valueOf(scanner.nextLine());

        String frukter[] = new String[N];  // Skapar ett fält med erfoderligt antal frukter

        // För varje frukt:
        for (int i = 0; i < frukter.length; i++){  // i = 0,1,2,3,4,5.......N-1
            System.out.println("Vad är frukt " + (i+1) + "?");
            frukter[i] = scanner.nextLine();
        }

        System.out.println("Vilken bokstav?");
        String bokstav = scanner.nextLine().toLowerCase();








        for (int i = 0; i < frukter.length; i++){
            if (frukter[i].toLowerCase().contains(bokstav)){ // Finns bokstaven frukten ?
                antalFrukterSomMatcharBokstav++;
            }
        }

        System.out.println(antalFrukterSomMatcharBokstav + " av alla frukterna har bokstaven '" + bokstav + "' i sig");

        System.out.println((antalFrukterSomMatcharBokstav)*100.0/frukter.length + " procent av frukterna har bokstaven i sig.\n");

    }
}
