package lib;

public class buttonPhone extends mobliePhone{

	@Override
	public void move() {
		System.out.println("I can move with owner");
		
	}

	@Override
	public void call() {
		System.out.println("I can called by pressing number on button.");
		
	}

	@Override
	public void recieve() {
		System.out.println("I can recieve call by pressing green button.");
		
	}

}
