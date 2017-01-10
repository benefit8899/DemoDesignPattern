package Facade;

public class DemoFacade{
	public static void main(String[] args)
	{
		FacadeControler controler = new FacadeControler();
		
		//When i go into home
		controler.welcome();
		
		//When i go out
		controler.goodbye();
	}
}
