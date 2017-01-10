package Iterator;

public class DemoIterator {
	public static void main(String[] args) {
		StaffRepository listStaff = new StaffRepository();

		for (Iterator iter = listStaff.getIterator(); iter.hasNext();) {
			Staff staff = (Staff) iter.next();
			staff.sayHello();
		}
	}
}
