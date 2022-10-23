package inheritance;

public class PNDoshi extends College {
	
	public PNDoshi(String col_name, String location, String university) 
	{
		super(col_name, location, university);		// at the time of object creation 
	}
	
	// getLocation(String city )   // College class and PNDoshi class both having same implementation	
	// city value - > will be passed at runtime , at the time of method calling 
	
}
	