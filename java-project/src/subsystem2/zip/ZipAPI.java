package subsystem2.zip;

public class ZipAPI {
	private static ZipAPI instance = new ZipAPI();
	private ZipAPI() {
		super();
	}
	
	public static ZipAPI getInstance() { 
		return instance;
	}
	
	public String recoverCity(String zip) {
		return "Itumbiara";
	}
	
	public String recoverState(String zip) {
		return "GO";
	}

}
