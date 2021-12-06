/*
 * Falaaa querido professor!! cara agradeceria se me ajudace com esse meu exercício.
 * A idéia desse algorítimo é caucular:
 * a) Quanto o INSS discontará do trabalhador com base na seguinte referência de descontos:
 * até 1.100,00	7,5%
 * de 1.100,01 até 2.203,48	9%
 * de 2.203,49 até 3.305,22	12 %
 * de 3.305,23 até 6.433,57	14%
 * b) Informar ao usuário quanto vale sua hora trabalhada;
 * c) Informar ao usuário quanto vale sua diária;
 * d) quanto ele receberá já com o desconto aplicado.
 * precisava saber com trabalhar com os valores em casa decimais;
 * também, como eu faria para o programa não exibir os valores sem a dízima.
 */

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double qHora, vHora, qDias, vDiaria, valorSalario, desconto, totalSalario;
		System.out.println("Quanto você recebe por mês?");
		valorSalario = teclado.nextDouble();
		System.out.println("Quantas dias no mês você trabalha?");
		qDias = teclado.nextDouble();
		System.out.println("Quantas horas por dia você trabalha?");
		qHora = teclado.nextDouble();
		vHora = valorSalario / (qDias + 4) / qHora;
		System.out.println("Você vende sua hora trabalhda por R$: " + vHora + " a hora. ");
		vDiaria = vHora * qHora;
		System.out.println("Você recebe por diária R$: " + vDiaria);
		if (valorSalario <= 1000) {
			desconto = valorSalario * 7.05 / 100;
			totalSalario = valorSalario - desconto;
			System.out.println(
					"O INSS descontará de seu de salário " + desconto + ", logo seu salário é R&: " + totalSalario);
		} else if (valorSalario >= 1100 && valorSalario <= 2203) {
			desconto = valorSalario * 9 / 100;
			totalSalario = valorSalario - desconto;
			System.out.println(
					"O INSS descontará de seu de salário " + desconto + ", logo seu salário é R&: " + totalSalario);
		} else if (valorSalario > 2203 && valorSalario <= 3305) {
			desconto = valorSalario * 12 / 100;
			totalSalario = valorSalario - desconto;
			System.out.println(
					"O INSS descontará de seu de salário " + desconto + ", logo seu salário é R&: " + totalSalario);
		} else if (valorSalario > 3305 && valorSalario <= 6433) {
			desconto = valorSalario * 14 / 100;
			totalSalario = valorSalario - desconto;
			System.out.println(
					"O INSS descontará de seu de salário " + desconto + ", logo seu salário é R&: " + totalSalario);
		}
	}
}