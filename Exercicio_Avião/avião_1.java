package POO;
import java.util.Scanner;
public class avi�o_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler = new Scanner(System.in);
        String f; 
        float n;
        int a;
        
      System.out.println("Bem vindo ao cadastro do mec�nico de avi�es ");
  	  System.out.println(" ");
  	  System.out.println("Digite o fabricante:  ");
  	  f = ler.nextLine();
  	  System.out.println("\nDigite o n�mero de s�rie:  ");
  	  n= ler.nextFloat();
  	 
	  
  	  System.out.println("\nDigite a idade do avi�o:  ");
  	  a = ler.nextInt();
  	  while(a<0 || a>100) {
		System.out.println("Digite uma idade v�lida ");
		a = ler.nextInt();
	    }
  	  
  	  avi�o airplane = new avi�o(f,n,a);
  	  
  	  
  	  System.out.println(" Avi�o cadastrado com sucesso ");
  	  System.out.println(" Fabricante: " + airplane.getFabricante() + "\n N� de S�rie: "+ airplane.getNumS�rie() + "\n Laudo " + airplane.getAnos());
  	  
	}

}
