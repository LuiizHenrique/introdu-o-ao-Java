

/*
 * Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,respectivamente.
 */


package introdu��oAoJava;

import java.util.Scanner;

public class exercicio5 {
public static void main(String[] args) {

		float n1, n2, n3;
		float media;

		Scanner id = new Scanner(System.in);

		System.out.println("Digite a nota 1: ");
		n1 = id.nextFloat();
		System.out.println("Digite a nota 2: ");
		n2 = id.nextFloat();
		System.out.println("Digite  a nota 3: ");
		n3 = id.nextFloat();

		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		
		System.out.println("A media  � !!!:  "+media);
	}
}