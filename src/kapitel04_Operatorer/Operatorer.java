package kapitel04_Operatorer;

import java.util.Scanner;

public class Operatorer {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Övning 4.2: Göra månader till år och månader:
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in antal månader, tack:");
        int månader = Integer.valueOf(scan.nextLine());
        // exempel: 38 månader = 3*12 + 2 månader
        // skall ge 3 år och 2 månader.
        int rest = månader % 12; // 2
        månader -= rest; // 36
        int år = månader / 12;
        System.out.println(år + " år och " + månader + " månader.");














        // version 1:
        String[] s1 = new String[3];
        s1[0] = "hej";
        s1[1] = "på";
        s1[2] = "dig";

        // version2:
        String[] s2 = {"hej", "på", "dig"};

















        // Tilldelande operator, sid 52.

        int a = 5;

        // öka med 2:

        // v1:
        a = a + 2;

        // v2:
        a += 2;



        int p = 10;

        // öka med 1:
        p = p + 1;
        p += 1;
        p++;

        // minska med 1:
        int c = 4;
        c = c - 1;
        c-=1;
        c--;

        // multiplicera med 3:
        int m = 4;
        m *= 3;

        int programmering = 5;

        System.out.println(programmering++);
        System.out.println(++programmering);
        System.out.println(programmering);

















































        //moduloExempel();
        //tilldelandeOperator();
        //ökaMedEttExempel();
    }

    static void moduloExempel() {
        System.out.println("Skriv in antal minuter");
        int antalMinuter = scanner.nextInt();
        int minuter = antalMinuter % 60;
        int antalTimmar = antalMinuter / 60; // int dividerat med int ger en int, decimalerna försvinner
        System.out.println("Timmar = " + antalTimmar +", minuter = " + minuter);
        System.out.println(17 % 5); // 17 % 5 ger TVÅ eftersom 17 / 5 = 3 hela och TVÅ femtedelar.
    }

    static void tilldelandeOperator() {
        int a = 5;
        System.out.println("Vad vill du plussa med?");
        int plussa = scanner.nextInt();
        a += plussa; // Samma sak som a = a + plussa;
        System.out.println(a);
        // fungerar även med -= /= och *=
    }

    static void ökaMedEttExempel() {
        int b = 5;
        System.out.println(b);
        System.out.println(++b); // pre-fix, ökar på en gång.
        System.out.println(b);
        System.out.println(b++); // post-fix, ökar efteråt.

        // 4 sätt att öka en variabels värde med 1:
        int a = 5;
        a = a + 1;
        a += 1;
        a++;  // Postfix
        ++a;  // Prefix
    }

}
