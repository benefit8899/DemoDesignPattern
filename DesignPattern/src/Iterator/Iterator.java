package Iterator;

/**
 * @author MIK
 * This Interface show Iterator
 * This Interface declare methods use for inspect every object in list
 */
public interface Iterator {
	//this method to check has object next, return true if has object else return false
	public boolean hasNext();
	//this method to inspect to the next object
	public Object next();
}
