package ch.blj.java.grundlagen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Monatsnamen ausgeben.
 *
 * @author: nuu
 */
public class Aufgabe_02 {

    public static void main(String[] args) throws IOException {

        String[] monate = { "Januar", "Februar", "März", "April", "Mai", "Juni",
                            "Juli", "August", "September", "Oktober", "November", "Dezember"};

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Zahl: ");
        String input = in.readLine();

        int zahl = 0;

        try {
            zahl = Integer.parseInt(input);
        }
        catch(Exception ex) {
            System.out.println("Ungültige Eingabe. Ganzzahl erwartet.");
        }

        if (zahl < 1 || zahl > 12 ) {
            System.out.println("Bitte eine Zahl zwischen 1 und 12 eingegeben.");
        } else {
            System.out.println("Monat: " + monate[zahl - 1]);
        }
    }
}
