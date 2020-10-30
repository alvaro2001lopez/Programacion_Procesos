

public class Hilo implements Runnable {

	private int iContador;
	private int[] iListaHilo;

	public Hilo(int iContador, int[] iListaHilo) {
		
		setiContador(iContador);
		setiListaHilo(iListaHilo);

	}

	public int getiContador() {
		return iContador;
	}

	public void setiContador(int iContador) {
		this.iContador = iContador;
	}

	public int[] getiListaHilo() {
		return iListaHilo;
	}

	public void setiListaHilo(int[] iListaHilo) {
		this.iListaHilo = iListaHilo;
	}

	@Override
	public void run() {

		getiListaHilo()[iContador] = iContador;

		System.out.println(getiListaHilo()[iContador] );
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
