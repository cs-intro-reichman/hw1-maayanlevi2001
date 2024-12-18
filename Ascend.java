// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// get input of range limit
		int lim =  Integer.parseInt(args[0]);
        // creating 3 random nums inside the range
		int a = (int) (lim * Math.random());
		int b = (int) (lim * Math.random());
		int c = (int) (lim * Math.random());
        // print the random numbers
		System.out.println(a + " " + b + " " + c);
		//Ascending order
		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a, Math.max(b, c));
		int middle = a + b + c - min - max;

		System.out.println(min + " " + middle + " " + max);
	}
}
