import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import validaciones.ValidaLibrary;
public class NavegadorWeb {

	public static void main(String[] args) {
		//Para ejecutar cada 10 segundos
	ScheduledExecutorService exec =Executors.newSingleThreadScheduledExecutor();
	exec.scheduleAtFixedRate(new Runnable(){
	
	public void run() {
		String sURL=Valida.leer("Introduce URL: ");
		try {
			BrowseURL(sURL);
		} catch (MalformedURLException e) {
			System.out.println("ERROR: " +e.getMessage());
		}
	}
} ,1,10,TimeUnit.SECONDS);

	
	}
	
private static String BrowseURL(String sUrl) throws MalformedURLException {
	URL Url= new URL("http://www." +sUrl+"/");
	
	try {
		//buscar url
		Desktop.getDesktop().browse(Url.toURI());
	} catch (IOException e) {
		System.out.println("ERROR " +e.getMessage());
	}catch (URISyntaxException e) {
		System.out.println("Error al escribir dicha URL " +e.getMessage());
	}
	
	return sUrl;
	
}
}
