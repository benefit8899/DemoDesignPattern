package Iterator;

public class Staff {
	protected String fullname;

	public Staff(String fullname)
	{
		this.setFullname(fullname);
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public void sayHello(){
		System.out.println("Hello everyone! i'm " + fullname);
	}
}
