package curso_programacao_condicional;
import java.util.Scanner;

public class estudosjavacondcional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Que horas s�o? ");
		hora = sc.nextInt();
		
		if (hora < 12){
			System.out.println("Bom dia");
		}
		else if (hora >= 12 && hora < 18) {
			System.out.println("Boa tarde");				
			}
		else if (hora >= 18 && hora <= 23){
			System.out.println("Boa noite");
				}
			else {
				System.out.println("Hora informada esta incorreta =(");
				}
		
		sc.close();
			}		
}


