import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Traductor {

	public static void main(String[] args) throws InterruptedException {
		
		
		try {
			List<String> jvmArgs = new ArrayList<>();
			List<String> argsM = new ArrayList<>();
			Process P = JavaProcess.exec(TraductorChild.class, jvmArgs, argsM);
			P.exitValue();
		} catch (IOException e) {
			System.err.println("ERROR: "+e.getMessage());
			
		} catch (InterruptedException e) {
			System.err.println("ERROR: "+e.getMessage());
		}
		;
		
	}
}