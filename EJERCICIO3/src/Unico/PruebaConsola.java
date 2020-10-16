package Unico;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PruebaConsola {

	public static void main(String[] args) throws IOException, InterruptedException {
		//EJERCICIO 3 y 4
		String content= args[0];
		
		File file= new File(content);
		
		List<String> jvmArgs = new ArrayList<>();
		List<String> argsM = new ArrayList<>();
		
		if (file.exists()) {
			if(file.isDirectory()) {
				argsM.add(content);
				Process p= JavaProcess.exec(VisualizarArchivo.class,jvmArgs,argsM);
				System.out.println(p.exitValue());
			}else {
				argsM.add(content);
				Process p= JavaProcess.exec(ListarDirectorios.class, jvmArgs, argsM);
				System.out.println(p.exitValue());
			}
			
		}else {
			System.out.println("ERROR.");
		}
		System.out.println(content);
	}

}
