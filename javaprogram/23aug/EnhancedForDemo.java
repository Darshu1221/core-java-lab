/*
Program: To print colour  in an array
@Authour: Darshana Parab
@Date:18 August 2022
*/
//declaring the class
class EnhancedForDemo
{
	//method to print name of colours
	static void printName()
	{
	//String colourNames[]= {"Red","Green","Black","Yellow"};
	for(String i : colourNames)
		System.out.println(i);
	}
	
	//calling main
	public static void main(String args[])
	{
		printName(new string[]{"Red","Green","Black","Yellow"}); //anonymous array : array without name
	}
}