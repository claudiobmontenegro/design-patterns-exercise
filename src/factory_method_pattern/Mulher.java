package factory_method_pattern;

public class Mulher extends Pessoa {

	public Mulher(String nome) {
		this.nome = nome;
		System.out.println("Ol� Senhora " + this.nome);
	}
}
