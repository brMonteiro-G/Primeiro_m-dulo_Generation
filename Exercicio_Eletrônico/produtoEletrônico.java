package POO;

public class produtoEletr�nico {
	
	
	public float pre�o;
	public String descri��o;
	public String produto;
	private int estoque;
	
	public produtoEletr�nico(float p, String d, int e, String pr) {
		
		pre�o = p;
		descri��o = d;
		estoque = e;
		produto = pr;
	}

	public float getPre�o() {
		return pre�o;
	}

	public void setPre�o(float pre�o) {
		this.pre�o = pre�o;
	}

	public String getDescri��o() {
		
		return descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
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
			System.out.println("Descri��o: O diodo � um semicondutor com dois terminais que conduz corrente el�trica em somente um sentido ");
			break;
		case "Resistor": 
			System.out.println("10,00R$");
			System.out.println("Descri��o: O resistor � um componente el�trico passivo que tem a fun��o prim�ria de limitar o fluxo da corrente el�trica em um circuito.");
			break;
		case "Solenoide":
			System.out.println("15,00R$");
			System.out.println("Descri��o: O solen�ide pode ser utilizado como uma v�lvula eletromec�nica controlada");
			break;
		
		default:
			System.out.println("Produto inv�lido");
			break;
		}	
		
		return produto;
	}

	public void setProduto(String produto) {
		
		this.produto = produto;
	}
	

}
