import java.util.Locale;
import java.util.Scanner;
public class exerciciojava1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double comprimento , largura, area, valorMetroQuadrado, valorTerreno;
		
		System.out.println("Digite o comprimento: ");
		comprimento = sc.nextDouble();
		System.out.println("Digite a largura: ");
		largura = sc.nextDouble();
		System.out.println("Digite o valor do terreno por metro quadrado: ");
		valorMetroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		valorTerreno = area * valorMetroQuadrado;
		
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PREÇO = %.2f%n", valorTerreno);
		
		sc.close();
		
	}

}
