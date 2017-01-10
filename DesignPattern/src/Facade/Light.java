package Facade;

public class Light {
	private boolean lightStatus;

	public boolean isLightStatus() {
		return lightStatus;
	}

	public void setLightStatus(boolean lightStatus) {
		this.lightStatus = lightStatus;
		String status = lightStatus ? "Open" : "Close";
		System.out.println("The light is " + status);
	}

	public void turnOn() {
		setLightStatus(true);
	}

	public void turnOff() {
		setLightStatus(false);
	}
	
}
