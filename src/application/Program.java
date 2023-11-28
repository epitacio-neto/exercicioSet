package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		Set<Integer> id = new HashSet<>();
		for (int i = 0; i < n; i++) {
			id.add(sc.nextInt());
		}
		
		System.out.print("How many students for course b? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			id.add(sc.nextInt());
		}
		
		System.out.print("How many students for course b? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			id.add(sc.nextInt());
		}
		
		System.out.print("Total students: ");
		System.out.print(id.size());
		
		sc.close();
	}

}
