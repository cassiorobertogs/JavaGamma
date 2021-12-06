
import java.util.Scanner;
public class media02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Digite a primeira nota do aluno: ");
		nota1 = teclado.nextDouble();
		System.out.println("Digite a seguanda nota do aluno: ");
		nota2 = teclado.nextDouble();
		media = (nota1 + nota2) / 2;
		System.out.print("A média final é: "+media+", ");
		if (media >= 8 && media <= 10) {
			System.out.println("O aluno foi aprovado com louvor, meus parabéns!!! ");
		} else if (media >= 6 && media <= 8) {
			System.out.println("O aluno foi aprovado! ");
		} else if (media >=5 && media <6) {
			System.out.println("O aluno está em recuperação. ");			
		} else {
		System.out.println("O aluno foi reprovado. ");
		
		}
	}
}	

/*
 * Se a média estiver entre 8 e 10, o aluno foi aprovado com louvor - Se a média
 * estiver entre 6 e abaixo 8 a aluno foi apenas aprovado - Se a média estiver
 * entre 5 e abaixo de 6, o aluno está em recuperação - Caso contrário o aluno
 * está reprovado
 */