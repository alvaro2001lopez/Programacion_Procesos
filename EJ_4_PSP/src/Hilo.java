
public class Hilo implements Runnable{

	private int iContador;
	private String args;
	
	public Hilo(String args, int iContador) {
		setArgs(args);
		setiContador(iContador);
	}

	public Hilo(String string) {
		// TODO Auto-generated constructor stub
	}

	public int getiContador() {
		return iContador;
	}

	public void setiContador(int iContador) {
		this.iContador = iContador;
	}

	public String getArgs() {
		return args;
	}

	public void setArgs(String args) {
		this.args = args;
	}
	@Override
	public void run() {
		if(getiContador()==0){
			
			
			LeerCadena();
			
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}if(getiContador()==1) {	
			
			SumaArgumento();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}if(getiContador()==2) {
			
			DivideArgumento();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

	}

	private void DivideArgumento() {
		double dNum= Double.parseDouble(args);
		System.out.println("El tercer Hilo: "+dNum/10.0);
	}

	private void SumaArgumento() {
		int iNum= Integer.parseInt(args);
		
		System.out.println("Segundo hilo: "+(iNum+10));
	}

	private void LeerCadena() {
		
		System.out.println("Primer Hilo: "+args);
		
	}

	
	}
