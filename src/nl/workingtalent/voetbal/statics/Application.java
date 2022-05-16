package nl.workingtalent.voetbal.statics;

import nl.workingtalent.voetbal.constants.Labels;
import nl.workingtalent.voetbal.model.Persoon;
import nl.workingtalent.voetbal.model.Voetballer;

public class Application {
	
	public static void main(String[] args) {
		
		Voetballer v = new Voetballer();
		
		v.scoren();
		v.scoren();
		v.scoren();
		
//		Labels.companyName = "Philips"; // fout
		
		System.out.println("Brought to you by: "+Labels.COMPANYNAME);
		
		System.out.println(Voetballer.totaalAantalGescoordeDoelpunten);
		
		
		
		System.out.println(Integer.MAX_VALUE);
		/*
		 * 1: Een instantie (Object) heeft WEL de static fields en methods
		 * 2: Een class heeft NIET de instance fields en instance methods van het Object
		 */
		
		System.out.println(v.totaalAantalGescoordeDoelpunten);
//		System.out.println(Persoon.getName()); // vout 
		
		
	}

}
