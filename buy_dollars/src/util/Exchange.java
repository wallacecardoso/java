package util;

public class Exchange {
	
	private static final double IOF = 6 / 100;

	public static final IOF = ;

	public static double converter(double priceDollar, double dollarsBought) {
		double total = (priceDollar * dollarsBought);
		double withIof = total * IOF ;
		return  total + withIof;
	}
}
