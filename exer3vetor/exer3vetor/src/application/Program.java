package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hotel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Hotel[] room = new Hotel[10];

		System.out.println("Quantidade de estudantes a ser cadastrado? ");
		int numberStudent = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < numberStudent; i++) {
			System.out.println("Entre com nome do estudante: ");
			String name = sc.nextLine();
			System.out.println("Entre com email: ");
			String email = sc.nextLine();
			System.out.println("Entre com numero do quarto: ");
			int numberRoom = sc.nextInt();
			sc.nextLine();
			
			while (room[numberRoom] != null) {
				System.out.println("Quarto ocupado escolha outro: ");
				numberRoom = sc.nextInt();
				sc.nextLine();
			}

			room[numberRoom] = new Hotel(name, email, numberRoom);
		}

		for (int i = 0; i < room.length; i++) {
			if (room[i] != null) {
				System.out.println(room[i]);
			}
		}
		sc.close();
	}
}
