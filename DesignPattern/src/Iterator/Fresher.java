package Iterator;

public class Fresher extends Staff {
	private String languageProgram = "HTML";

	public Fresher(String fullname, String languageProgram) {
		super(fullname);
		this.languageProgram = languageProgram;
	}

	public String getLanguage() {
		return languageProgram;
	}

	public void setLanguage(String language) {
		this.languageProgram = language;
	}

	@Override
	public void sayHello() {
		System.out.println("Hello everyone! My name's " + fullname + "i'm a fresher " + languageProgram);
	}
}
