package POO;

public class cliente {

	//Crie uma classe cliente e apresente os atributos e m�todos referentes
	//esta classe, em seguida crie um objeto cliente, defina as instancias deste
	//objeto e apresente as informa��es deste objeto no console.
	
	private String nome;
	private String endere�o;
	private String email;
	private int telefone;
	
	public  cliente(String n, String e, String e1, int t ) {
		this.nome =n;
		this.endere�o =e;
		this.email = e1;
		this.telefone =t;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
}
