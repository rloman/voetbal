package nl.workingtalent.voetbal.interfaces;

public class SonyBrava implements Televisie {
	
	private boolean on = false;
	private int currentChannel = 1;

	@Override
	public void on() {
		this.on = true;
		System.out.println("SonyBrava is now on");
	}

	@Override
	public void off() {
		this.on = false;
		System.out.println("SonyBrava is now off");
	}

	@Override
	public int switchChannel(int newChannel) {
		this.currentChannel = newChannel;
		System.out.println("SonyBrava is now on currentChannel: "+this.currentChannel);
		
		return this.currentChannel;
	}
}
