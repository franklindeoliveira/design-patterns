import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class GoogleMaps implements Mapa {

	@Override
	public String devolveMapa(String endereco) {
		String mapa = "";
		URL google = null;
		try {
			google = new URL("url do servico");
			InputStream stream = google.openStream();
			// le o stream e pega o conteudo
			
			// faz algo com o mapa
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return mapa;
	}

}
