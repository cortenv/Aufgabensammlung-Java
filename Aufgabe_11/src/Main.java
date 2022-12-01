import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bitte geben Sie die Ganzzahl ein, welche Sie dann die Quersumme haben wollen.");
        Scanner scanner = new Scanner(System.in);

        int eingabe = 0;

        try {
            eingabe = scanner.nextInt();
        }
        catch (Exception ex){
            System.out.println("Fehler: Ungültige Eingabe, bitte geben Sie eine Ganzzahl ein. ");
            return;
        }

        System.out.println("Ihre Zahl: " + eingabe);

        if (eingabe % 1 != 0) {
            System.out.println("Bitte eine Ganzzahl eingeben!");
            Scanner scannerZwei = new Scanner(System.in);
            int eingabeZwei = scanner.nextInt();
            System.out.println("Ihre neue Eingabe :" + eingabeZwei);
            int sum = getCheckSum(eingabeZwei);
            System.out.println("Der Querdurschnitt ist " + sum);

        } else if (eingabe % 1 == 0) {
            int sum = getCheckSum(eingabe);
            System.out.println("Der Querdurchschnitt ist " + sum);
        } else {
            System.out.println("ungültige eingabe");
        }
    }

    public static int getCheckSum (int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }
}