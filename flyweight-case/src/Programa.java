import java.util.Arrays;
import java.util.List;

public class Programa {
	
	public static void main(String[] args) {
		
		List<Nota> musica = Arrays.asList(
				new Do(), 
				new Re(), 
				new Mi(), 
				new Fa(), 
				new Fa(), 
				new Fa());
		
		System.out.println(musica);
	}

}
