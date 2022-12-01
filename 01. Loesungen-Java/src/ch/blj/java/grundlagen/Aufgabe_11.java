package ch.blj.java.grundlagen;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Dieses Programm berechnet die Quersumme einer Zahl.
 * @author nuu
 *
 */
public class Aufgabe_11 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.println("Zahl: ");
        String input = in.readLine();
    
        while (!MyUtils.isInt(input)) {
        	System.out.println("Ungültige Eingabe. Bitte geben Sie eine Ganzzahl ein: ");
        	input = in.readLine();
        }

        System.out.println("Quersumme: " + MyUtils.getCheckSum(Integer.valueOf(input)));
	}
}
