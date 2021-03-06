package nl.workingtalent.voetbal.model;

// 		FQCN ::= Fully Qualified Class Name
//     hier dus: nl.workingtalent.voetbal.model.Voetbal

// final in class context: je kunt er niet van erven




//Dit werkt dus wel straks in Spring Boot => @Entity
public class Voetballer extends Persoon  {
	
	public static int totaalAantalGescoordeDoelpunten = 0;

	private int rugnummer;
	
	//Dit werkt dus wel straks in Spring Boot => @OneToOne
	private Schoenen schoenen;
	
	
	// method
	public boolean scoren() {
		boolean scored =  Math.random() >=  0.5;
		if(scored) {
			totaalAantalGescoordeDoelpunten++;
		}
		
		return scored;
	}

	// in context met method: final :: dan kan ik die methode niet in een subclass overriden
	public /*final*/  void walk() {
		System.out.println("Walking voetballer!!!");
		
	}

	public int getRugnummer() {
		return rugnummer;
	}

	public void setRugnummer(int rugnummer) {
		this.rugnummer = rugnummer;
	}
}
