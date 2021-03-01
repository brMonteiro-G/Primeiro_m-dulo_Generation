package POO;
import java.util.Scanner;
public class cliente_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner ler = new Scanner(System.in);
       String n,e,e1;
       int t;
       
	  System.out.println("Bem vindo ao cadastro da Generation ");
	  System.out.println(" ");
	  System.out.println("Digite seu nome");
	  n = ler.nextLine();
	  System.out.println("\nDigite seu endereço ");
	  e= ler.nextLine();
	  System.out.println("\nDigite seu email");
	  e1 = ler.next();
	  System.out.println("\nDigite seu telefone ");
	  t= ler.nextInt();
	  
	  cliente cl = new cliente(n,e,e1,t);
	  
	  
	  System.out.println(" Cliente cadastrado com sucesso ");
	  System.out.println(" Nome: " + cl.getNome() + "\n Endereço: "+ cl.getEndereço() + " \n Email: " + cl.getEmail()+ "\n Telefone: " + cl.getTelefone());
	  
	  		
		
	}

}
