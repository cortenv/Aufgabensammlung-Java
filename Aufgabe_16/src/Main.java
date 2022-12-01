import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int vokal = 0;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        int ä = 0;
        int ö = 0;
        int ü = 0;

        System.out.println("Geben Sie einen Satz ein:");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        sentence = sentence.toLowerCase();


        for (int j = 0; j < sentence.length(); j++) {
            switch (sentence.charAt(j)) {

                case 'a':
                    ++a;
                    ++vokal;
                    break;
                case 'e':
                    ++e;
                    ++vokal;
                    break;
                case 'i':
                    ++i;
                    ++vokal;
                    break;
                case 'o':
                    ++o;
                    ++vokal;
                    break;
                case 'u':
                    ++u;
                    ++vokal;
                    break;
                case 'ä':
                    ++ä;
                    ++vokal;
                    break;
                case 'ö':
                    ++ö;
                    ++vokal;
                    break;
                case 'ü':
                    ++ü;
                    ++vokal;
                    break;
            }
        }
        System.out.println("Anzahl der Vokale: " + vokal);
        System.out.println("A: " + a);
        System.out.println("E: " + e);
        System.out.println("I: " + i);
        System.out.println("O: " + o);
        System.out.println("U: " + u);
        System.out.println("Ö: " + ö);
        System.out.println("Ü: " + ü);
        System.out.println("Ä: " + ä);
    }
}