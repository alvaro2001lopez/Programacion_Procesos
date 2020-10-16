import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;



public class EjecutaBat {

	public static void main(String[] args) {
		String sUrl="Recuresos\\ejecuta.bat";
		try {
			EjectComand(sUrl);
			
		} catch (IOException e) {
			String Error="Error " +e.getMessage();
			System.err.println(Error);
			try {
				BufferedReader ReadBat =new BufferedReader(new InputStreamReader(System.in));
				FileWriter WrtUbiError=new FileWriter("SOLUCION\\ErrorBat.txt");
				BufferedWriter writeFchError= new BufferedWriter(WrtUbiError);
				
				writeFchError.write(Error);
				
				ReadBat.close();
				
				writeFchError.close();
				
				
			} catch (IOException e1) {
				System.err.println("Error "+e.getMessage());
			}
			
		}
	}

	private static void EjectComand(String sUrl) throws IOException {
		
		String fchLine = "";
		
		//crear proceso
		Process P= Runtime.getRuntime().exec(sUrl);
		//Leer el proceso de Ejecuta.bat
		BufferedReader ReadBat =new BufferedReader(new InputStreamReader(P.getInputStream()));
		
		//Indicar la ruta del archivo nuevo y escribir en el archivo.
		FileWriter WrtUbi=new FileWriter("SOLUCION\\salidaBat.txt");
		BufferedWriter writeFch= new BufferedWriter(WrtUbi);
		//
		while (ReadBat.readLine() != null) {
			fchLine=ReadBat.readLine();
			writeFch.write(fchLine+"\n");
		}
		ReadBat.close();
		
		writeFch.close();
		
		
	}

	
}
