import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class TraductorChild {

	public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {
		int iTiempo=  (int) Valida.valida("introduce el tiempo de espera : ", 0, 60, 1);
		String sIdioma=Valida.leer("Introduce idioma de la frase a traducir: ");
		String sIdioma1=Valida.leer("Introduce idioma de la frase traducida: ");
		String sMensaje=Valida.leer("Introduce la frase a traducir: ");
		Thread.sleep(iTiempo*1000);
		
		
		if(sIdioma!="en" ||sIdioma!="es"||sIdioma1!="es"||sIdioma1!="en" || sIdioma==sIdioma1) {
			sIdioma="es";
			sIdioma1="en";
		}
		
		
		try {
			URL Url= new URL("https://translate.google.es/?hl=es#view=home&op=translate&sl="+sIdioma+"&tl="+sIdioma1+"&text="+sMensaje.replace(" ", "%20"));
			Desktop.getDesktop().browse(Url.toURI());
			
		} catch (MalformedURLException e) {
			System.err.println("ERROR:" +e.getMessage());
		}
		
	}
	
	

}
