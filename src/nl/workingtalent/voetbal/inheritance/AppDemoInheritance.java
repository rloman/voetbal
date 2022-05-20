package nl.workingtalent.voetbal.inheritance;


import java.awt.Color;

import nl.workingtalent.voetbal.model.Handschoenen;
import nl.workingtalent.voetbal.model.Keeper;

public class AppDemoInheritance {

	public static void main(String[] args) {
		
		Keeper keeper = new Keeper();
		
		keeper.setNaam("Piet Schrijvers");
		keeper.setShirtColor(Color.BLUE);
		keeper.setHandschoenen(new Handschoenen());
		
		System.out.println(keeper.getNaam());
		System.out.println(keeper.getShirtColor());
		
		System.out.println(keeper.hashCode());
		System.out.println(keeper.toString());
	}
}
