package ex4;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int horaInicial,horaFinal,duracao;
	
	horaInicial = sc.nextInt();
	horaFinal = sc.nextInt();
	sc.close();
	
	if(horaInicial < horaFinal) {
		duracao = horaFinal - horaInicial;
	}else {
		duracao = (24 - horaInicial) + horaFinal;
	}
	
	System.out.println("O JOGO DUROU " + duracao + " HORA (S)");
	
		
	}
}
