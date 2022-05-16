package voetbal;

public class Application {
	
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		
		Voetballer cruijf; // declaratie
		cruijf = new Voetballer(); // instantiatie
		
		Voetballer neeskens = new Voetballer(); // declaratie + instantiatie;
		
		neeskens.setNaam("Johan");
		neeskens.setLeeftijd(59);
		
		System.out.println(neeskens.getNaam());
		
		System.out.println(neeskens.scoren());
		System.out.println(neeskens.scoren());
		System.out.println(neeskens.scoren());
		System.out.println(neeskens.scoren());
		System.out.println(neeskens.scoren());
		System.out.println(neeskens.scoren());
		
		Voetballer gullit = new Voetballer(); // let op, zonder new krijg je hier een Nullpointer Exception (NPE)
		gullit.setNaam("Ruud");
	}

}
