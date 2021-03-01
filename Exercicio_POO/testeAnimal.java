package POO;
import java.util.Scanner;
public class testeAnimal  {
	public static void main(String[] args) {
	cavalo cav = new cavalo();
	cachorro cac = new cachorro();
	preguiça pre = new preguiça();
	Scanner ler = new Scanner(System.in);
	String op;
		
	
	
	System.out.println("informe o animal.." );
	op = ler.next();
	switch (op) {
	case "Cavalo":
	 cav.Idade(25) ; cav.Ação("Corredor") ; cav.Nome("Pangaré") ; cav.Som("pocotó...pocotó");
		
		break;
	case "Cachorro": 
		
		 cac.Idade(13) ; cac.Ação("Corredor") ; cac.Nome("Rex") ; cac.Som("Auauau...auauau");
		break;
	case "Preguiça":
		
		 pre.Idade(9) ; pre.Ação("Escalador") ; pre.Nome("Sid cidoso") ; pre.Som("Anhrrr...anhrrrr");
		 break;
    	
	
	default:
		System.out.println("Digite uma opção válida: ");
	
	
	}
}
}