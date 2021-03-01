package POO;

abstract class animal {
//	Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
//  comportamentos, utilize os seus conhecimentos e distribua as
//	características de forma que tudo o que for comum a todos os animais fique na classe
//	Animal:
	
	public String tipoAnimal;
	
	public  animal(String tipoAnimal ) {
		this.tipoAnimal = tipoAnimal;
		
	}
	
	abstract public void Som(String som);
	abstract public void Ação(String ação );
	abstract public void Idade( int idade);
	abstract public void Nome(String nome);

	public String getTipoAnimal() {
		return tipoAnimal; //puxa o valor do sistema
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal; // atributo igual ao valor inserido (set)
	}
	
	

}
