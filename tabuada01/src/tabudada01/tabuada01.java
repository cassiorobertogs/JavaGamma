package tabudada01;

import java.util.Scanner;

public class tabuada01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int contador,numero,resultado;
		System.out.println("Digite um número que deseja multiplicar: ");
		numero=teclado.nextInt();
		contador = 0;
		while (contador <=10) {
			resultado = numero * contador;
			System.out.println(numero+"x"+contador+"="+resultado);
			contador++;
			
		}
				
		
	}

}
