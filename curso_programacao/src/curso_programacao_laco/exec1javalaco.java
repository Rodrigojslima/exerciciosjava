package curso_programacao_laco;
import java.util.Scanner;
public class exec1javalaco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while( x != 2002) {
			System.out.println("Senha incorreta");
			x = sc.nextInt();
		}
		System.out.println("Acesso permitido");		
		sc.close();
	}

}
