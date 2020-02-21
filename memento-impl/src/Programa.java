import java.util.Calendar;

public class Programa {
	
	public static void main(String[] args) {
        Historico historico = new Historico();

        Contrato contrato = new Contrato(Calendar.getInstance(), "Franklin", TipoContrato.NOVO);
        historico.adiciona(contrato.salvaEstado());
        
        System.out.println(contrato.getTipo());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());
        
        System.out.println(contrato.getTipo());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());

        System.out.println(contrato.getTipo());
        
        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());
        
        System.out.println(contrato.getTipo());
        
        // restaura um contrato
        contrato.restaura(historico.pega(0));
        
        System.out.println(contrato.getTipo());
        
	}

}
