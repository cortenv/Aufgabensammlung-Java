package ch.blj.java.grundlagen;

/**
 * Diese Konsolenanwendung gibt am Bildschirm alle Zahlen von 1 bis 30 aus, 
 * die durch 3 und/oder durch 5 teilbar sind. 
 * @author nuu
 *
 */
public class Aufgabe_08 {

	public static void main(String[] args) {

		 String result = "";

         for (int i = 1; i <= 30; i++)
         {
             if (i % 5 == 0 || i % 3 == 0)
             {
                 result += String.valueOf(i);
                 if (i < 30)
                     result += ", ";
             }
         }

         System.out.println("Zahlen zwischen 1 und 30, die durch 3 und/oder 5 ohne Rest teilbar sind: ");
         System.out.println(result);
	}
}
