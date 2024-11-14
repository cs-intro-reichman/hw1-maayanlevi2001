// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// implant inputs
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]) / 100;
		int years = Integer.parseInt(args[2]); 
        // cal future value 
		double futureValue = currentValue *
		 (Math.pow((1 +rate), years)) ;
        // print msg
		 System.out.println("After " + years + " years, $" +
		  currentValue + " saved at " + ( rate * 100 )+
		   "% will yield $" + (int) futureValue);
	}
}