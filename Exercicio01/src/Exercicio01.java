import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, novo, unidade, dezena, centena, resto;
		System.out.println("Digite um némero de 3 dígitos");
		numero = teclado.nextInt();
		centena = numero / 100;
		resto = numero % 100;
		dezena = resto / 10;
		unidade = resto % 10;
		novo = unidade * 100 + dezena * 10 + centena;
		System.out.println("O novo número é: " + novo);
	}

}
