
public class CalculadorDeDescontos {
	
	public double calcula(Orcamento orcamento) {
		// verifica primeira regra de poss�vel desconto
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}

		// verifica segunda regra de poss�vel desconto
		else if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		}
		
		// verifica terceira, quarta, quinta regra de poss�vel desconto ...
		// um monte de ifs daqui pra baixo
		
		return 0;
	}
}