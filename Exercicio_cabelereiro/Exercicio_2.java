package POO;

public class Exercicio_2 {
	
	private String tipo_de_cabelo;
	private String corte;
	private String penteado; 
	
	public Exercicio_2 (String x,String y, String z)
	{
		this.tipo_de_cabelo = x;
		this.corte = y;
		this.penteado = z; 
	}
	

	public String getTipoCabelo() {
		return tipo_de_cabelo;
	}

	public void settipoCabelo(String tipo_de_cabelo) {
		this.tipo_de_cabelo = tipo_de_cabelo;
	}

	public String getCorte() {
		return corte;
	}

	public void setCorte(String corte) {
		this.corte = corte;
	}
	public String getPenteado() {
		return penteado;
	}

	public void setPenteado(String penteado) {
		this.penteado = penteado;
	}
	
}