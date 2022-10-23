/*
Program: WhileDemo example
@author: Darshana
@Date: 17 august 2022
*/

class WhileDemo
{
	static void infiniteWhile(String name)
	{
		while(true)
		{
			System.out.println("Hello" +name);
		}
	}
	static void charging()
	{
		int batteryLife=10;
		while(batteryLife!=100)
		{
			System.out.println("Char");
		}
	}
	public static void main(String args[])
	{
		//infiniteWhile(args[0]);
	}
}