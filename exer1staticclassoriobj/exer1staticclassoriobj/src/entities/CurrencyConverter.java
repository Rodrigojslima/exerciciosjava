package entities;

public class CurrencyConverter {
	
	public static final double IOF = 6;
	
	public static double converter(double dollar, double bougth) {
		double total = dollar * bougth;
		double tribute =  total * IOF /100;
		return total + tribute;
	}

	
}
