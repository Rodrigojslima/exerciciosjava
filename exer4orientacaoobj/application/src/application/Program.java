package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Client;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		Client client;
		System.out.println("Is there na initial deposit (y/n)?");
		char condition = sc.next().charAt(0);
		
		
		if(condition == 'y') {
			System.out.println("Enter deposit value: ");
		double deposit = sc.nextDouble();
		client = new Client (number, name, deposit);
		}else {
			client = new Client(number, name);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(client);
		
		System.out.println();
		System.out.println("Enter a deposit value");
		double deposit = sc.nextDouble();
		client.deposit(deposit);
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(client);
		
		System.out.println();
		System.out.println("Enter a withdraw value");
		double withdraw = sc.nextDouble();
		client.withdraw(withdraw);
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(client);
		
		sc.close();
	}

}
