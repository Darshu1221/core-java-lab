/*
Program: Java program to understand break and continue statement
@Authour: Darshana Parab
@Date:18 August 2022
*/
class ArrayDemo
{
	static void printArrays(int num1,num2,intnum3) //passing values to array
	{
		//int myArray[]; //creating a references of array//myArray = new int[3];
		
		int []myArray= new int[3];
		
		myArray[0]=num1; //storing 23 as first element
				myArray[1]=num1; //storing 24 as second element
						myArray[2]=num1; //storing 25 as third element
						
						for(int i=0;i<myArray.length;1++)
						{
						System.out.println("Element"+(i+1)+":"+myArray[i]); //printing the element of array
						}
	}
	
	public static void main(String args[])
	{printArray(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Intger.parseInt(args[2]));
	}
}
	