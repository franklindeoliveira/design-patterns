public class Orcamento {

	public static final int EM_APROVACAO = 1;
	public static final int APROVADO = 2;
	public static final int REPROVADO = 3;
	public static final int FINALIZADO = 4;

	private double valor;
	private int estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		this.estadoAtual = EM_APROVACAO;
	}

	public double getValor() {
		return valor;
	}

	public void aplicaDescontoExtra() {
		if (estadoAtual == EM_APROVACAO)
			valor = valor - (valor * 0.05);
		else if (estadoAtual == APROVADO)
			valor = valor - (valor * 0.02);
		else
			throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
	}
	
	public int getStadoAtual() {
		return this.estadoAtual;
	}
	
	public boolean isEstadoAprovado() {
		return this.estadoAtual == APROVADO;
	}
	
	public boolean isEstadoEmAprovacao() {
		return this.estadoAtual == EM_APROVACAO;
	}
	
	public boolean isEstadoReprovado() {
		return this.estadoAtual == REPROVADO;
	}
	
	public boolean isEstadoFinalizado() {
		return this.estadoAtual == FINALIZADO;
	}
	
	void aprova() {
		if (this.isEstadoAprovado()) {
	        throw new RuntimeException("Orçamento já está em estado de aprovação");
		}
		if (this.isEstadoReprovado()) {
			throw new RuntimeException("Orçamento está em estado de reprovação, não pode aprovar agora!");
		}
		if (this.isEstadoFinalizado()) {
	        throw new RuntimeException("Não posso mudar mais, já estou finalizado!");
		}
		this.estadoAtual = APROVADO;
	}
	
    void reprova() {
    	if (this.isEstadoAprovado()) {
	          throw new RuntimeException("Orçamento está em estado de aprovação e não pode ser reprovado");
		}
    	if (this.isEstadoReprovado()) {
            throw new RuntimeException("Já estou reprovado!");
		}
    	if (this.isEstadoFinalizado()) {
            throw new RuntimeException("Não posso mudar mais, já estou finalizado!");
		}
		this.estadoAtual = REPROVADO;
    }
    
    void finaliza() {
    	if (this.isEstadoEmAprovacao()) {
            // daqui não posso ir direto para finalizado
            throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");
		}
    	if (this.isEstadoFinalizado()) {
            throw new RuntimeException("Não posso mudar mais, já estou finalizado!");
		}
		this.estadoAtual = FINALIZADO;
    }
    
}