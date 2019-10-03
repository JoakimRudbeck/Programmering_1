package kapitel02_Variabler;

public class Strängar2 {

    public static void main(String[] args) {
        System.out.println("Programmet startas");

        System.out.println(("" + ('A' + 'B') + 'B' + 'A').charAt(3));




        //strängarExempel();
        //System.out.println("Programmet avslutas");

    }

    private static void strängarExempel() {
        String s = "Sommarlov är skönt!";
        int längd = s.length();
        System.out.println(s + " har längden " + längd);
        String delAvSträng = s.substring(7,19);
        System.out.println(delAvSträng);

        char c = s.charAt(5);
        System.out.println("Tecknet på index 9 är " + c);

        int indexOfMellanslag = s.indexOf(' ');
        System.out.println("Mellanslag finns på index " + indexOfMellanslag);
    }

}
