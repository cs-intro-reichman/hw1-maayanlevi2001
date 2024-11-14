// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// Implant iputs
		String diner1 = args[0];
	    String diner2 = args[1];
	    String diner3 = args[2];
		int bill = Integer.parseInt(args[3]);
		// cal each diner pay 
		double dinerPayRounded = Math.ceil( (double) bill / 3);
        // print msg
		System.out.println("Dear " + diner3 + ", " +
		 diner2 + ", and " + diner1 + ": pay " + dinerPayRounded +
		  " Shekels each.");   
	}
}
