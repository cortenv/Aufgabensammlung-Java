import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dieses Programm berechnet die Summe von zwei Zahlen.");

        Scanner scannerEins = new Scanner(System.in);
        System.out.println("Gib deine erste Zahl ein: ");
        double zahlEins = scannerEins.nextInt();

        Scanner scannerZwei = new Scanner(System.in);
        System.out.println("Gib deine zweite Zahl ein: ");
        double zahlZwei = scannerZwei.nextInt();

        System.out.println(("Summe: ") + (zahlEins + zahlZwei));
    }
}
