import java.util.Random;
import java.util.Scanner;

public class Workspace {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
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

    private static void fix() {
        long start = System.currentTimeMillis();
        System.out.println(start);
        int a = 100000;
        while(a > 0){
            double b = Math.pow(2,a);
            a--;
        }
        long tidNu = System.currentTimeMillis();
        System.out.println(tidNu);

        System.out.println(tidNu - start);






/*
        Random genererare = new Random();
        int rader = 2 + genererare.nextInt(7);
        int kolumner = 3 + genererare.nextInt(5);
        // För varje rad:
        for (int rad = 1; rad <= rader; rad++){
            // För varje kolumn:
            for(int kol = 1; kol <= kolumner; kol++){
                System.out.print(rad*kol + "\t");
            }
            System.out.println();
        }


        //nästladeListor();

*/
    }

    private static void nästladeListor() {
        int[] L1 = {1,5,10};
        int[] L2 = {3,7,8,13,26,32};
        // Yttre loop:
        for(int i =0; i < L1.length; i++){
            // Inre loop
            for(int j = 0; j<L2.length; j++) {
                System.out.print(L1[i]*L2[j] + "\t");
            }
            System.out.println();
        }
    }
}
