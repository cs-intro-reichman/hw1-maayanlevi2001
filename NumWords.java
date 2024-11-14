// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // implant inputs
		int num = Integer.parseInt(args[0]);
		// cal 
		int hundreds = num / 100;
		int tens = (num / 10) % 10; 
		int ones = num % 10;
        // print
		System.out.println(hundreds + " hundreds, " + 
		tens + " tens, and " + ones + " ones.");

	}
	}

