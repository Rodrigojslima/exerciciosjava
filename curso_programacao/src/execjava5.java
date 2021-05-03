import java.util.Locale;
import java.util.Scanner;
public class execjava5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int produtocod1 = sc.nextInt();
		int produtocod2 = sc.nextInt();
		
		int quantidade1 = sc.nextInt();
		int quantidade2 = sc.nextInt();
		
		double valorProduto1 = sc.nextDouble();
		double valorProduto2 = sc.nextDouble();
		
		double total = (quantidade1 * valorProduto1) + (quantidade2 * valorProduto2);
		
		System.out.printf("VALOR A PAGAR: U$ %.2f%n", total);
		
		sc.close();
	}

}
