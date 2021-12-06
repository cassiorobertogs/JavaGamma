import java.util.Scanner;

/*
Enunciado - Faça um programa Java que calcule o consumo médio de um carro durante a viagem. Serão informados a distância percorrida e a quantidade de litros
*/
public class Consumo {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		double km,litros,media;
		System.out.println("Por favor digite a distância percorrida");
		km=teclado.nextDouble();
		System.out.println("Digite o valor do litros: ");
		litros=teclado.nextDouble();
		media=km/litros;
		System.out.println("O consumo médio de combustível é: "+media);
		
	}
}
