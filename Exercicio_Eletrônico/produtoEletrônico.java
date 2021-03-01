package POO;

public class produtoEletrônico {
	
	
	public float preço;
	public String descrição;
	public String produto;
	private int estoque;
	
	public produtoEletrônico(float p, String d, int e, String pr) {
		
		preço = p;
		descrição = d;
		estoque = e;
		produto = pr;
	}

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}

	public String getDescrição() {
		
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public int getEstoque() {
		
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getProduto() {
		switch(produto) {
		case "Diodo":
			System.out.println("5,00R$");
			System.out.println("Descrição: O diodo é um semicondutor com dois terminais que conduz corrente elétrica em somente um sentido ");
			break;
		case "Resistor": 
			System.out.println("10,00R$");
			System.out.println("Descrição: O resistor é um componente elétrico passivo que tem a função primária de limitar o fluxo da corrente elétrica em um circuito.");
			break;
		case "Solenoide":
			System.out.println("15,00R$");
			System.out.println("Descrição: O solenóide pode ser utilizado como uma válvula eletromecânica controlada");
			break;
		
		default:
			System.out.println("Produto inválido");
			break;
		}	
		
		return produto;
	}

	public void setProduto(String produto) {
		
		this.produto = produto;
	}
	

}
