package factory_method_pattern;

public class Demonstration {

	public static void main(String[] args) {
		
		FactoryPessoa factory = new FactoryPessoa();
		String nome = "Cl�udio";
		String sexo = "M";
		factory.getPessoa(nome, sexo);
	}

}
