/*
Program: Java program to understand break and continue statement
@Authour: Darshana Parab
@Date:18 August 2022
*/
//declaring a continue
class  AbrivationDemo 
{
	//creating a method to print the full form of abrivation
	static void printFulForm(String abbv)
	{
		//switch case starts
		switch(abbv)
		{
			//if the abbv is lol
			case "lol"->System.out.println("Lots Of Laugh");
			//if the abbv is dbms
			case "dbms"->System.out.println("Data Base Management System");
			//if the abbv is btw
			case "btw"->System.out.println("By the way");
			//if the input is wrong
			default-> System.out.println("Wrong input");
		}
		//switch case ends
	}
	//calling main method
	public static void main(String args[])
	{
		//calling printFullForm method
		printFullForm(args[0].toLowerCase());  //passing 1 string command line argument and converting it into lowercase
	}
}
			