package abstract_factory_pattern;

public class ProdutoB1 implements ProdutoAbstratoA, ProdutoAbstratoB{
	@Override
    public void interagir(ProdutoAbstratoA a) {
        System.out.println(this.getClass().getName() + " interage com " + a.getClass().getName());
    }
}
