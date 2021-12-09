import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double tempoGasto, vMedia, kmLitro, precoCombustivel, valorTotalGasto, litrosTanque, qtdTanques;
		System.out.println("Quanto tempo durou a viagem? ");
		tempoGasto = teclado.nextDouble();
		System.out.println("Qual foi a velocidade média em que foi feita a viajem? ");
		vMedia = teclado.nextDouble();
		System.out.println("Quanto estava custando a gasolina onde você asbasteceu? ");
		precoCombustivel = teclado.nextDouble();
		System.out.println("Quanto litros de combustivel cabe no tanque de seu carro? ");
		litrosTanque = teclado.nextDouble();
		kmLitro = vMedia * tempoGasto / 12;
		System.out.print("A qauntidade de litros de combustível gasto foi: " + kmLitro);
		valorTotalGasto = kmLitro * precoCombustivel;
		System.out.println(", totalizando R$: " + valorTotalGasto);
		qtdTanques = kmLitro / litrosTanque;
		if (qtdTanques < 1.0) {
			System.out.println("Você precidsará de arpoximadamentee " + qtdTanques
					+ " % de um tanques de combustível para comcluir outra viajem como essa.");
		} else {
			System.out.println("Você precidsará de arpoximadamentee " + qtdTanques
					+ " tanques de combustível para comcluir outra viajem como essa.");
		}
	}
}
