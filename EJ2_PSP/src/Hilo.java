
public class Hilo implements Runnable{

	
	private int iContador;
	public Hilo(int iContador) {
		
		setiContador(iContador);
	}

	public int getiContador() {
		return iContador;
	}

	public void setiContador(int iContador) {
		this.iContador = iContador;
	}

	@Override
	public void run() {
		
		if(getiContador()==1) {
			System.out.println("primera funcion");
			BucleCienVeces();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}if(getiContador()==2) {
			System.out.println("2º funcion");
			
			leerCadena();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}if(getiContador()==3) {
			System.out.println("3º funcion");
			
			MultiplicaVectores();
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}

		
	}

	private void MultiplicaVectores() {
		int[]i= {1,2,3,4,5};
		int[]i1= {5,4,3,2,1};
		int iFinal =0;
		
	 for(int iContador=0; iContador<5;iContador++) {
		 iFinal+=i[iContador]*i1[iContador];
		 
	 }
	 System.out.println(iFinal);
	
		
	}

	private void leerCadena() {
		// TODO Auto-generated method stub
		
		String sCadena=Valida.leer("Introduce una cadena de caracteres: ");
		
		System.out.println(sCadena);
		
	}

	private void BucleCienVeces() {
		for(int i=0;i<=100;i++) {
			System.out.println("Bucle ejecutado: "+i+" veces");
		}
		
	}
	
	

}
