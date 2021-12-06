import java.util.Scanner;

public class Exercicio2c {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double base,autura,area;
		System.out.println("Digite o valor da base do triângulo: ");
		base=teclado.nextDouble();
		System.out.println("Digite o valor da autura do triângulo: ");
		autura=teclado.nextDouble();
		area=base*autura;
		System.out.println("O valor da área do triângulo equivale a: "+area);
		
	}

}
