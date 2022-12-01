import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Rechner (Q zum Beenden)");
        {
            System.out.println("Erste Zahl: ");
            Scanner scanner1 = new Scanner(System.in);
            int number1 = scanner1.nextInt();

            System.out.println("Operator: ");
            Scanner operator0 = new Scanner(System.in);
            String operator = operator0.nextLine();

            System.out.println("Zweite Zahl :");
            Scanner scanner2 = new Scanner(System.in);
            int number2 = scanner2.nextInt();

            System.out.println("Ergebnis: ");

            switch (operator) {
                case "+":
                    System.out.println(number1 + number2);
                    beenden();
                    break;
                case "-":
                    System.out.println(number1 - number2);
                    beenden();
                    break;
                case "/":
                    System.out.println(number1 / number2);
                    beenden();
                    break;
                case "*":
                    System.out.println(number1 * number2);
                    beenden();
                    break;

                default:
                    System.out.println("error");
                    beenden();
            }
        }
    }

    public static void beenden() {
        System.out.println("Beenden? Wenn ja, drück \"q\"");
        Scanner qtoQuit = new Scanner(System.in);
        String q = qtoQuit.nextLine();
        if (q.toLowerCase().equals("q")) {
            System.exit(0);
        } else {

        }
    }
}
