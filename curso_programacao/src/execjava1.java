import java.util.Scanner;

public class execjava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int totalSoma = numero1 + numero2;
		
		System.out.printf("Soma = " + totalSoma);
				
		sc.close();
		
	}

}
