package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int count = sc.nextInt();		
		System.out.println("Enter accounter holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		Client client;
		System.out.println("Is there na initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
		if (option == 'y') {
			System.out.println("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			client = new Client (count, name, deposit);
		} else {
			client = new Client (count, name);
		}
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(client);
		
		System.out.println();
		System.out.println("Enter a depisit value: ");
		double deposit = sc.nextDouble();
		client.deposit(deposit);
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(client);
		
		System.out.println();
		System.out.println("Enter a withdran value: ");
		double withdraw = sc.nextDouble();
		client.withdraw(withdraw);
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(client);
		
		sc.close();
	}
	

}
