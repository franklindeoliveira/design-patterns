
public class TesteDeImpostos {

	public static void main(String[] args) {
		
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

		calculadora.realizaCalculo(100.0, "icms");
		calculadora.realizaCalculo(100.0, "iss");
		calculadora.realizaCalculo(100.0, "iccc");// novo imposto
	}

}
