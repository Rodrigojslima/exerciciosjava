package curso_programacao_condicional;
import java.util.Scanner;

public class execcondjava1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("Não negativo");
		}
		else {
			System.out.println("Negativo");
		}
		
		sc.close();		

	}

}
