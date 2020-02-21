
public class Programa {
	
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();

		// (10-5) + (2+10)
		int esquerda = calculadora.subtracao(10, 5);
		int direita = calculadora.soma(2, 10);
		
		int conta = calculadora.soma(esquerda, direita);
		
		System.out.println(conta);
		
	}

}
