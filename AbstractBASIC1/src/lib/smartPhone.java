package lib;

public class smartPhone extends mobliePhone{

	@Override
	public void move() {
		System.out.println("I can move with owner by smart security");
		
	}

	@Override
	public void call() {
		System.out.println("I can called by taping number on screen.");
		
	}

	@Override
	public void recieve() {
		System.out.println("I can recieve call by swipe on the screen.");
		
	}
	
	public void videoCall() {
		System.out.println("I can Video Call.");
	}

}
