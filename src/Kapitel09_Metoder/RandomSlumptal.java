package Kapitel09_Metoder;

public class RandomSlumptal {

    public static void main(String[] args) {
        simuleraTärningkast();
    }

    private static void simuleraTärningkast() {
        while(true) {

            int slumptal = 1 + (int)(6 * Math.random()); // Math.random() ger ett värde mellan 0.0 och 0.999..
            System.out.println(slumptal);
        }
    }
}
