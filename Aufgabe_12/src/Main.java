import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Gib zwei Zahlen ein von denen du die Quersumme wissen willst.");
        System.out.println("Die Zahlen zwischen den eingegebenen werden kontrolliert um zu sehen ob sie saubere Quersummen haben.");


        Scanner scan1 = new Scanner(System.in);
        int zahl1 = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        int zahl2 = scan2.nextInt();

        System.out.println("Deine erste Zahl ist: " + zahl1);
        System.out.println("Deine zweite Zahl ist: " + zahl2);

        int test = zahl1;
        for (int i = test; i <= zahl2; i++) {
            check(i,getCheckSum(i));
        }
    }

    public static int getCheckSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10); //berechnet Quersumme
            n = n / 10;
        }
        return sum;
    }
    public static void check(int zahl, int querSumme){
        if (zahl%querSumme==0){
            System.out.print(zahl+"     ");
            System.out.print(querSumme+"     ");
            System.out.println(zahl/querSumme);

        }

    }
}