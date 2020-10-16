import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Valida {
	
	static Object valida(String sMensaje, double dMin, double dMax, int iTipoDato) {
		Object oResultado = null;
		switch(iTipoDato) {
		case 1:
			oResultado = validaNumeroEntero(sMensaje,(int)dMin,(int)dMax);
			break;
		case 2:
			oResultado = validaNumeroDecimal(sMensaje,(float)dMin,(float)dMax);
			break;
		}
		return oResultado;
	}
	
	private static int validaNumeroEntero(String sMensaje, int iMin, int iMax) {
		int iNumero;
		if(iMin != -1 && iMax != -1) {
			iNumero = validaNumeroEnteroRango(sMensaje,iMin,iMax);
		}else if(iMin != -1) {
			iNumero = validaNumeroEnteroMinimo(sMensaje,iMin);
		}else if(iMax != -1) {
			iNumero = validaNumeroEnteroMaximo(sMensaje,iMax);
		}else {
			iNumero = validaNumeroEnteroSimple(sMensaje);
		}
		return iNumero;
	}
	
	private static int validaNumeroEnteroRango(String sMensaje, int iMin, int iMax) {
		int iNumero;
		do {
			iNumero = validaNumeroEnteroSimple(sMensaje);
		}while(iNumero < iMin || iNumero > iMax);
		return iNumero;	
	}
	
	private static int validaNumeroEnteroMinimo(String sMensaje, int iMin) {
		int iNumero;
		do {
			iNumero = validaNumeroEnteroSimple(sMensaje);
		}while(iNumero < iMin);
		return iNumero;	
	}
	
	private static int validaNumeroEnteroMaximo(String sMensaje, int iMax) {
		int iNumero;
		do {
			iNumero = validaNumeroEnteroSimple(sMensaje);
		}while(iNumero > iMax);
		return iNumero;	
	}
	
	private static int validaNumeroEnteroSimple(String sMensaje) {
		int iNumero;
		iNumero = Integer.parseInt(leer(sMensaje));
		return iNumero;	
	}
	
	
	private static float validaNumeroDecimal(String sMensaje, float fMin, float fMax) {
		float fNumero;
		if(fMin != -1 && fMax != -1) {
			fNumero = validaNumeroDecimalRango(sMensaje,fMin,fMax);
		}else if(fMin != -1) {
			fNumero = validaNumeroDecimalMinimo(sMensaje,fMin);
		}else if(fMax != -1) {
			fNumero = validaNumeroDecimalMaximo(sMensaje,fMax);
		}else {
			fNumero = validaNumeroDecimalSimple(sMensaje);
		}
		return fNumero;
	}
	
	private static float validaNumeroDecimalRango(String sMensaje, float fMin, float fMax) {
		float fNumero;
		do {
			fNumero = validaNumeroDecimalSimple(sMensaje);
		}while(fNumero < fMin || fNumero > fMax);
		return fNumero;	
	}
	
	private static float validaNumeroDecimalMinimo(String sMensaje, float fMin) {
		float fNumero;
		do {
			fNumero = validaNumeroDecimalSimple(sMensaje);
		}while(fNumero < fMin);
		return fNumero;	
	}
	
	private static float validaNumeroDecimalMaximo(String sMensaje, float fMax) {
		float fNumero;
		do {
			fNumero = validaNumeroDecimalSimple(sMensaje);
		}while(fNumero > fMax);
		return fNumero;	
	}
	
	private static float validaNumeroDecimalSimple(String sMensaje) {
		float fNumero;
		fNumero = Float.parseFloat(leer(sMensaje));
		return fNumero;	
	}
	static String leer(String sMensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String cadenaLeida;
		
		System.out.println(sMensaje);
		
		try {
			cadenaLeida = teclado.readLine();
		}catch(Exception e) {
			cadenaLeida = "";
		}
		
		return cadenaLeida;
	}
}
