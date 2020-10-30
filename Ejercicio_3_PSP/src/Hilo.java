
public class Hilo implements Runnable {

	
	private int[] ListaHilo;
	private int iContador;
	
	public Hilo(int[] listaHilo, int iContador) {
		setiContador(iContador);
		setListaHilo(listaHilo);
	}
	

	public int[] getListaHilo() {
		return ListaHilo;
	}

	public void setListaHilo(int[] listaHilo) {
		ListaHilo = listaHilo;
	}

	public int getiContador() {
		return iContador;
	}


	public void setiContador(int iContador) {
		this.iContador = iContador;
	}


	@Override
	public void run() {
		
		for(int i=0;i<ListaHilo.length;i++) {
			getListaHilo()[i] =(int) (Math.floor(Math.random()*6));	
			
		}
		

	
		
	}

}
