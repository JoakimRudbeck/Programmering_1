package kapitel07_Villkorssatser;

public class Grunder {

    public static void main(String[] args) {
        int tal1 = 4;
        int tal2 = 5;

        // om tal1 är 4 eller om tal2 är större än 10
        if(tal1 == 4 || tal2 > 10){
            System.out.println("HEJ HEJ");
        }



        boolean villKoda = false;


        boolean b = tal1 > tal2 && villKoda;




        if(b){
            System.out.println("Inne i if-satsen");
            System.out.println(tal1 + " är större än " + tal2);
            if(tal1 % 5 == 0){
                System.out.println(tal1 + " är jämnt delbart med fem.");
            }
            else{
                System.out.println(tal1 + " är inte jämna delbart med fem.");
            }
        }
        else if(tal1 == 10){
            System.out.println("KÖRS DENNA??");
        }
        else if( tal1 == tal2){
            System.out.println("Inne i else-if-satsen");
            System.out.println("Talen är lika");
        }
        else if(tal1 < tal2){
            System.out.println(tal2 + " är större än " + tal1);
        }
        else{
            System.out.println("Inne i else-satsen");
        }



    }
}
