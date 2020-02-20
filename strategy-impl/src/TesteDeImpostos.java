
public class TesteDeImpostos {

	public static void main(String[] args) {
		
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

		calculadora.realizaCalculo(100.0, new Iss());
		calculadora.realizaCalculo(100.0, new Icms());
		calculadora.realizaCalculo(100.0, new Iccc());// novo imposto
	}

}
