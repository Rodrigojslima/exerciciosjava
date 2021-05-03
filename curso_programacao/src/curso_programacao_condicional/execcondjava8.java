package curso_programacao_condicional;

import java.util.Scanner;

public class execcondjava8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("QUADRANTE 1");
		} else if (x > 0 && y < 0) {
			System.out.println("QUADRANTE 4");
		} else if (x < 0 && y < 0) {
			System.out.println("QUADRANTE 3");
		} else if (x < 0 && y > 0) {
			System.out.println("QUADRANTE 2");
		} else if (x == 0 && y == 0) {
			System.out.println("ORIGEM");
		} else {
			System.out.println("PONTOS INFORMADOS INCORRETO");
		}
		sc.close();

	}

}
