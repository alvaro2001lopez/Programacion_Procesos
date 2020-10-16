package Unico;

import java.util.List;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VisualizarArchivo {

	public static void main(String[] args) {
		//consigue la ruta
		Path path= Paths.get(args[0]);
		String content=null;
		try {
			//lee los ficheros de la ruta dada por el usuario
			
			List<String> lines= Files.readAllLines(path, StandardCharsets.UTF_8);
			content= String.join(System.lineSeparator(),lines);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(content);
	}

}
