import java.io.IOException;

public class Programa {
	
	public static void main(String[] args) throws IOException {
		// regra de negocio

		// obtem mapas de servicos externos
		
		//google
		// chamada REST
		Mapa mapa1 = new GoogleMaps();
		String endereco1 = mapa1.devolveMapa("avenida paulista");

		//maplink
		// chamada SOAP
		Mapa mapa2 = new MapLink();
		String endereco2 = mapa2.devolveMapa("avenida paulista");
		
	}

}
