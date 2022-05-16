package nl.workingtalent.voetbal.model;

import java.awt.Color;

public class Keeper extends Voetballer {

	private Handschoenen handschoenen;
	private Color shirtColor;

	public Handschoenen getHandschoenen() {
		return handschoenen;
	}

	public void setHandschoenen(Handschoenen handschoenen) {
		this.handschoenen = handschoenen;
	}

	public Color getShirtColor() {
		return shirtColor;
	}

	public void setShirtColor(Color shirtColor) {
		this.shirtColor = shirtColor;
	}

	public void walk() {
		System.out.println("Walking Keeper");
	}

}
