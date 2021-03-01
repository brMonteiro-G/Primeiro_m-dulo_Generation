package POO;
import java.util.Scanner;
public class avião_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler = new Scanner(System.in);
        String f; 
        float n;
        int a;
        
      System.out.println("Bem vindo ao cadastro do mecânico de aviões ");
  	  System.out.println(" ");
  	  System.out.println("Digite o fabricante:  ");
  	  f = ler.nextLine();
  	  System.out.println("\nDigite o número de série:  ");
  	  n= ler.nextFloat();
  	 
	  
  	  System.out.println("\nDigite a idade do avião:  ");
  	  a = ler.nextInt();
  	  while(a<0 || a>100) {
		System.out.println("Digite uma idade válida ");
		a = ler.nextInt();
	    }
  	  
  	  avião airplane = new avião(f,n,a);
  	  
  	  
  	  System.out.println(" Avião cadastrado com sucesso ");
  	  System.out.println(" Fabricante: " + airplane.getFabricante() + "\n Nº de Série: "+ airplane.getNumSérie() + "\n Laudo " + airplane.getAnos());
  	  
	}

}
