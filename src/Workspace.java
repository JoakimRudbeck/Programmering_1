import java.util.Random;
import java.util.Scanner;

public class Workspace {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        String s = "sommar";
        System.out.println(s.charAt(8));



        System.out.println(8/3); // 2.66 på räknaren men 2 i Java
        // skriva ut 2

        // deklarering
        long b;

        // tilldelning
        b = 1233333;

        int mittTal = 0;
        // hur många byte reserveras i minnet för variabel mittTal?


















        System.out.println('A' + (char)32 + "S" + 65 + (char)66 + (int)3.14 + ("5"+"5"));


        char markör = '*';
        int[] antalkolumnPerRad = {2,4,6,8,10,12,14,12,10,8,6,4,2};
        for(int rad = 0; rad< antalkolumnPerRad.length; rad++){
            // lägga in blanksteg:
            for(int k = 0; k < (14 - antalkolumnPerRad[rad])/2.0; k++){
                System.out.print(" ");
            }

            for(int tecken = 0; tecken < antalkolumnPerRad[rad]; tecken++){
                System.out.print(markör);
            }
            System.out.println();
        }
        int a =5;


    // 1000 ms = 1 s





        /*
         Yttre loop ska göra 3 varv

            Inre loop ska göra 5 varv:

                * * * * *
                * * * * *
                * * * * *






        String[] namnLista = {"Jakob", "Neset", "Karl", "Joakim"};
        // Yttre loop:
        for(int i = 0; i < namnLista.length; i++){
            System.out.println("Hej " + namnLista[i]);
            // Inre loop:
            for(int j = 1; j<=3; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        */
        // Nästlade loopar:






    }

}
