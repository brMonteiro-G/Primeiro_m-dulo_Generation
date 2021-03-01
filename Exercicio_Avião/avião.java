package POO;

public class avião {
//	Crie uma classe avião e apresente os atributos e métodos referentes
//	esta classe, em seguida crie um objeto avião, defina as instancias deste
//	objeto e apresente as informações deste objeto no console.
	
	private String fabricante;
	private float numSérie;
	private int anos;
	
	
	public avião (String f, float n , int a   ) {
		fabricante = f;
		numSérie = n ;
		anos = a;
	
	}

	public String getFabricante() {
		
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public float getNumSérie() {
		return numSérie;
	}

	public void setNumSérie(float numSérie) {
		this.numSérie = numSérie;
	}

	public int getAnos() {
		if( anos<15) {
			
			System.out.println(" 5 dias de reparação");
			System.out.println(" Encaminhar para hangar de manutenção ");		
		}
		else  {
			System.out.println(" 10 dias de reparação");
			System.out.println(" Encaminhar para hangar de manutenção ");
		}
		
		anos=1; 
		
		return anos;
	}

	public void setAnos(int anos) {
		
		this.anos = anos;
	}
	
	


}
