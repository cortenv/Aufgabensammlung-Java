package ch.blj.java.grundlagen;

public class MyUtils {

	/**
	 * Returns true if the String s can be converted to type integer. 
	 * @param s
	 * @return
	 */
	static boolean isInt(String s) {
		
		try {
			Integer.parseInt(s);			
		}
		catch (Exception ex) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * Returns true if the String s can be converted to type double.
	 * @param s
	 * @return
	 */
	static boolean isDouble(String s) {
		
		try {
			Double.parseDouble(s);			
		}
		catch (Exception ex) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * Calculates the checksum for a number n.
	 * @param n
	 * @return
	 */
	static int getCheckSum(int n) {
	
		 int sum = 0;
         while (n != 0)
         {
             sum += n % 10;
             n /= 10;
         }

         return sum;
	}
	
	/**
	 * 
	 * @param s
	 * @param n
	 * @return
	 */
	static String padRight(char s, int n) {
	    return String.format("%-"  + n + "s", "").replace(' ', s);
	  }

}
