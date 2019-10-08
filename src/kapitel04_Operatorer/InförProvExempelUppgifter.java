package kapitel04_Operatorer;

public class InförProvExempelUppgifter {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }

    private static void ex5() {
        int a = 8;
        int b = 5 * ++a;
        int c = (66 % b++) % 11;
        // Vad är värdet av c?
    }

    private static void ex1() {
        int[] minaTal = {2,5,8};
        minaTal[2] %= minaTal[1] - minaTal[0];
        minaTal[0] -= minaTal.length % 2;
        // Hur ser minaTal ut efter denna körning?
    }
    private static void ex2() {
        int a = 5;
        int b = 5 % 3;
        int c = ++a * 5 * --b;
        int d = 23 % (c++ * 3 - 2 * a++);
        d += a++;
        // Vad är värdet av variabel e ?
        int e = 20 - d;
    }

    private static void ex3() {
        // Hur ser fältet ut efter denna körning?
        int[] fältet = {1,2,3};
        fältet[0] = fältet[2];
        fältet[1] += fältet[0];
    }

    private static void ex4() {
        int[] fält = {1,2,3};
        int temp = fält[0];
        fält[0] = fält[2];
        fält[2] = fält[0];
        // Hur ser fält ut nu?
    }
}
