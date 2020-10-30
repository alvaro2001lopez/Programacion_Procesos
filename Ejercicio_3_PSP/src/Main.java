import java.awt.dnd.DropTargetListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		final int NUMTHREADS = 5;
		ArrayList<Thread> listThreads = new ArrayList<Thread>();
		ArrayList<Hilo> listRunnables = new ArrayList<Hilo>();
		int[] ListaHilo = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		int iContador = 0;

		// Creando hilos
		for (iContador = 0; iContador < NUMTHREADS; iContador++) {
			System.out.println("Creando el hilo " + iContador + ".");
			listThreads.add(new Thread(new Hilo(ListaHilo, iContador)));
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Creando runnables
		for (iContador = 0; iContador < NUMTHREADS; iContador++) {
			System.out.println("Creando runnable " + iContador + ".");
			listRunnables.add(new Hilo(ListaHilo, iContador));
		}

		// Iniciando los hilos
		for (iContador = 0; iContador < NUMTHREADS; iContador++) {

			Hilo h1 = listRunnables.get(iContador);
			ArrayList<Integer> iLista = new ArrayList<Integer>();
			for (int iContador1 = 0; iContador1 < h1.getListaHilo().length; iContador1++) {

				iLista.add(h1.getListaHilo()[iContador1]);
			}
			
			System.out.println("Antes de la ejecucion del hilo "+iContador+": "+iLista);

			listThreads.get(iContador).start();

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		String sSistOperativo= Sistema.getSistemaOperativo();
		if(sSistOperativo.equals("win")) {
			String comando="cmd /c tasklist";
			try {
				Process proceso= Runtime.getRuntime().exec(comando);
				
				BufferedReader BR= new BufferedReader(new InputStreamReader(proceso.getInputStream(),StandardCharsets.UTF_8));
				
				System.out.println("\n Ejecucion de Threads \n");
				
				String LeerLinea= BR.readLine();
				
				
				
				while (LeerLinea!=null) {
					LeerLinea= BR.readLine();
					System.out.println(LeerLinea);
					
				}
				
				BR.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}else if(sSistOperativo.equals("uni")) {
			String comando="cat ps";
			try {
				Process proceso= Runtime.getRuntime().exec(comando);
				
				BufferedReader BR= new BufferedReader(new InputStreamReader(proceso.getInputStream(),StandardCharsets.UTF_8));
				
				System.out.println("\n Ejecucion de Threads \n");
				
				String LeerLinea= BR.readLine();
				
				
				
				while (LeerLinea!=null) {
					LeerLinea= BR.readLine();
					System.out.println(LeerLinea);
					
				}
				
				BR.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.err.println("ERROR EL SISTEMA OPERATIVO NO ES NI LINUX NI WINDOWS");
		}

		// Joins
		for (iContador = 0; iContador < NUMTHREADS; iContador++) {
			try {
				listThreads.get(iContador).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		

	}

}
