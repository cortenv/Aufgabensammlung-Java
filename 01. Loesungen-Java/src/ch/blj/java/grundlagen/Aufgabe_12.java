package ch.blj.java.grundlagen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Diese Konsolenanwendung nimmt vom Benutzer zwei Ganzzahlen entgegen und prüft für alle Zahlen,
 * die sich im Bereich der ersten bis zur zweiten Zahl befinden, ob sie durch ihre eigene Quersumme
 * ohne Rest teilbar sind.
 * @author nuu
 *
 */
public class Aufgabe_12 {

	public static void main(String[] args) throws IOException {

	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
        int n1 = 0;
        int n2 = 0;

        System.out.println("Zahl 1: ");
        String input = in.readLine();

        while (!MyUtils.isInt(input)) {
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine Ganzzahl ein: ");
            input = in.readLine();
        }

        n1 = Integer.valueOf(input);

        System.out.println("Zahl 1: ");
        input = in.readLine();

        while (!MyUtils.isInt(input)) {
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine Ganzzahl ein: ");
            input = in.readLine();
        }

        n2 = Integer.valueOf(input);

        String result = "-" + MyUtils.padRight('-', 37) + "\n";
        result += " Zahl" + MyUtils.padRight(' ', 3)
                          + "|"
                          + " Quersumme" + MyUtils.padRight(' ', 3)
                          + "|"
                          +  " Zahl / Quersumme" + MyUtils.padRight(' ', 12)
                          + "\n";

        result += "-" + MyUtils.padRight('-', 37) + "\n";

        for (int i = n1; i <= n2; i++) {

            int checkSum = MyUtils.getCheckSum(i);
            if (i % checkSum == 0) {
                result += String.format("% 6d", i) + MyUtils.padRight(' ', 2)
                       + "|"
                       + String.format("% 3d", checkSum) + MyUtils.padRight(' ', 10)
                       + "|"
                       + String.format("% 3d", (i / checkSum)) + MyUtils.padRight(' ', 2)
                       + "\n";
            }
        }

        System.out.println(result);
 	}
}
