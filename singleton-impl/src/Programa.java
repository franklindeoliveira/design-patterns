
public class Programa {

	public static void main(String[] args) {
		String cpf = "";/// pega cpf
		
		EmpresaFacade facade = new EmpresaFacadeSingleton().getInstancia();
		
		Cliente cliente = facade.buscaCliente(cpf);
		Fatura fatura = facade.criaFatura(cliente, 100.0);
		Cobranca cobranca = facade.geraCobranca(fatura);
		ContatoCliente contato = facade.fazContato(cliente, cobranca);
	}

}
