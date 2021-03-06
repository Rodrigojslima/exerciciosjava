package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Family;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantidade de membros da familia: ");
		Integer quantMembros = sc.nextInt();
		sc.nextLine();
		List<Family> lista = new ArrayList<>();
		
		for(int i = 0; i < quantMembros; i++ ) {
			System.out.println("Entre com nome:");
			String nome = sc.nextLine();
			System.out.println("Entre com data de nascimento: ");
			String data = sc.nextLine();
			System.out.println("Entre com a idade: ");
			Integer idade = sc.nextInt();
			sc.nextLine();
			System.out.println("Entre com a posi??o familiar: ");
			String posicao = sc.nextLine();
			
			Family lima = new Family(nome, data, idade, posicao);
			lista.add(lima);
		}
		
		for(Family lima: lista) {
		System.out.println(lima);
		}
		sc.close();
	}

}
