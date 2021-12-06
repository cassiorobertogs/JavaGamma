import java.util.Scanner;

public class Exercicio2f {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double autura,largura,profundidade,volume;
		System.out.println("Quanto vale a autura do: ");
		autura=teclado.nextDouble();
		System.out.println("Quanto vale o largura: ");
		largura=teclado.nextDouble();
		System.out.println("Quanto vale o profundidade: ");
		profundidade=teclado.nextDouble();
		volume=autura*largura*profundidade;
		System.out.println("O volume do Paralelepipedo é:"+volume);
		
	}

}
