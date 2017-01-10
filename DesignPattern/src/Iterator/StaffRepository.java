package Iterator;

/**
 * @author MIK
 * @sumary This class show ConcreteAggregate and ConcreteIterator In this case
 *         ConcreteAffregate contain Concreteterator
 */
public class StaffRepository implements IContainer {
	// Example this is a list containt many object not the same
	Object[] listStaff = { new Staff("Tim"), new Fresher("Tom", "JAVA"), 
			new Developer("Jerry", "Marketing") };

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	// This class help support inspect every object in list above

	private class NameIterator implements Iterator {
		int index = 0; // this parameter create to save current cursor of list

		@Override
		public boolean hasNext() {
			if (index < listStaff.length) {
				return true;
			}
			return false;
		}

		/**
		 * The method next return a object next in current object depend on index 
		 * return null if not object in the next
		 */
		@Override
		public Object next() {
			if (this.hasNext()) {
				return listStaff[index++];
			}
			return null;
		}
	}
}
