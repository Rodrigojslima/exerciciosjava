import java.util.Locale;
import java.util.Scanner;

public class execjava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio, area, pi = 3.14159;

		System.out.println("Digite o valor do raio para somar a area do circulo:");
		raio = sc.nextDouble();

		area = (raio * raio) * pi;

		System.out.printf("O valor da area: %.4f%n", area);

		sc.close();

	}

}
