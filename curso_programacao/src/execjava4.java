import java.util.Locale;
import java.util.Scanner;

public class execjava4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		double hours = sc.nextDouble();
		double hoursJob = sc.nextDouble();
		
		double salary = hours * hoursJob;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();
		
		
	}

}
