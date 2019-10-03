package kapitel04_Operatorer;

public class Felsökning {

    public static void main(String[] args) {

        String mening = "Detta är en mening";
        String[] listaMedAllaOrdIMeningen = mening.split(" ");
        int antalOrdIMeningen = listaMedAllaOrdIMeningen.length;
        System.out.println("Dessa ord finns i meningen:");
        System.out.println(listaMedAllaOrdIMeningen[0]);
        System.out.println(listaMedAllaOrdIMeningen[1]);
        System.out.println(listaMedAllaOrdIMeningen[2]);
        System.out.println(listaMedAllaOrdIMeningen[3]);
    }
}
