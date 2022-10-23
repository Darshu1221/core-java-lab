/**# program :- using method find out multiplication of three number
#@ authour:- Darshana Parab
#@ Date :-5 sep 2022
**/
import java.util.Scanner;


public class Multiplication 

{

public static void main(String[] args)  // calling main method

{

Scanner sc = new Scanner(System.in);

System.out.println("Enter the value of the first number :");   //enter the first value 

int a = sc.nextInt();

System.out.println("Enter the value of the second number :");  //enter the second value

int b = sc.nextInt();

System.out.println("Enter the value of the third number :");   //enter the third value

int c = sc.nextInt();

int result = a*b*c;   // multiplication of three number

System.out.println("Product of the given three numbers is :"+result);   //gives the value of three number
}

}