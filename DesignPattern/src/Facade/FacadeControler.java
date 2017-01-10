package Facade;

public class FacadeControler {
	private Light l1 = new Light();
	private Light l2 = new Light();
	private Window window1 = new Window();
	private AirConditioner airconditioner = new AirConditioner();

	// This method will excute when people come back home
	// This will turn on every device necsessary
	public void welcome() {
		l1.turnOn();
		l2.turnOn();
		window1.openWindow();
		airconditioner.turnOn();
	}

	public void goodbye() {
		l1.turnOff();
		l2.turnOff();
		window1.closeWindow();
		airconditioner.turnOff();
	}
}
