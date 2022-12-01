package ch.blj.java.grundlagen;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * Ein kleiner, einfacher Taschenrechner, mit dem der Benutzer zwei Zahlen addieren (+), subtrahieren (-), 
 * multiplizieren (*) und dividieren (/) kann.
 * Zwischen den Operanden dürfen ein oder mehrere Leerzeichen stehen, d.h. der Rechner funktioniert in beiden Fällen.
 * @author nuu
 *
 */
public class Aufgabe_22 {

	public static void main(String[] args) throws Exception {

		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		
		 while (true) {
			 System.out.println("Make your calculation (or press Q to quit): ");

             String input = in.readLine().replaceAll(" ", "");

             if (input.toLowerCase().equals("q")) 
                 break;

             String[] splittedInput = new String[] {"", "", ""};
             
             boolean isFirstOpDone = false;
             
             for (int i = 0; i < input.length(); i++) {
            	 char c = input.toCharArray()[i];
                 if (MyUtils.isInt(String.valueOf(c)) && isFirstOpDone == false) {
                     // 1st operand
                     splittedInput[0] += String.valueOf(c);
                 }
                 else if (MyUtils.isInt(String.valueOf(c))) {
                     // 2nd operand 
                     splittedInput[2] += String.valueOf(c);
                 }
                 else {
                     // operator 
                     isFirstOpDone = true;
                     splittedInput[1] = String.valueOf(c);
                 }
             }

             double n1 = 0;
             double n2 = 0;
             String o = "+";
             String result = "";

             if (MyUtils.isDouble(splittedInput[0]) && MyUtils.isDouble(splittedInput[2])) {
            	
            	 n1 = Double.parseDouble(splittedInput[0]);
            	 n2 = Double.parseDouble(splittedInput[2]);
                 o = splittedInput[1];

                 switch (o) {
                     case "+":
                         result = String.valueOf(n1 + n2);
                         break;
                     case "-":
                         result = String.valueOf(n1 - n2);
                         break;
                     case "*":
                         result = String.valueOf(n1 * n2);
                         break;
                     case "/":
                         result = String.valueOf(n1 / n2);
                         break;
                     case "%":
                         result = String.valueOf(n1 % n2);
                         break;
                     default:
                         break;
                 }
             }

             System.out.println(String.valueOf(result));
         }
	}
}
