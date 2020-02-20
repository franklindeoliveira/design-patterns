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
			throw new RuntimeException("Or�amentos reprovados n�o recebem desconto extra!");
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
	        throw new RuntimeException("Or�amento j� est� em estado de aprova��o");
		}
		if (this.isEstadoReprovado()) {
			throw new RuntimeException("Or�amento est� em estado de reprova��o, n�o pode aprovar agora!");
		}
		if (this.isEstadoFinalizado()) {
	        throw new RuntimeException("N�o posso mudar mais, j� estou finalizado!");
		}
		this.estadoAtual = APROVADO;
	}
	
    void reprova() {
    	if (this.isEstadoAprovado()) {
	          throw new RuntimeException("Or�amento est� em estado de aprova��o e n�o pode ser reprovado");
		}
    	if (this.isEstadoReprovado()) {
            throw new RuntimeException("J� estou reprovado!");
		}
    	if (this.isEstadoFinalizado()) {
            throw new RuntimeException("N�o posso mudar mais, j� estou finalizado!");
		}
		this.estadoAtual = REPROVADO;
    }
    
    void finaliza() {
    	if (this.isEstadoEmAprovacao()) {
            // daqui n�o posso ir direto para finalizado
            throw new RuntimeException("Orcamento em aprova��o n�o podem ir para finalizado diretamente");
		}
    	if (this.isEstadoFinalizado()) {
            throw new RuntimeException("N�o posso mudar mais, j� estou finalizado!");
		}
		this.estadoAtual = FINALIZADO;
    }
    
}