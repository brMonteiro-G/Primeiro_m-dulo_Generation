package POO;

import java.util.Scanner;

public class proutoEletrônico_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		float p =0;
		String d = null;
		String pr;
		
		        System.out.println("Bem vindo a loja de produtos eletrônicos");
				System.out.println();
				System.out.println("Temos três produtoa  \n -Diodo \n -Resistor  \n -Solenoide" );
				System.out.println("Escolha o seu: ");
				pr = ler.nextLine();
				
				
				produtoEletrônico pe = new produtoEletrônico(p,d,5,pr);
		System.out.println("Seu produto " + pe.getProduto() +  "Foi adquirido com sucesso" );		
		
	}

}
