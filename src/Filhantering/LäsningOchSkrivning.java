package Filhantering;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LäsningOchSkrivning {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        läsningFrånFil();
        skrivTilFil();
    }

    static void skrivTilFil() throws IOException {
        FileWriter myWriter = new FileWriter("src\\LäsningFrånFil\\skrivfil.txt");
        System.out.println("Vad vill du skriva till filen?");
        String dataTillFil = scanner.nextLine();
        myWriter.write(dataTillFil);
        myWriter.close();
        System.out.println("Skrev + " + dataTillFil + " till fil.");
    }

    static void läsningFrånFil() throws FileNotFoundException {
        File file =  new File("src\\LäsningFrånFil\\läsfil.txt");
        Scanner reader = new Scanner(file);
        System.out.println("Innehållet i filen:");
        while(reader.hasNextLine()) {
            String n = reader.nextLine();
            System.out.println(n);
        }
    }
}

