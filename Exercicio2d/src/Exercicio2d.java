import java.util.Scanner;

public class Exercicio2d {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double base,autura,area;
		System.out.println("Qual é o valor da base do Losango:");
		base=teclado.nextDouble();
		System.out.println("Qual é o valor da autura do Losango:");
		autura=teclado.nextDouble();
		area=base*autura/2;
		System.out.println("O valor da área do Losango é:"+area);
		
	}

}
