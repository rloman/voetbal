package nl.workingtalent.voetbal.model;

// 		FQCN ::= Fully Qualified Class Name
//     hier dus: nl.workingtalent.voetbal.model.Voetbal

public class Voetballer /* extends Object */ {

	private String naam;
	private int leeftijd;
	
	// method
	public boolean scoren() {
		return Math.random() >=  0.5;
	}

	public String getNaam() {
		
		return this.naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getLeeftijd() {
		return leeftijd;
	}

	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}
}
