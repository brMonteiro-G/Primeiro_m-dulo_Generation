package POO;

public class fornecedor extends pessoa {
//	Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe
//	Fornecedor. Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos
//	que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao cr�dito
///	m�ximo atribu�do ao fornecedor) e valorDivida (montante da d�vida para com o fornecedor).
//Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores e modificadores,
//	um m�todo obterSaldo() que devolve a diferen�a entre os valores dos atributos valorCredito e
//	valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste
//	adequado que lhe permita verificar o funcionamento dos m�todos implementados na classe
//	Fornecedor e os herdados da classe Pessoa.
	
	private double valorCr�dito;
	private double valorDivida;
	
	public fornecedor(String Nome, String Telefone, String Endere�o, int Rg ) {
		super("Nome","Telefone", "Endere�o", Rg);
		
	}
	
	public double valorContas(double valorDivida, double valorCr�dito) {
		this.valorDivida = valorDivida;
		this.valorCr�dito = valorCr�dito;
		double resultado=0;
		resultado = (valorCr�dito - valorDivida);
		System.out.println("O saldo resultante � de :" + resultado );
		if(resultado<0) {
			System.out.println("Voc� est� devendo !!!");
		}
		else {
			System.out.println("Voc� est� em dia com suas finan�as !!!");
		}
		return(resultado);
	}

	public double getValorCr�dito() {
		return valorCr�dito;
	}

	public void setValorCr�dito(double valorCr�dito) {
		this.valorCr�dito = valorCr�dito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
}
