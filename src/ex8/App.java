package ex8;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario,imposto = 0;
		
		salario = sc.nextDouble();
		
		if(salario <= 2000.0) {
			imposto = 0.0;
		}
		else if(salario <= 3000.0){
			imposto = (salario - 2000.0)* 0.08;
		}else if(salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 *0.08;
		}else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if(imposto == 0.0) {
			System.out.println("Isento");
		}else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}
	
}
