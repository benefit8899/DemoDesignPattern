package Iterator;

public class Developer extends Staff {
	private String deparment = "Dev";					//defaul every developer belong to dev
	public Developer(String fullname, String deparment) {
		super(fullname);
		this.setDeparment(deparment);
	}
	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	@Override
	public void sayHello() {
		System.out.println("Hello everyone! My name's " + fullname + "i'm dev of " + deparment + " deparment");
	}
}
