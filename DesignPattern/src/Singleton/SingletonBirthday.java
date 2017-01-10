package Singleton;

import java.util.Calendar;

/**
 * @author MIK
 *	@sumary This class show Singleton pattern
 */
public class SingletonBirthday {
	private Calendar today = Calendar.getInstance();
	// create an object of Singleton
	private static SingletonBirthday instance = new SingletonBirthday();

	// make the constructor private so that this class cannot be create outsite
	private SingletonBirthday() {
	}

	// Get the only object available
	public static SingletonBirthday getInstance() {
		return instance;
	}

	public void showBirthday() {
		System.out.println(today.getTime());
	}
}
