/*
Program: Nested if 
@author: Darshana
@Date: 17 august 2022
*/

class NestedIf
{
	static void takeAdmission()
	{
		float totalMarks=73.9f;
		float pcmMarks=87.9f;
		if(totalMarks>75)
		{
			if(pcmMarks>85)
				System.out.println("---You are eligible for our college(B.Tech)---");
		    else
			    System.out.println("You are not eligible for our college-------");
		}
		else
			System.out.println("----You are not eligible for our colllege------");
	    System.out.println("----Thank You!-----");
		
	}
	public static void main(String args[])
	{
		takeAdmission();
	}
}
