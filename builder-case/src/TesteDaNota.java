import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteDaNota {
	
	public static void main(String[] args) {
        List<ItemDaNota> itens = Arrays.asList(new ItemDaNota("item 1", 100.0), new ItemDaNota("item 2", 200.0));
        double valorTotal = 0;
        for(ItemDaNota item : itens) {
          valorTotal += item.getValor();
        }
        double impostos = valorTotal * 0.05;

        NotaFiscal nf = new NotaFiscal("razao social qualquer", "um cnpj", Calendar.getInstance(), valorTotal, impostos, itens, "observacoes quaisquer aqui");
      }

}
