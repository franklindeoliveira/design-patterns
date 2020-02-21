import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Programa {
	
	public static void main(String[] args) {
		List<Contrato> contratosSalvos = new ArrayList<>();

        Contrato contrato = new Contrato(Calendar.getInstance(), "Franklin", TipoContrato.NOVO);
        contratosSalvos.add(new Contrato(contrato.getData(), contrato.getCliente(), contrato.getTipo()));
        
        System.out.println(contrato.getTipo());

        contrato.avanca();
        contratosSalvos.add(new Contrato(contrato.getData(), contrato.getCliente(), contrato.getTipo()));
        
        System.out.println(contrato.getTipo());

        contrato.avanca();
        contratosSalvos.add(new Contrato(contrato.getData(), contrato.getCliente(), contrato.getTipo()));

        System.out.println(contrato.getTipo());
        
        contrato.avanca();
        contratosSalvos.add(new Contrato(contrato.getData(), contrato.getCliente(), contrato.getTipo()));
        
        System.out.println(contrato.getTipo());
        
     // restaura um contrato
        Contrato contratoAnterior = contratosSalvos.get(0);
        contrato.setData(contratoAnterior.getData());
        contrato.setCliente(contratoAnterior.getCliente());
        contrato.setTipo(contratoAnterior.getTipo());
        
        System.out.println(contrato.getTipo());
        
	}

}
