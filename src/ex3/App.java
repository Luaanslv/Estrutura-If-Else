package ex3;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		if((a % b  == 0) || (b % a == 0)) {
			System.out.println("São multiplos");
		}else {
			System.out.println("Não são Multiplos");
		}
	}
}
