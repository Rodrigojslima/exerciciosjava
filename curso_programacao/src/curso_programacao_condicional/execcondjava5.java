package curso_programacao_condicional;
import java.util.Scanner;

public class execcondjava5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod1 = sc.nextInt();
		int cod2 = sc.nextInt();
		double produto1, produto2, soma;
		
		if(cod1 == 1) {
			produto1 = 4.00;
		}else if(cod1 == 2) {
			produto1 = 4.50;
		}else if(cod1 == 3) {
			produto1 = 5.00;
		}else if(cod1 == 4) {
			produto1 = 2.00;
		} else if(cod1 == 5) {
			produto1 = 1.50; 
		}else {
			produto1 = 0;
		}
		
		if(cod2 == 1) {
			produto2 = 4.00;
		}else if(cod2 == 2) {
			produto2 = 4.50;
		}else if(cod2 == 3) {
			produto2 = 5.00;
		}else if(cod2 == 4) {
			produto2 = 2.00;
		} else if(cod2 == 5) {
			produto2 = 1.50; 
		}else {
			produto2 = 0;
		}
		
		soma = produto1 + produto2;
		System.out.printf("TOTAL R$ %.2f%n", soma);
		sc.close();
		
		
		
	}

}
