package Facade;

/**
 * @author MIK
 *  Demo 
 *	Class Window have some method usual
 */
public class Window {
	private boolean windowStatus; // true for open and false for close

	private void lock() {
		//lock windows after close
	}

	private void unlock() {
		//unlock windows before open
	}

	public boolean isWindowStatusOpen() {
		return windowStatus;
	}

	public void setWindowStatus(boolean windowStatus) {
		this.windowStatus = windowStatus;
		String status = windowStatus ? "Open" : "Close";
		System.out.println("The window is " + status);
	}

	//call method unlock window, and excute openwindow
	public void openWindow() {
		unlock();
		setWindowStatus(true);
	}
	//call method excute openwindow then lock windows
	public void closeWindow() {
		setWindowStatus(false);
		lock();
	}
}
