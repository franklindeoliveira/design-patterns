
public class Programa {

	public static void main(String[] args) {
		String cpf = "";/// pega cpf
		
		Cliente cliente = new ClienteDao().buscaPorCpf(cpf);

		Fatura fatura = new Fatura(cliente, 100.0);

		Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);
		cobranca.emite();

		ContatoCliente contato = new ContatoCliente(cliente, cobranca);
		contato.dispara();
	}

}
