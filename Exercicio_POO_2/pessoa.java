package POO;

public class pessoa {
	//Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
	//(getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas
	//op��es de construtores conforme sua percep��o. Atributos: String nome; String endere�o;
	//String telefone;
	
	public String Nome;
	private String Endere�o;
	public String Telefone;
	private int Rg;
	
	public pessoa(String Nome, String Endere�o,String Telefone, int Rg) {
		super();
		this.Nome = Nome;
		this.Endere�o = Endere�o;
		this.Telefone = Telefone;
		this.Rg = Rg;
	}
	
	

	public void dadosPrincipais (String Nome, int Rg) {
		
		this.Nome = Nome;
		this.Rg = Rg;
		
		System.out.println(" Nome: " + Nome + "\n Rg:" + Rg);
		
	}
	
	public void contato(String Endere�o, String Telefone) {
		
		this.Endere�o = Endere�o;
		this.Telefone= Telefone;
		System.out.println(" Endere�o: " + Endere�o + "\n Telefone:" + Telefone);
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEndere�o() {
		return Endere�o;
	}

	public void setEndere�o(String endere�o) {
		Endere�o = endere�o;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public int getRg() {
		return Rg;
	}

	public void setRg(int rg) {
		Rg = rg;
	}
	
}
