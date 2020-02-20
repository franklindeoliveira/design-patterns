public class TesteDeDescontos {
	public static void main(String[] args) {

		CalculadorDeDescontos descontos1 = new CalculadorDeDescontos();
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPISs", 250.0));
		double descontoFinal = descontos1.calcula(orcamento);
		System.out.println(descontoFinal);

		CalculadorDeDescontos descontos2 = new CalculadorDeDescontos();
		Orcamento orcamento2 = new Orcamento(500.0);
		orcamento2.adicionaItem(new Item("CANETA", 250.0));
		orcamento2.adicionaItem(new Item("LAPISs", 250.0));
		double descontoFinal2 = descontos2.calcula(orcamento2);
		System.out.println(descontoFinal2);
	}

}
