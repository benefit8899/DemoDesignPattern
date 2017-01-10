package Facade;

public class AirConditioner {
	private int temperature = 20;
	private boolean sleepStatus = false;

	//setter and getter
	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		System.out.println("The temperature has set to " + temperature);
	}

	public boolean isSleepStatus() {
		return sleepStatus;
	}

	public void setSleepStatus(boolean sleepStatus) {
		this.sleepStatus = sleepStatus;
		String status = sleepStatus ? "sleeping" : "opening";
		System.out.println("The airconditioner is " + status);
	}

	//method
	public void setTemperatureUp() {
		setTemperature(getTemperature() + 1);
	}

	public void setTemperatureDown() {
		setTemperature(getTemperature() - 1);
	}

	//this method will turn on machine and set defaul value temperature
	public void turnOn() {
		setSleepStatus(false);
		setTemperature(20);								//this parameter can fix to local to user can change
	}

	public void turnOff() {
		setSleepStatus(true);
	}

}
