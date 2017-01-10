package Observer;

/**
 * @author MIK 
 * This interface show Observer model
 */
public interface Observer {
	// This method to update the observer, used by subject
	public void update();

	// This method attach with subject to observe
	public void setSubject(Subject subject);
}
