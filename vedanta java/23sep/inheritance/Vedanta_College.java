package inheritance;

public class Vedanta_College extends College 
{

	public Vedanta_College(String col_name, String location, String university) 	// these 3 value will be passed at the time of
																					// object creation 
	{	
		super(col_name, location, university);	
	}
	
	void getLocation(String city)			// city value will be passed at the time of method calling 
	{
		System.out.println("Location is : Vitthalwadi ," + location + " and City is : "+ city);
	}

}
