import java.util.Scanner;

public class BUSSEN {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        busschafför();
    }

    static void busschafför(){

        // Fråga hur många passagerare som finns på bussen
        System.out.println("Hur många passagerare finns på bussen?");
        int antalPassagerare = Integer.valueOf(scanner.nextLine());

        // Spara alla namn i en lista
        String[] listaMedNamn = new String[antalPassagerare];

        // Fråga efter alla passagerares namn:
        for(int i = 0; i < antalPassagerare; i++){
            System.out.println("Vad heter du på plats " + (i+1) + "?");
            String namn = scanner.nextLine();
            listaMedNamn[i] = namn;
        }

        System.out.println("Dessa namn har s i sig:");
        // loopa igenom varje namn i listan
        for(int i = 0; i < listaMedNamn.length; i++){
            String namn = listaMedNamn[i];
            // loopa igenom varje tecken i namnet:
            for(int j = 0; j < namn.length(); j++){
                // om tecknet på plats j är ett 's':
                if(namn.charAt(j) == 's' || namn.charAt(j) == 'S'){
                    System.out.println(namn.toUpperCase());
                    break;
                }
            }

        }



    }
}
