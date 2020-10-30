import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		final int NUMTHREADS = 5;
		ArrayList<Thread> listThreads = new ArrayList<Thread>();
		ArrayList<Hilo> listRunnables = new ArrayList<Hilo>();
		ArrayList<Integer> iLista = new ArrayList<Integer>();
		
		int[] ListaHilo = {4 , 3, 2, 1, 0 };
		int iContador = 0;
		
		// Creando hilos
		for (iContador = 0; iContador < NUMTHREADS; iContador++) {
			System.out.println("Creando el hilo " + iContador + ".");
			listThreads.add(new Thread(new Hilo(iContador, ListaHilo)));
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Creando runnables
		for(iContador=0; iContador < NUMTHREADS ; iContador++) {
		    System.out.println("Creando runnable "+iContador+".");
		    listRunnables.add(new Hilo(iContador,ListaHilo));
		}

		// Iniciando los hilos
		for (iContador = 0; iContador < NUMTHREADS; iContador++) {
			listThreads.get(iContador).start();
		}
		

		
		// Joins
		for(iContador=0; iContador < NUMTHREADS ; iContador++) {
		    try {
			listThreads.get(iContador).join();
		    } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		}	
		Hilo h1=listRunnables.get(0);

		for (int iContador1 = 0; iContador1 < ListaHilo.length; iContador1++) {
			iLista.add(h1.getiListaHilo()[iContador1]);
		}
		System.out.print(iLista);
		

	}

}
