import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i= 1;

        System.out.println("Wie viele Kilometer möchtest du rennen?");

        Scanner Scanner1 = new Scanner(System.in);
        int kilometer = Scanner1.nextInt();

        if (kilometer > 42) {
            System.out.println("Das schaffst du nicht!");
        } else {
            kilometer *= 1000;
            kilometer /= 400;
            System.out.println("Das sind " + kilometer + " Runden (je 400m). Bereit für den Lauf?");
            Scanner Scanner2 = new Scanner(System.in);
            String jaNein = Scanner2.nextLine();
            jaNein.toLowerCase();
                if (jaNein.equals("ja")) {
                    if (kilometer >= i) {
                        for (int j = 1; j <= kilometer; i++) {
                            System.out.println("Du laufst Runde " + i);
                            j++;
                        }
                        System.out.println("Du hast es geschaft!");
                    } else {
                        System.out.println("Du hast es geschaft!");
                    }
                } else if (jaNein.equals("nein")) {
                    System.out.println("Dann ein anderes Mal.");
                    System.exit(0);
                } else {
                    System.out.println("Das war eine JA oder NEIN Frage."); //Loop zurück zur Frage
                }
        }

    }
}
