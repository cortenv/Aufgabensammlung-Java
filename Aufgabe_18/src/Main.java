import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String firstFourChars = "";

        Scanner newScanner = new Scanner(System.in);
        String input = newScanner.nextLine();

        String[] words = input.split(" ");

        for (int i = 0; i <= words.length; i++) {
            if (words[i].length() > 4)
            {
                words[i] = input.substring(0, 4);
                System.out.println(words[i]);
            }
            else
            {
                firstFourChars = input;
            }
        }
        System.out.println(firstFourChars);
    }
}