package ch.blj.java.grundlagen;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Text kürzen.
 * @author nuu
 */
public class Aufgabe_18 {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Gib einen Satz ein: ");
        String input = in.readLine();

        int counter= 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                if (counter < 4) {
                    System.out.print(input.charAt(i));
                    counter++;
                }
            } else {
                System.out.print(input.charAt(i));
                counter = 0;
            }
        }
    }

}
