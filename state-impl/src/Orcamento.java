public class Orcamento {

	protected double valor;
	protected EstadoDeUmOrcamento estadoAtual; // veja a mudança aqui

	public Orcamento(double valor) {
		this.valor = valor;
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	void aprova() {
		estadoAtual.aprova(this);
	}

	void reprova() {
		estadoAtual.reprova(this);
	}

	void finaliza() {
		estadoAtual.finaliza(this);
	}

}