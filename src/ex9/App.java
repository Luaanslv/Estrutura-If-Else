package ex9;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero para ver os dias da semanas");
		int x = sc.nextInt();
		String day; 

		switch (x) {
		case 1:
			day = "domingo";
			break;
		case 2:
			day = "segunda";
			break;
		case 3:
			day = "terça";
			break;
		case 4:
			day = "quarta";
			break;
		case 5:
			day = "quinta";
			break;
		case 6:
			day = "sexta";
			break;
		case 7:
			day = "sabado";
			break;
		default: 
			day = "valor invalido";
			break;

		}
		System.out.println("Dia da semana: " + day);
		sc.close();
	}
}
