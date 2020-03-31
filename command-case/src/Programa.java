
public class Programa {
	
	public static void main(String[] args) {
		Pedido pedido1 = new Pedido("Mauricio", 150.0);
        Pedido pedido2 = new Pedido("Marcelo", 250.0);

        pedido1.paga();
        pedido2.paga();
        pedido1.finaliza();

	}

}
