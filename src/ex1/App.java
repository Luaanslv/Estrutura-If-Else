package ex1;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		if(a < 0) {
			System.out.println("É negativo");
		}else {
			System.out.println("Não é negativo");
		}
	}
}
