package Kapitel14_Samlingar;

import java.util.HashMap;

public class HashMapExempel {

    public static void main(String[] args) {
        fotbollsfansExempel();
    }

    private static void fotbollsfansExempel() {
        // Skapar hashmappen
        HashMap<String, Integer> fans = new HashMap<>();

        // lägger till nyckel-värde-par i hashmapen
        fans.put("Djurgårdare", 12);
        fans.put("Aikare", 3);
        fans.put("Hammarbyare", 8);
        fans.put("Arsenalfans", 2);


        System.out.println("Det finns " + fans.size() + " lag att heja på i din hashmap.");
        System.out.println("Samtliga lag i hashmappen");
        // Loopar igenom varje nyckel i hashmapen
        for (String lag : fans.keySet()){
            System.out.print(lag);
            System.out.print("\tAntal som hejar: ");
            System.out.println(fans.get(lag));
        }
    }
}
