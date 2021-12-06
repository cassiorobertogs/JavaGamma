import java.util.Scanner;

public class media {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		System.out.println("Digite a primeira nota do aluno: ");
		nota1 = teclado.nextDouble();
		System.out.println("Digite a segunda nota do aluno: ");
		nota2 = teclado.nextDouble();
		System.out.println("Digite a terceira nota do aluno: ");
		nota3 = teclado.nextDouble();
		media = (nota1 = nota2) / 2;
		System.out.print("A média do aluno é: " + media);
		if (media >= 6) {
			System.out.println("o aluno foi aprovado! ");
		} else {
			System.out.println("O aluno foi reprovado. ");
		}
	}
}

