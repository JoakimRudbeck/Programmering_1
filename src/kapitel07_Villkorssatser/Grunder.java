package kapitel07_Villkorssatser;

import java.util.Scanner;

public class Grunder {

    private static boolean uttryck1;
    private static boolean uttryck2;

    public static void main(String[] args) {
        ifSats();
        ifElseSats();
        ifElseIfElseSats();
    }

    private static void ifSats() {
        // Syntax för if-sats:
        if(uttryck1){
            // Satser
        }
    }

    private static void ifElseSats() {
        // Syntax för if-else-sats:
        if(uttryck1){
            // Satser
        }
        else{
            // Satser
        }
    }

    private static void ifElseIfElseSats() {
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
