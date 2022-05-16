package nl.workingtalent.voetbal.inheritance;


import java.awt.Color;

import nl.workingtalent.voetbal.model.Handschoenen;
import nl.workingtalent.voetbal.model.Keeper;

public class AppDemoInheritance {

	public static void main(String[] args) {
		
		Keeper k = new Keeper();
		
		k.setNaam("Piet Schrijvers");
		k.setShirtColor(Color.BLUE);
		k.setHandschoenen(new Handschoenen());
		
		System.out.println(k.getNaam());
		System.out.println(k.getShirtColor());
		
		System.out.println(k.hashCode());
		System.out.println(k.toString());
	}
}
