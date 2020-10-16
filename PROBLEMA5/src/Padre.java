import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Padre {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		int iOpcion;
		
		do {
			 iOpcion= (int) Valida.valida("introduce Una opcion", 1, 2, 1);
			
			 callChildProcess();
			 
		}while(iOpcion!=2);
		
	System.out.println("fin");
		
	}
	private static void callChildProcess() throws IOException, InterruptedException {
		List<String> jvmArgs = new ArrayList<>();
		List<String> argsM = new ArrayList<>();
		
		Process p= JavaProcess.exec(hijo.class, jvmArgs, argsM);
		
		byte bValorDevuelto= (byte) p.waitFor();
		
		System.out.println(bValorDevuelto);
	}

}
