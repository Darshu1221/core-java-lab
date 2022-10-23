public class Reverse   
{    
    public static void main(String[] args) {    
        String s1 = "Darshana Parab";    
        //Stores the reverse of given string    
        String reversedStr = "";    
            
           
        for(int i = s1.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + s1.charAt(i);    
        }    
            
        System.out.println("Original string: " + s1);    
        
		//Displays the reverse of given string    
        System.out.println("Reverse of given string: " + reversedStr);    
    }    
}