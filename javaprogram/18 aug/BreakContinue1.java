/*
Program: Java program to understand break and continue statement
@Authour: Darshana Parab
@Date:18 August 2022
*/
class  BreakContinue1
{
	//method to understand break keyword
	static void callBreak()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i); //printing the value of i
		}
	}
 // method to understand continue keyword
	static void callContinue()
	{
		for(int i=0;i<10;i++)
		{
		    if(i==6)
				continue;
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		callBreak();
	//callContinue();
	}
}
