
public class Reprovado implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos reprovados n�o recebem desconto extra!");
	}

	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento est� em estado de reprova��o, n�o pode aprovar agora!");
	}

	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("J� estou reprovado!");
	}

	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}
}
