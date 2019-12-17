package Kapitel09_Metoder;

import java.util.Scanner;

public class UppgifterMetoder {

    static Scanner scan = new Scanner(System.in);

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

    static void exempelPåProvUppgift() {
        System.out.println("Uppgift2:");
        /*
        Skapa en metod som givet en sträng returnerar strängen baklänges.
        Anropa sedan din metod med en sträng som användaren skriver in.
        Skriv ut värdet som din metod returnerade.
         */
        System.out.println("Skriv in ett ord, tack :)");
        String ord = scan.nextLine();
        String stringenBaklänges = baklänges(ord);
        System.out.println(ord + " baklänges blir " + stringenBaklänges);
    }

    static String baklänges(String s){
        // skapa en tom sträng
        String svar = "";
        // loopar igenom alla tecken i från slutet till början:
        for(int i = s.length()-1; i>=0; i--){
            // för varje tecken i strängen, lägg till tecknet till den tomma strängen
            svar += s.charAt(i);
        }
        // returnera den fyllda strängen.
        return svar;

    }

    static double avståndetMellan(double[] p1, double[] p2){
        double deltaX = p1[0] - p2[0];
        double deltaY = p2[1] - p2[1];
        return Math.sqrt(deltaX + deltaY);
    }


}