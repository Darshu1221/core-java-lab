/*
Program: Data types in java
@author: Darshana
@Date:16 aug 2022
*/
class DataTypeDemo
{
	
 public static void main(String args[])
 {
	int num1= Integer.parseInt(args[0]); //converting string to int
	int num2= Integer.parseInt(args[1]);
	System.out.println("The result is:"+ (num1+num2)); //runtime exception
	
	//float
	float f1=7.9f;
	float f2=0;   
	System.out.println("The result of float is :"+ (f1/f2)); //infinity
	
	//byte
	byte b1= 15;
	System.out.println(b1);
	
	//char 
	char c1='6';
	int num = c1;
	System.out.println("The ASCII value of"+ c1 +"is :"+ num);
	
	
  }
}
	