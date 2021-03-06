package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();
		System.out.println("Enter number elements: ");
		Integer n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter number in position: " + i);
			int number = sc.nextInt();
			list.add(i, number);
		}

		System.out.println();
		System.out.println("LIST: ");
		for (int x : list) {
			System.out.print(" " + x);
		}
		System.out.println();
		System.out.println();
		System.out.println("To edit list type:");
		System.out.println("Yes type 1");
		System.out.println("Not type 0");
		int x = sc.nextInt();
		System.out.println("To replace type 1:");
		System.out.println("To insert type 2:");
		System.out.println("To delete type 3:");
		int y = sc.nextInt();

		while (x == 1) {

			while (y == 1) {
				System.out.println("Replace:");
				System.out.println("Add frist position: ");
				Integer position = sc.nextInt();
				System.out.println("Now add number: ");
				Integer number = sc.nextInt();
				list.set(position, number);
				System.out.println("Yes replace 1 / Not insert 0");
				y = sc.nextInt();
			}
			while (y == 2) {
				System.out.println("Insert: ");
				System.out.println("Add frist position: ");
				Integer position = sc.nextInt();
				System.out.println("Now add number: ");
				Integer number = sc.nextInt();
				list.add(position, number);
				System.out.println("Yes insert 2 / Not insert 0");
				y = sc.nextInt();
			}

			while (y == 3) {
				System.out.println("Delete: ");
				System.out.println("Add position: ");
				int position = sc.nextInt();
				list.remove(position);
				System.out.println("Yes delete 3 / Not insert 0");
				y = sc.nextInt();
			}
			System.out.println();
			for (int lst : list) {
				System.out.print(" " + lst);
			}
			System.out.println();

			System.out.println("To continue editing type 1 to exit type 0:");
			x = sc.nextInt();
			if (x == 1) {
				System.out.println("To replace type 1:");
				System.out.println("To insert type 2:");
				System.out.println("To delete type 3:");
				y = sc.nextInt();
			}
		}
		System.out.println("Result final: ");
		for (int lst : list) {
			System.out.print(" " + lst);
		}
		sc.close();
	}

}
