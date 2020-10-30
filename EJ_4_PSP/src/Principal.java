import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int NUMTHREADS = 3;
		int iContador = 0;
		
		
		ArrayList<Thread> listThreads = new ArrayList<Thread>();
		ArrayList<Hilo> listRunnables = new ArrayList<Hilo>();

		// Creando runnables
		for (iContador = 0; iContador < NUMTHREADS; iContador++) {
			System.out.println("Creando runnable " + iContador + ".");
			listRunnables.add(new Hilo(args[iContador],iContador));
		}
		// Creando hilos
		for (iContador = 0; iContador < NUMTHREADS; iContador++) {
			System.out.println("Creando el hilo " + iContador + ".");
			
			listThreads.add(new Thread(new Hilo(args[iContador],iContador)));
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Iniciando los hilos y joins
		for (iContador = 0; iContador < NUMTHREADS; iContador++) {
			listThreads.get(iContador).start();
			try {
				listThreads.get(iContador).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}

}
