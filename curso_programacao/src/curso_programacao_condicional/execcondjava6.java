package curso_programacao_condicional;
import java.util.Scanner;
public class execcondjava6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double produto, total;
		
		if(codigo == 1) {
			produto = 4.00;
		}else if(codigo == 2) {
			produto = 4.50;
		}else if(codigo == 3) {
			produto = 5.00;
		}else if(codigo == 4) {
			produto = 2.00;
		} else if(codigo == 5) {
			produto = 1.50; 
		}else {
			produto = 0;
		}
		total = produto * quantidade;
		System.out.printf("TOTAL R$ %.2f%n", total);
		sc.close();
		

	}

}
