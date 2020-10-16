import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import validaciones.ValidaLibrary;

public class Aleatorios {

	public static void main(String[] args) throws IOException, InterruptedException {
		int bOpcion = 0;
		
		do {
			bOpcion=  (int) Valida.valida("introduce Una opcion: ", 1, 2, 1);
			
			
			if(bOpcion==1) {
				List<String> jvmArgs = new ArrayList<>();
				List<String> argsM = new ArrayList<>();
				Process P=JavaProcess.exec(GeneradorAleatorios.class, jvmArgs, argsM);
				P.exitValue();
				System.out.println("Ejecutar de nuevo");
				System.out.println("Salir del proceso");
			}else {
				System.out.println("FIN DEL PROCESO");
			}
			
			
		}while(bOpcion!=2);
		
		

	}

}
