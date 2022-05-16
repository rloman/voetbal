package nl.workingtalent.voetbal.model;

public abstract class Persoon  /* extends Object */ {

	private String naam;
	private int leeftijd;
	
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
	
	public abstract void walk();
	
}
