package POO;

public class cavalo extends animal {

	public cavalo() {
		super("Cavalo");
	}

	@Override
	public void Som(String som) {
		// TODO Auto-generated method stub
	
		System.out.println("Produz um som parecido com : " + som);
	}

	@Override
	public void A��o(String a��o) {
		// TODO Auto-generated method stub
		
		System.out.println("Possui porte de : " + a��o);
	}

	@Override
	public void Idade(int idade) {
		// TODO Auto-generated method stub
		System.out.println("A idade do animal �: "+idade);
		
	}

	@Override
	public void Nome(String nome) {
		// TODO Auto-generated method stub
		System.out.println("O animal atende pelo nome de: " + nome);
		
	}
	

}
