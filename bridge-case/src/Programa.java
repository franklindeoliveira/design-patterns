import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Programa {
	
	public static void main(String[] args) throws IOException {
		// regra de negocio

		// obtem mapas de um servico externo
		
		//google
		// chamada REST
		URL google = new URL("url do google");
		InputStream stream = google.openStream();
		// le o stream e pega o conteudo

		// faz algo com o mapa
		
		//maplink
		// chamada SOAP
	}

}
