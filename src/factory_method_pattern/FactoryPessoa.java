package factory_method_pattern;

public class FactoryPessoa {
	public Pessoa getPessoa(String nome, String sexo) {
		if (sexo.equals("M")) {
			return new Homem(nome);
		}
		if (sexo.equals("F")) {
			return new Mulher(nome);
		}
		else {
			return null;
		}
	}
}