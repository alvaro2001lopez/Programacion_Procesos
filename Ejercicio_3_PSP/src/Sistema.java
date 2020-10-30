
public class Sistema {

	private static String OS = System.getProperty("os.name").toLowerCase();

	public static boolean isWindows() {
		return (OS.indexOf("win") >= 0);
	}
	public static boolean isLinux() {
        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
    }

	public static String getSistemaOperativo() {

		if (isWindows()) {
			return "win";
		} else if(isLinux()){
			return "uni";
		}else {
			return "err";
		}
	}

}
