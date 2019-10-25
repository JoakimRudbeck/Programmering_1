import java.util.Random;
import java.util.Scanner;

public class Workspace {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int höjd = 20;
        int bredd = 38;
        for(int i = 1; i <= höjd; i++){
            for(int j = 1; j<= bredd; j++){
                System.out.print("* ");
            }
            System.out.println();
        }



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
