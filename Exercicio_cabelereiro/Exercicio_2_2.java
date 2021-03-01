package POO;

import java.util.Scanner;

public class Exercicio_2_2{
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler= new Scanner(System.in);
		
		String x;
		String y;
		String z;
		System.out.println("Seja bem vindo ao cadastro do cabelereiro a satisfação do cliente é nossa prioridade  ");
		
		System.out.println("Qual o tipo do seu cabelo ?  ");
		x= ler.nextLine();
		System.out.println("Qual corte você deseja ?  ");
		y= ler.nextLine();
		System.out.println("Qual penteado utiliza ?  ");
		z= ler.nextLine();
		
		Exercicio_2 cabeleleiro = new Exercicio_2(x,y,z);
		 
		
		System.out.println("Seu corte de cabelo é: "+ cabeleleiro.getTipoCabelo() + "\nCorte: "+ cabeleleiro.getCorte() + "\nPenteado: " + cabeleleiro.getPenteado()  );
		
		
	}
}