package lib;

public class telephone extends phone {

	@Override
	public void call() {
		System.out.println("I can call");

	}

	@Override
	public void recieve() {
		System.out.println("I can recieve");
	}

}
