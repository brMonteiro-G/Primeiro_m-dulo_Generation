package pacoteJava;

import java.util.Scanner;

public class Laço_condicional1 {
	public static void main(String[] args) {

		int n1 = 0, n2 = 0, n3 = 0;
		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com números inteiros e positivos");
		System.out.println("Digite o primeiro número");
		n1 = ler.nextInt();
		System.out.println("Digite o segundo número");
		n2 = ler.nextInt();
		System.out.println("Digite o terceiro número");
		n2 = ler.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior número dentre os três é:" + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("O maior dentre os três é:" + n2);
		}

		else if (n3 > n2 && n3 > n1) {
			System.out.println("O maior número dentre os três é:" + n3);
		} else {
			System.out.println("Os números são iguais!!!");
		}
	}

}
