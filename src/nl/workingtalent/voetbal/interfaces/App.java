package nl.workingtalent.voetbal.interfaces;

public class App {

	public static void main(String[] args) {
		
		Televisie tv = new SonyBrava();
		Televisie tv2 = new Philips();
		Televisie tv3 = new Samsung();
		
		Televisie[] tvs = {tv, tv2, tv3};
		TelevisieTester.test(tvs);
	}
}
