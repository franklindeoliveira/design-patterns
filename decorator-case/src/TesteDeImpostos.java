
public class TesteDeImpostos {

	public static void main(String[] args) {
		
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		Orcamento orcamento = new Orcamento(100.0);

		calculadora.realizaCalculo(orcamento, new IssComIcms());
		
	}

}
