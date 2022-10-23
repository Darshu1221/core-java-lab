/* 
Program: java program to check whether input
@Author: Darshana Parab
@Date: 18 August 2022
*/

class CountVowelOrConsonantAscii
{
   public class CountVowelAndConsonantAscii1{
   public static void main(String args[]){
     String str;
   int vowCount=0,consCount=0;//declare a counter variable and initialized as zero 
     Scanner scan=new Scanner(System.in); 
    //create a scanner object for input
    
     System.out.println("Enter the String for count vowel and consonant  ");
     str=scan.nextLine();
int i=0; 
while(i<str.length()){
    char ch=str.charAt(i);
    if(ch == 97|| ch == 101|| ch == 105|| ch == 111|| ch == 117
    ||ch == 65|| ch == 69|| ch == 73|| ch == 79|| ch == 85 ){
        vowCount++;
    }
    else if((ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90 )){
        consCount++;
    }
     i++;
    }
        System.out.println("The number of vowels: "+vowCount);
     System.out.println("The number of consonant: "+consCount);
   }
}