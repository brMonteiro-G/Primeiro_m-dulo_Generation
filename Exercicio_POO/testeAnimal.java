package POO;
import java.util.Scanner;
public class testeAnimal  {
	public static void main(String[] args) {
	cavalo cav = new cavalo();
	cachorro cac = new cachorro();
	pregui�a pre = new pregui�a();
	Scanner ler = new Scanner(System.in);
	String op;
		
	
	
	System.out.println("informe o animal.." );
	op = ler.next();
	switch (op) {
	case "Cavalo":
	 cav.Idade(25) ; cav.A��o("Corredor") ; cav.Nome("Pangar�") ; cav.Som("pocot�...pocot�");
		
		break;
	case "Cachorro": 
		
		 cac.Idade(13) ; cac.A��o("Corredor") ; cac.Nome("Rex") ; cac.Som("Auauau...auauau");
		break;
	case "Pregui�a":
		
		 pre.Idade(9) ; pre.A��o("Escalador") ; pre.Nome("Sid cidoso") ; pre.Som("Anhrrr...anhrrrr");
		 break;
    	
	
	default:
		System.out.println("Digite uma op��o v�lida: ");
	
	
	}
}
}