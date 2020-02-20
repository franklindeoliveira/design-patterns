
public class TesteDeImpostos {

	public static void main(String[] args) {
		
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		Orcamento orcamento = new Orcamento(100.0);

		calculadora.realizaCalculo(orcamento, new Iss());
		calculadora.realizaCalculo(orcamento, new Icms());
		calculadora.realizaCalculo(orcamento, new Iccc());
		calculadora.realizaCalculo(orcamento, new Icpp());// novo imposto
		calculadora.realizaCalculo(orcamento, new Ikcv());// novo imposto
	}

}
