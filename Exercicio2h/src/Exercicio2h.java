import java.util.Scanner;

public class Exercicio2h {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double raio1,raio2,altura,volume;
		System.out.println("digite o valor do primeiro raio do  cilindro:  ");
		raio1=teclado.nextDouble();
		System.out.println("digite o valor do segundo raio do  cilindro:  ");
		raio2=teclado.nextDouble();
		System.out.println("digite o valor da altura do cilindro:  ");
		altura=teclado.nextDouble();
		volume=3.14*raio1*raio2*altura;
		System.out.println("O volume do cilindro é:  "+volume);
	}
}
