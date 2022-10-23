/*
Program: SwitchDemo to print day according to the day number, print number of days in a month 
         Enhanced features of switch
@author: Darshana Parab
@Date: 17 aug 2022
*/

class SwitchDemo
{
	
    //method to print day according to the day number
    static void printDay()
	{
		int day=6; // taking input
		switch(day)
		{
			case 1 -> System.out.println("Monday");
			        
			case 2 -> System.out.println("Tuesday");
			        
			case 3 -> System.out.println("Wednesday");
	                
			case 4 -> System.out.println("Thursday");
			        
			case 5 -> System.out.println("Friday");
			        
			case 6 -> System.out.println("Saturday");
			        
			case 7 -> System.out.println("Sunday");
			        
		    default -> System.out.println("Wrong input");
			        
		}//switch ends
	}//ending printDay method
	
	// method to print number of days in a month
	
    static void printNoOfDays() 
	{
		String month= "May";
		switch(month)
		{
			case "January","March","May","July","August","Octomber","December"-> System.out.println("Number of Days in the month number "+ month +" are 31 days");
                    
			case "April","June","September","November"-> System.out.println("Number of Days in the month number "+ month +" are 30 days");
			         
			case  "February"-> System.out.println("Number of Days in the month number "+ month +" are 28 days");
			default -> System.out.println("Wrong input");
		}
	}
	//calling main method
	public static void main(String args[])
	{
		printNoOfDays();//calling static method printNoOfDays
		//printDay();
	}
}
					
