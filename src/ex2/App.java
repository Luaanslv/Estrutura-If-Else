package ex2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		if(a % 2 == 0) {
			System.out.println("É par");
			System.out.println( a + " % 2 = " + a % 2);
		}else {
			System.out.println("É impar");
			System.out.println( a + " % 2 = " + a % 2);
		}
	}
}
