package Singleton;

public class DemoSingleton {
	public static void main(String[] args) throws InterruptedException {
		// illegal construct
		// Compile Time Error: The constructor SingleObject() is not visible
		// SingleObject object = new SingleObject();

		// Get the only object available
		SingletonBirthday object = SingletonBirthday.getInstance();

		// show the message
		object.showBirthday();

		Thread.sleep(5000); 	//pause application 5s to show 2 birdth is the same value

		// Get the only object available
		SingletonBirthday object2 = SingletonBirthday.getInstance();

		// show the message
		object2.showBirthday();
	}
}
