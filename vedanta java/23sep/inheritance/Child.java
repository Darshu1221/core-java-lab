package inheritance;

public class Child extends Parent {
	
	public Child() {
		
		super();
		System.out.println("Child class def Constructor");
	}
	
	
	void vehicleProperty()
	{
		super.vehicleProperty();
		System.out.println("1 CRETA and 1 Pulsur 220");
	}
	
}
