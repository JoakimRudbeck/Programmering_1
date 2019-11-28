package kapitel08_Repetitionssatser;

import static kapitel08_Repetitionssatser.Meny.scan;

public class UppgifterMetoder {

    public static void main(String[] args) {
        kusinUppgiften();
        System.out.println(förstaHalvanAvOrdet("lampan"));
        System.out.println(hypotenusan(3,4));
        int[] tal = {1, 4, 6, 2};
        System.out.println(produktenAvTalILista(tal));
    }

    private static int produktenAvTalILista(int[] lista) {
        int produkt = 1;
        for(int i = 0; i < lista.length; i++){
            produkt*=lista[i];
        }
        return produkt;
    }

    private static double hypotenusan(int katet1, int katet2) {
        return Math.sqrt(katet1*katet1+katet2*katet2);
    }

    private static String förstaHalvanAvOrdet(String ord) {
        return ord.substring(0,ord.length()/2);
    }

    private static void kusinUppgiften() {
        // variabel som håller koll på summan av åldrarna
        System.out.println("Hur många kusiner har du?");
        int antalKusiner = Integer.valueOf(scan.nextLine());
        int summa = 0;
        // loop som frågar efter varje kusins ålder
        for(int i = 1; i<=antalKusiner; i++){
            System.out.println("Hur gammal är kusin nr " + i + "?");
            // summa ökas med det som användaren skrev in
            summa += Integer.valueOf(scan.nextLine());
        }
        System.out.println("Totala åldern av alla kusiner är " + summa);

    }
}
