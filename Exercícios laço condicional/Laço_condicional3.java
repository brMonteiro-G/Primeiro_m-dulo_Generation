package pacoteJava;
import java.util.Scanner;
public class Laço_condicional3 {
	public static void main(String[] args) {
		
		int idade; 
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número");
		idade = ler.nextInt();
		
		if(10<=idade && idade <= 14) {
		System.out.println("Você está na categoria de 10 até 14 anos");
		}
		if(15<=idade && idade <= 17) {
			System.out.println("Você está na categoria de 15 até 17 anos");
			}
		if(18<=idade && idade <= 25) {
			System.out.println("Você está na categoria de 18 até 25 anos");
			}
		if(idade<10 || idade>25 ) {
			System.out.println("Você não se encaixa em nenhuma categoria !!!");
		}
		
	}

}
