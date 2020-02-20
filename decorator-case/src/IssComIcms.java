
public class IssComIcms implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + new Icms().calcula(orcamento);
	}

}
