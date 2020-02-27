package kapitel02_Variabler;
import java.util.Scanner;  // Denna rad krävs då vi ska använda klassen Scanner.

public class Inmatning {

    public static void main(String[] args) {
        scanner();
        merScanner();
    }


    static void scanner() {
        Scanner minSkanner = new Scanner(System.in); // För att i Java få input från användaren kan ett Scanner-objekt användas
        System.out.println("Skriv in ett ord, tack: ");
        // Nu vill vi använda vårt scanner-objekt och anropa dess nextLine-metod.
        String indata = minSkanner.nextLine();  // nextLine kommer returnera den sträng som användaren skriver in via tangentbordet följt av enter.
        // variabeln indata innehåller nu den sträng som användren skrev in.
        System.out.println("Du skrev " + indata);
        System.out.println("Skriv in ett heltal, tack: ");
        int tal = minSkanner.nextInt(); // Vi kan även använda metoden nextIn om vi vet att användaren kommer skriva in ett heltal.
        // Notera att om användaren inte skriver in ett heltal då nextInt används får vi ett exekveringsfel och programmet kraschar.
        System.out.println("Du skrev talet " + tal);
    }

    static void merScanner() {
        System.out.println("Vad heter du?");
        Scanner minSkanner = new Scanner(System.in);            // Skapar ett Scanner-objekt
        String namn = minSkanner.nextLine();                    // Läser in en rad skriven från tangentbordet
        System.out.println("Hur gammal är du?");
        String ålderAsString = minSkanner.nextLine();           // Läser in en till rad från tangentbordet.
        int ålder = Integer.valueOf(ålderAsString);             // Typomvandling från String till int med hjälpklassen Integer.
        System.out.println("Du heter " + namn + " och är " + ålder + " år gammal.");
    }
}