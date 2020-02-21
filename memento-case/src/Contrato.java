import java.util.Calendar;

public class Contrato {
	
	private Calendar data;
    private String cliente;
    private TipoContrato tipo;

    public Contrato(Calendar data, String cliente, TipoContrato tipo) {
        this.data = data;
        this.cliente = cliente;
        this.tipo = tipo;
    }

    public Calendar getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public TipoContrato getTipo() {
		return tipo;
	}
	
	public void setData(Calendar data) {
		this.data = data;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void setTipo(TipoContrato tipo) {
		this.tipo = tipo;
	}
	
	public Contrato salvaEstado() {
        return new Contrato(this.data, this.cliente, this.tipo);
    }

	public void avanca() {
        if(tipo == TipoContrato.NOVO) tipo = TipoContrato.EM_ANDAMENTO;
        else if(tipo == TipoContrato.EM_ANDAMENTO) tipo = TipoContrato.ACERTADO;
        else if(tipo == TipoContrato.ACERTADO) tipo = TipoContrato.CONCLUIDO;
    }

}
