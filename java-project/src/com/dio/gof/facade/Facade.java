package com.dio.gof.facade;

import subsystem1.crm.CrmService;
import subsystem2.zip.ZipAPI;

public class Facade {
	public void migrateClient(String name, String zip) {
		String city = ZipAPI.getInstance().recoverCity(zip);
		String state = ZipAPI.getInstance().recoverState(zip);
		
		CrmService.saveClient(name, zip, city, state);
	}
}
