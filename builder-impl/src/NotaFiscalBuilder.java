import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	
    private String razaoSocial;
    private String cnpj;
    private Calendar dataDeEmissao;
    private double valorBruto;
    private double impostos;
    private List<ItemDaNota> itens = new ArrayList<ItemDaNota>();
    public String observacoes;
    
    public NotaFiscal build() {
    	return new NotaFiscal(razaoSocial, cnpj, dataDeEmissao, valorBruto, impostos, itens, observacoes);
    }

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder naDataAtual() {
		this.dataDeEmissao = Calendar.getInstance();
		return this;
	}

	public NotaFiscalBuilder comItem(ItemDaNota item) {
		this.itens.add(item);
		this.valorBruto += item.getValor();
        this.impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

}
