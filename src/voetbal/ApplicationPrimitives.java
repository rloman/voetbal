package voetbal;

public class ApplicationPrimitives {
	
	public static void main(String[] args) {
		
		// primitives/basic types / elementairy types ("Periodiek systeem")
		
		// integrale types (gehele getallen)
		
		/*
		 * definities:
		 * bit ::= binary digit
		 * byte ::= 8 bits
		 * 
		 */
		
		byte b = 127; // 8 bits geheel getal
		short s = 32767; // 16 bits geheel getal
		int age = 42; // 32 bits geheel getal. 
		long veryLong = 32383; // 64 bits

		
		/* Maximale en minimale waarde van gehele getallen
		 * byte = 8 bits. D.w.z ik heb 2 tot de macht 8 = 256
		 * En we willen ook negatieve getallen modelleren dus we hebben besloten om de most significant bit (left) as sign bit
		 * Dus heb ik over 7 bits d.w.z.
		 * byte heeft de range van: -128 via 0 tot +127 en dat zijn precies 256 waarden.
		 * 
		 * Datzelfde principe geldt voor short, int en long
		 * 
		 * Dus short = -32768 via 0 tot 32767
		 * en int: van -2miljard via 0 tot + 2miljard
		 */
		
		int myAge = 53+2;
		System.out.println(8945784578454L);
		veryLong = 8945784578454L;
		
		// breuken
		float f; // 32bits floating point getal. Niet meer gebruiken bij kritieke berekeningen
		double d; // 64 bits floating point getal. BigDecimal gebruiken bij wetenschappelijke / banken.
		
		f = 3.5F; // standaard is een literal floating point getal een 'double'
		d = 5.3;
		
		// 1 letter (char)
		char myInitial = 'R'; //single quote. Onder water een 'unsigned short' dus een 16 bits unicode character is. 
		System.out.println(myInitial);
		myInitial++;
		System.out.println(myInitial);
		
		// booleans true false
		boolean hetIsMooiWeer = true;
		hetIsMooiWeer = false;
		if(hetIsMooiWeer) {
			System.out.println("Het is mooi weer in NL");
		} else {
			System.out.println("Jammer van het weer");
		}
		
		if(f < d) {
			// 
		} else {
			//
		}
	}
}
