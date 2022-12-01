package ch.blj.java.grundlagen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  Diagonale Linie zeichnen.
 *   * @author nuu
 */
public class Aufgabe_15 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            int lengthOfLine = 0;

            try {
                System.out.print("Deine Eingabe: ");
                lengthOfLine = Integer.parseInt(in.readLine());

            } catch (Exception ex) {
                System.out.println("Ungültige Eingabe. Ganzzahl erwartet.");
            }

            if (lengthOfLine > 0) {
                drawLine(lengthOfLine);
                break;
            }
        }
    }

    static void drawLine(int length) {

        System.out.println();

        for (int i = 0; i < length; i++) {
            repeatCharacter('*', i);
            System.out.print(" ");
            repeatCharacter('*', length - i - 1);
            System.out.println();
        }
    }

    static void repeatCharacter(char character, int number) {

        for (int i = 0; i < number; i++)
            System.out.print(character);
    }
}
