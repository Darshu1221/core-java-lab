/**# program :- using method find out multiplication of three number
 #@ authour:- Darshana Parab
 #@ Date :-5 sep 2022
**/
import java.util.Scanner;

public class MultiplyExample 
{

       public static void main(String[] args) 
	   {

           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter first number = ");   //enter the first value 
           int a = scanner.nextInt();
           
		   System.out.print("Enter second number =  "); //enter the second value 
           int b = scanner.nextInt();
		   
		   System.out.print("Enter third number =  ");    //enter the third value 
           int c  = scanner.nextInt();		   
           scanner.close();

           int  result = a*b*c;     //multiplication of three numbers

           // Displaying the multiplication result
           System.out.println(a+ "*" + b + "*" + c + " = " + result); // giving result of three numbers
       }
   }