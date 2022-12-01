import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Geben sie einen Satz ein: ");

        Scanner newScanner = new Scanner(System.in);
        String input = newScanner.nextLine();


        System.out.println("Ihr Satz: " + input);
        for(int i = input.length()-1; i>= 0; i--){
            System.out.print(input.charAt(i));
        }

    }
}