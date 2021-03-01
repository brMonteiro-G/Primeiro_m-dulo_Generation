
package POO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Scanner;

public class Collections {
	public static void main(String[] args) {
		
	
//  Estoque loja de eletrônica
//	Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
//	trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
//	programa deverá atender as seguintes funcionalidades:
//	Armazenar dados da List
//	Remover dados da list;
//	Atualizar dados da list.
//	Apresentar todos os dados da list.
	
	List<String> lista = new ArrayList<String>();
	Scanner ler = new Scanner(System.in); 
	
	lista.add("Resistor");
	lista.add("Diodo");
	lista.add("Bobina");
	lista.add("Relé");
	lista.add("Protoboard");
	lista.add("Bateria");
	String op;

	System.out.println("Bem vindo ao estoque da Eletrotel");
	System.out.println("---------------------------------");
	do {
	System.out.println("Escolha uma opção: \n1)Mostrar produtos do estoque \n2)Adicionar produtos do estoque \n3)Remover produtos do estoque \n3)Atualizar produtos do estoque");
	System.out.println();
	

	op = ler.next();
	
	String pr ;
	
	switch(op) {
	case "1": 
		for( int i=0;i<lista.size();i++) {
			System.out.println("Produto :" + (i+1) + ": " +  lista.get(i)); //get obtém 
		}
		break;
	case"2": 
		System.out.println("Digite o nome do produto que deseja adicionar: ");
		pr = ler.next();
		
		lista.add(pr);
		
		break;
	case"3":
		System.out.println("Digite o produto que deseja remover: ");
		 pr = ler.next();
		 if(lista.contains(pr)) {
		lista.remove(pr);
		
		 }
		 else {
			 System.out.println("O produto já não está disponível no estoque");
		 }
		break;
	case"4":
		System.out.println("Digite o produto que você deseja atualizar: ");
		pr = ler.next();
		if(lista.contains(pr)) {
		System.out.println("Por qual produto ?: " );
		String pr1 = ler.next();
		
		lista.remove(pr);
		lista.add(pr1);
		}
		else {
			System.out.println("Produto não existe no estque !!");
		}
		break;
	default: 	
		System.out.println("Digite uma opção válida!!! ");
		break;
	}
System.out.println("-------------------------------------");
	}while(op != "0");
	

	System.out.println("Fim do programa!!!");
	}
}
