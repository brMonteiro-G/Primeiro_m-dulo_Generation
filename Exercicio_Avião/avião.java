package POO;

public class avi�o {
//	Crie uma classe avi�o e apresente os atributos e m�todos referentes
//	esta classe, em seguida crie um objeto avi�o, defina as instancias deste
//	objeto e apresente as informa��es deste objeto no console.
	
	private String fabricante;
	private float numS�rie;
	private int anos;
	
	
	public avi�o (String f, float n , int a   ) {
		fabricante = f;
		numS�rie = n ;
		anos = a;
	
	}

	public String getFabricante() {
		
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public float getNumS�rie() {
		return numS�rie;
	}

	public void setNumS�rie(float numS�rie) {
		this.numS�rie = numS�rie;
	}

	public int getAnos() {
		if( anos<15) {
			
			System.out.println(" 5 dias de repara��o");
			System.out.println(" Encaminhar para hangar de manuten��o ");		
		}
		else  {
			System.out.println(" 10 dias de repara��o");
			System.out.println(" Encaminhar para hangar de manuten��o ");
		}
		
		anos=1; 
		
		return anos;
	}

	public void setAnos(int anos) {
		
		this.anos = anos;
	}
	
	


}
