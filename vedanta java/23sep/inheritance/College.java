package inheritance;

public class College {

	String col_name;
	String location;
	String university;
	
	public College(String col_name,String location,String university) 
	{	
		this.col_name=col_name;
		this.location=location;
		this.university=university;	
	}
	
	void getLocation(String city)
	{
		System.out.println("Location is : " + location + " and City is : "+ city);
	}
	
	
}





	/*
	 * College, Library, Book, MathBook, Human, Teacher, Student, Accountant, Vedanta-College, Canteen
	 * 
	 * College - Vedanta-College , Book - MathBook , Human - Teacher , Human - Teacher , Human - Student , Human - Accountant 
	 * ( IS A Relationship - Inheritance ) 
	 * 
	 *  ( has a relationship - aggregation )
	 */
	

