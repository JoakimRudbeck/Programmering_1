package kapitel07_Villkorssatser;

public class Grunder {

    private static boolean uttryck1;
    private static boolean uttryck2;

    public static void main(String[] args) {
        ifSats_Syntax();
        ifElseSats_Syntax();
        ifElseIfElseSats_Syntax();
    }

    private static void ifSats_Syntax() {
        // Syntax för if-sats:
        if(uttryck1){
            // Satser
        }
    }

    private static void ifElseSats_Syntax() {
        // Syntax för if-else-sats:
        if(uttryck1){
            // Satser
        }
        else{
            // Satser
        }
    }

    private static void ifElseIfElseSats_Syntax() {
        // Syntax för if-else-if-else-sats:
        if(uttryck1){
            // satser
        }
        else if(uttryck2){
            // satser
        } // Du kan bygga på med fler else if om du vill.
        else{
            // satser
        }
    }

}
