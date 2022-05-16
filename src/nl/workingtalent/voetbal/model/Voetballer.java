package nl.workingtalent.voetbal.model;

// 		FQCN ::= Fully Qualified Class Name
//     hier dus: nl.workingtalent.voetbal.model.Voetbal

public class Voetballer extends Persoon  {

	
	// method
	public boolean scoren() {
		return Math.random() >=  0.5;
	}

	public void walk() {
		System.out.println("Walking voetballer!!!");
		
	}
}
