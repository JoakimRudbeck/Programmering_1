package kapitel08_Repetitionssatser;

import static kapitel08_Repetitionssatser.Meny.scan;

public class UppgifterMetoder {

    public static void main(String[] args) {
        kusinUppgiften();
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
