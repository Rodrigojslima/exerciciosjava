package application;

import java.util.Locale;
import java.util.Scanner;

import entitis.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Student stud = new Student();
		
		System.out.println("Enter name student: ");
		stud.name = sc.nextLine();
		System.out.println("Enter Grade 1: ");
		stud.grade1 = sc.nextDouble();
		System.out.println("Enter Grade 2: ");
		stud.grade2 = sc.nextDouble();
		System.out.println("Enter Grade 3: ");
		stud.grade3 = sc.nextDouble();
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f%n ", stud.finalGrade());
		System.out.println(stud.result());
		System.out.printf("MISSING: %.2f POINTS", stud.missing());
		
		sc.close();
	}

}
