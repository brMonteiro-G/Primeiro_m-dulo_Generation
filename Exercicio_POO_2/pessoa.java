package POO;

public class pessoa {
	//Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
	//(getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas
	//opções de construtores conforme sua percepção. Atributos: String nome; String endereço;
	//String telefone;
	
	public String Nome;
	private String Endereço;
	public String Telefone;
	private int Rg;
	
	public pessoa(String Nome, String Endereço,String Telefone, int Rg) {
		super();
		this.Nome = Nome;
		this.Endereço = Endereço;
		this.Telefone = Telefone;
		this.Rg = Rg;
	}
	
	

	public void dadosPrincipais (String Nome, int Rg) {
		
		this.Nome = Nome;
		this.Rg = Rg;
		
		System.out.println(" Nome: " + Nome + "\n Rg:" + Rg);
		
	}
	
	public void contato(String Endereço, String Telefone) {
		
		this.Endereço = Endereço;
		this.Telefone= Telefone;
		System.out.println(" Endereço: " + Endereço + "\n Telefone:" + Telefone);
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEndereço() {
		return Endereço;
	}

	public void setEndereço(String endereço) {
		Endereço = endereço;
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
