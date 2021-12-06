import java.util.Scanner;

public class Exercicio2e {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double diagonal1,diagonal2,area;
		System.out.println("Digite o valor da primeira diagonal do trapézio: ");
		diagonal1=teclado.nextDouble();
		System.out.println("Digite o valor da segunda diagonal do trapézio: ");
		diagonal2=teclado.nextDouble();
		area=diagonal1*diagonal2;
		System.out.println("O valor da área do trapézio é: "+area);
	}

}
