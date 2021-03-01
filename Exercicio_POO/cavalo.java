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
	public void Ação(String ação) {
		// TODO Auto-generated method stub
		
		System.out.println("Possui porte de : " + ação);
	}

	@Override
	public void Idade(int idade) {
		// TODO Auto-generated method stub
		System.out.println("A idade do animal é: "+idade);
		
	}

	@Override
	public void Nome(String nome) {
		// TODO Auto-generated method stub
		System.out.println("O animal atende pelo nome de: " + nome);
		
	}
	

}
