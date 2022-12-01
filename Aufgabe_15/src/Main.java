import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Geben sie eine Zahl ein: ");
        Scanner scanner = new Scanner (System.in);
        int eingabe1 = scanner.nextInt();

        for (int i = 0; i < eingabe1; i++) {
            for (int j = 0; j < eingabe1; j++) {
                if (i == j) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

    }
}