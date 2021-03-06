package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What in the dollar price?");
		System.out.println("Enter value: ");
		double dollar = sc.nextDouble();
		System.out.println("How many dollars will be bougth?" );
		System.out.println("Enter value: ");
		double bougth = sc.nextDouble();
		
		double total = CurrencyConverter.converter(dollar , bougth );
		
		System.out.printf("Amount to be paid in reais = %.2f" , total);
		sc.close();
	}

}
