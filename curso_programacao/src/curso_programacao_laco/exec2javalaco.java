package curso_programacao_laco;
import java.util.Scanner;
public class exec2javalaco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
		System.out.println("Digite ponto no eixo X:");
		int x = sc.nextInt();
		System.out.println("Digite ponto no eixo Y");
		int y = sc.nextInt();
		
		while(x != 0 && y != 0) { 
		if (x > 0 && y > 0) {
			System.out.println("QUADRANTE 1");
			System.out.println("Digite ponto no eixo X:");
			 x = sc.nextInt();
			System.out.println("Digite ponto no eixo Y");
			 y = sc.nextInt();			
		} else if (x > 0 && y < 0) {
			System.out.println("QUADRANTE 4");
			System.out.println("Digite ponto no eixo X:");
			 x = sc.nextInt();
			System.out.println("Digite ponto no eixo Y");
			 y = sc.nextInt();
		} else if (x < 0 && y < 0) {
			System.out.println("QUADRANTE 3");
			System.out.println("Digite ponto no eixo X:");
			 x = sc.nextInt();
			System.out.println("Digite ponto no eixo Y");
			 y = sc.nextInt();
		} else if (x < 0 && y > 0) {
			System.out.println("QUADRANTE 2");
			System.out.println("Digite ponto no eixo X:");
			 x = sc.nextInt();
			System.out.println("Digite ponto no eixo Y");
			 y = sc.nextInt();
		} else {
			System.out.println();
		}
		
	}
		sc.close();
	}
}
