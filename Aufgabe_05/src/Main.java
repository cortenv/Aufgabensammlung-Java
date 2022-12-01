import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Berechnung der Sekunden eines Monats in Abhängigkeit seiner Anzahl Tage");

        System.out.println("Wie viele Tage hat der Monat, für den Sie die Sekundenzahl berechnen wollen?");

        Scanner scanner = new Scanner(System.in);
        int monatTage = scanner.nextInt();

        if (monatTage >= 28 && monatTage < 32) {
            System.out.println((monatTage * 86400) + " Sekunden");


        } else {
            System.out.println("Bitte gibt die Tage von einem Monat an");
        }
    }
}