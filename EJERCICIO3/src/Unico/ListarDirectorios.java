package Unico;

import java.io.File;

public class ListarDirectorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f= new File(args[0]);
		
		for(int x=0;x<f.list().length;x++) {
			System.out.println(f.list()[x]);
		}
	
	
	}

}
