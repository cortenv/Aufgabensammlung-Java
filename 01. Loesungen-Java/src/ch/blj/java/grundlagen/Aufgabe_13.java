package ch.blj.java.grundlagen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Diese Konsolenanwendung zeichnet einen Tannenbaum in die Konsole.
 * @author nuu
 *
 */
public class Aufgabe_13 {

  	static int stammbreite = 0;
    static int stammhoehe = 0;
    static int kronenhoehe = 0;
    static String zeichnung = "";
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		
		// Eingabe der Stammbreite 
		System.out.println("Breite des Stammes: ");
		String input = in.readLine();

        while (!MyUtils.isInt(input)) {
       	 	System.out.println("Ungültige Eingabe. Bitte geben Sie eine Ganzzahl ein: ");
       	 	input = in.readLine();
        }

        stammbreite = Integer.parseInt(input);
        
        // Eingabe der Stammhöhe
        System.out.println("Höhe des Stammes: ");
        input = in.readLine();

        while (!MyUtils.isInt(input)) {
       	 	System.out.println("Ungültige Eingabe. Bitte geben Sie eine Ganzzahl ein: ");
       	 	input = in.readLine();
        }

        stammhoehe = Integer.parseInt(input);

		// Eingabe der Kronenhöhe
		System.out.println("Höhe der Krone: ");
		input = in.readLine();

		while (!MyUtils.isInt(input)) {
	    	 System.out.println("Ungültige Eingabe. Bitte geben Sie eine Ganzzahl ein: ");
	       	 input = in.readLine();
	    }

		kronenhoehe = Integer.parseInt(input);
		
	    zeichnung = "";

	    zeichne();

	    System.out.println(zeichnung);
	}

	
	static void zeichne() {
	    zeichnung = "";
	    zeichneKrone();
	    zeichneStamm();
	}
	
	static void zeichneKrone() {
        for (int i = 1; i <= kronenhoehe; ++i)
            zeichneZeile(kronenhoehe - i, 2 * i - 1);
	}
	
	
	static void zeichneStamm() {
        for (int i = 1; i <= stammhoehe; ++i)
            zeichneZeile(kronenhoehe - stammbreite / 2 - 1, stammbreite);
	}
	
	
	static void zeichneZeile(int anzahlLeerzeichen, int anzahlSterne) {
        int i;
        for (i = 1; i <= anzahlLeerzeichen; ++i)
            zeichnung += " ";

        for (i = 1; i <= anzahlSterne; ++i)
            zeichnung += "*";

        zeichnung += "\n";
	}
}
