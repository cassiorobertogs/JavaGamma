import java.util.Scanner;

public class Exercicio2b {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double base,autura,area;
		System.out.println("Digite o tamanho da base do retângulo: ");
		base=teclado.nextDouble();
		System.out.println("Agora digite a autura do retângulo: ");
		autura=teclado.nextDouble();
		area=base*autura;
		System.out.println("a area do retângulo equivale a :"+area);
	}

}
