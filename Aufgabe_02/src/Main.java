import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Zahl eingeben: ");
        Scanner scannerZahl = new Scanner(System.in);
        int monatsZahl = scannerZahl.nextInt();

        String[] monate = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "september", "Oktober", "November", "Dezember"};

        if (monatsZahl > 0 && monatsZahl < 13) {
            System.out.println(monate[monatsZahl - 1]);
        } else {
            System.out.println("Bitte gib eine Zahl von 1 bis 12 ein.");
        }
    }
}
