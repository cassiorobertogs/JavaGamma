import java.util.Scanner;

class AreaQuadrado {

	public static void main(String[] args) {

	Scanner teclado=new Scanner(System.in);
		double lado1, lado2, area; 
		System.out.println("Digite a primeira área do quadrado: ");
		lado1=teclado.nextDouble();
		System.out.println("Digite o valor da segunda área do quadrado: ");
		lado2=teclado.nextDouble();
		area=lado1*lado2;
		System.out.println("O valor da área do quadrado é: ");
		
	}

	
}
