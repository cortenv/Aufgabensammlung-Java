import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dieses Program findet heraus ob ein Jahr ein Schaltjahr ist oder nicht.");

        boolean quit = true;

        while (quit) {
            Scanner scan1 = new Scanner(System.in);
            int jahr = scan1.nextInt();

            if (jahr % 400 == 0 || jahr % 4 == 0 && jahr % 100 != 0) {
                System.out.println("Das ist ein Schaltjahr");
            } else {
                System.out.println("Das ist KEIN Schaltjahr");
            }

            System.out.println("Möchten Sie das Program verlassen? Schreiben Sie \"false\" wenn ja. Wenn nicht drücken Sie die Enter-Taste");
            Scanner scan2 = new Scanner(System.in);
            String falsch = scan2.nextLine();

            if (falsch.equals("false")){

                boolean ende = Boolean.parseBoolean(falsch);

                quit = ende;
            } else {
                System.out.println("Geben Sie einen neue Zahl ein:");
            }
        }

    }
}