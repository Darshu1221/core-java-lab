/*
Program: ForLoop example
@author: Darshana
@Date: 17 august 2022
*/

class ForLoopDemo0
{
	static void printNumbers()
	{
	int count=0;
		System.out.println("Printing numbers");
		
		for(;count<=10;)
		
		{
			System.out.println(count);
			count++;
		}
		
	}
	static void infiniteFor()
	{
	   for(;;)
	    {
	      System.out.println("hi");
	    }
	}
     static void calcFactorial(int num)
	{
		int result=1;
		int c1; //local scope
		for(c1=num;c1>0;c1--)
		{
			result*=c1;
		}
		System.out.println("The factorial of the number"+num+" is:"+result);
	}
	public static void main(String args[])
	{
		//printNumbers();
		System.out.println(Thread.currentThread().getName());
		//infiniteFor();
		int factNumber= Integer.parseInt(args[0]);
		calcFactorial(factNumber);
	}
}