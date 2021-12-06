import java.util.Scanner;

public class Exercicio2g {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double lado1,lado2,lado3,volume;
		System.out.println("Qual é o valor do primeiro lado do cubo: ");
		lado1=teclado.nextDouble();
		System.out.println("Qual é o valor do segundo lado do cubo: ");
		lado2=teclado.nextDouble();
		System.out.println("Qual é o valor do terceiro lado do cubo: ");
		lado3=teclado.nextDouble();
		volume=lado1*lado2*lado3;
		System.out.println("O volume do cubo é: "+volume);
	}

}
