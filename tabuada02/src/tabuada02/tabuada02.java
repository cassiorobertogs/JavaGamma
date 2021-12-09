package tabuada02;

import java.util.Iterator;
import java.util.Scanner;

public class tabuada02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, resultado;
		System.out.println("Por favor digite o número que deseja multiplicar: ");
		numero = teclado.nextInt();
		for (int contador = 0; contador <= 10; contador++) {
			resultado = contador * numero;
			System.out.println(contador+" x "+numero+" é igual a: "+resultado);
		}
	}

}
