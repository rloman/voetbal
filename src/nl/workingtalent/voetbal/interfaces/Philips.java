package nl.workingtalent.voetbal.interfaces;

public class Philips implements Televisie {
	
	private boolean on = false;
	private int currentChannel = 1;

	@Override
	public void on() {
		this.on = true;
		System.out.println("Philips is now on");
	}

	@Override
	public void off() {
		this.on = false;
		System.out.println("Philips is now off");
	}

	@Override
	public int switchChannel(int newChannel) {
		this.currentChannel = newChannel;
		System.out.println("Philips is now on currentChannel: "+this.currentChannel);
		
		return this.currentChannel;
	}

}
