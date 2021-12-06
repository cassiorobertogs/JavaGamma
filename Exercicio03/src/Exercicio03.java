import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salarioMinimo,totalKwGasto,valorKw,totalConta,totalDesconto;
		System.out.println("Digite o valor do salário mínimo: ");
		salarioMinimo=teclado.nextDouble();
		System.out.println("Quantos Kilo Wats foi consumido em sua residência? ");
		totalKwGasto=teclado.nextDouble();
		valorKw= salarioMinimo / 7 / 100 * 1;
		totalConta=valorKw*totalKwGasto;
		totalDesconto= totalConta * 100 / 10; 
		System.out.println("Cada kile Wats consome "+valorKw+" R$ de seu salário, logo você terá que pagar a quantia de "+totalConta+"mas como temos um bom relacionamento, se pagar hoje, você terá que pagar apenas: "+totalDesconto);
	}
}

