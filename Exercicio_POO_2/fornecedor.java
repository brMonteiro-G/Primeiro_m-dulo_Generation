package POO;

public class fornecedor extends pessoa {
//	Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe
//	Fornecedor. Considere que cada instância da classe Fornecedor tem, para além dos atributos
//	que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao crédito
///	máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor).
//Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores,
//	um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e
//	valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste
//	adequado que lhe permita verificar o funcionamento dos métodos implementados na classe
//	Fornecedor e os herdados da classe Pessoa.
	
	private double valorCrédito;
	private double valorDivida;
	
	public fornecedor(String Nome, String Telefone, String Endereço, int Rg ) {
		super("Nome","Telefone", "Endereço", Rg);
		
	}
	
	public double valorContas(double valorDivida, double valorCrédito) {
		this.valorDivida = valorDivida;
		this.valorCrédito = valorCrédito;
		double resultado=0;
		resultado = (valorCrédito - valorDivida);
		System.out.println("O saldo resultante é de :" + resultado );
		if(resultado<0) {
			System.out.println("Você está devendo !!!");
		}
		else {
			System.out.println("Você está em dia com suas finanças !!!");
		}
		return(resultado);
	}

	public double getValorCrédito() {
		return valorCrédito;
	}

	public void setValorCrédito(double valorCrédito) {
		this.valorCrédito = valorCrédito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
}
