package nl.workingtalent.voetbal.interfaces;

public final class TelevisieTester {
	
	
	public static void test(Televisie[] tvs) {
		
		for(Televisie televisie: tvs) {
			televisie.on();
			televisie.off();
		}
	}
	
	
	private TelevisieTester() {
		
	}

}
