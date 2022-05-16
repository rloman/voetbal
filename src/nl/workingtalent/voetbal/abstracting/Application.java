package nl.workingtalent.voetbal.abstracting;

import nl.workingtalent.voetbal.model.Keeper;
import nl.workingtalent.voetbal.model.Persoon;  // import this since we are in an other package than nl.... model.Persoon
import nl.workingtalent.voetbal.model.Voetballer;

public class Application {
	
	public static void main(String[] args) {
		
		Persoon p = new Voetballer();
		
		p.setNaam("Van Basten");

		// Tijdens compile time zie je hier een Persoon
		// Tijdens runtime wordt de Keeper zijn code uitgevoerd
		
		p.walk();
		
		Persoon p2 = new Keeper();
		p2.setNaam("Piet Schrijvers");
		p2.walk();
		
	}

}
