import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Geben Sie die Breite des Stammes ein: ");
        Scanner scan1 = new Scanner(System.in);
        int breiteStamm = scan1.nextInt();

        System.out.println("Geben Sie die Höhe des Stammes ein: ");
        Scanner scan2 = new Scanner(System.in);
        int hoeheStamm = scan2.nextInt();

        System.out.println("Geben Sie die Höhe der Krone ein: ");
        Scanner scan3 = new Scanner(System.in);
        int hoeheKrone = scan3.nextInt();

        System.out.println("Breite des Stammes = " + breiteStamm);
        System.out.println("Höhe des Stammes = " + hoeheStamm);
        System.out.println("Höhe der Krone = " + hoeheKrone);

        zeichneKrone(hoeheKrone);
        zeichneStamm(breiteStamm, hoeheStamm, hoeheKrone);
    }

    static void zeichneStamm(int stammBreite, int stammHöhe, int kronenHöhe) {
        for (int i = 0; i < stammHöhe; i++) {
            int leerZeichen = kronenHöhe - (int) Math.ceil((stammBreite) / 2);

            zeileZeichnen(leerZeichen, stammBreite);
        }
    }
    static void zeichneKrone(int kronenHöhe) {
        for (int i = 0; i < kronenHöhe; i++) {
            zeileZeichnen(kronenHöhe - i, 2 * i - 1);
        }
    }

    static void zeileZeichnen(int anzahlLeerzeichen, int anzahlSterne) {
        System.out.println(" ");

        for (int i = 0; i < anzahlLeerzeichen; i++) { //check ich nicht
            System.out.print(" ");
        }

        for (int i = 0; i < anzahlSterne; i++) {
            System.out.print("*");
        }
    }
}