package subsystem1.crm;

public class CrmService {
	private CrmService() {
		super();
	}
	public static void saveClient(String name, String zip, String city, String state) {
		System.out.println("Client saved on CRM system:");
		System.out.println("Mr(s). " + name + " located at " + city + "-" + state + " " + zip);
	}

}
