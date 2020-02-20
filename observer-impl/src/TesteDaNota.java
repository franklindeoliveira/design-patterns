import java.util.Arrays;

public class TesteDaNota {
	
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder(
				Arrays.asList(new EnviadorDeEmail(), new NotaFiscalDao(), new Multiplicador(0.5)));
		
		builder.paraEmpresa("razao social qualquer")
			   .comCnpj("um cnpj")
			   .comItem(new ItemDaNota("item 1", 100.0))
			   .comItem(new ItemDaNota("item 2", 200.0))
			   .comObservacoes("observacoes quaisquer aqui")
			   .naDataAtual();
		
		NotaFiscal nf = builder.build();
	}

}
