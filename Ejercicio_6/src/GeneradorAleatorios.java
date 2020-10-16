import java.util.Random;

public class GeneradorAleatorios {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		Random r = new Random();
		
		
		int iNumAle= 0+r.nextInt(10-0+1);
		int iNumAle1= 0+r.nextInt(10-0+1);
		
		
		if(iNumAle==iNumAle1) {
			System.out.println("Los Numeros aleatorios son iguales.");
		}else {
			System.out.println("Los numeros aleatorios no son iguales."+iNumAle+ "/"+iNumAle1);
		}

	

	}

}
