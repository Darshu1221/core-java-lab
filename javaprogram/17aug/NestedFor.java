/*
Program: ForLoop example
@author: Darshana
@Date: 17 august 2022
*/

class NestedFor
{
	static void printPattern()
	{
		for(int i=1;i<=5;i++)
		{ System.out.println();
			for(int j=1;j<=i;j++)
		    {
				System.out.print("*");
			break;
			}
		}
	}
	public static void main(String args[])
	{
		printPattern();
	}
}