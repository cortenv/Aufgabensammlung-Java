import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String quit = "";

        do {

            System.out.println("Tippe eine Zahl, die du in Binär umrechnen möchtest");

            Scanner Zahl = new Scanner(System.in);
            int n = Zahl.nextInt();
            String bin = "";

            while (n > 0) {
                int lsb = n & 1;

                if (lsb != 0)
                    bin = "1" + bin;
                else
                    bin = "0" + bin;

                n >>= 1;
            }

            System.out.println(bin);
            System.out.println("Q to quit");

            Scanner scanner2 = new Scanner(System.in);

            quit = scanner2.nextLine();

            if (quit.toLowerCase().equals("q")) {
                System.exit(0);
            }
        } while (!quit.equals("q"));
    }
}