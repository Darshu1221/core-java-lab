public class Address 
{
String city, state, country; 
int pinCode;

public Address(String city, String state, String country, int pinCode)
 {  
  this.city = city;  
  this.state = state;  
  this.country = country;  
  this.pinCode = pinCode;	    
  }  
}

 System.out.println("Address:");
 System.out.println(address.city+" "+address.state+" "+address.country+ " " +address.pinCode); 
 
public static void main(String[] args) 
{  
 Address addr1 = new Address("Dhanbad,","Jharkhand,","India,", 826001);  
 Address addr2 = new Address("Ranchi,","Jharkhand,","India,", 825001);  
	  

	     
   addr1.display();  
   addr2.display();  
 }  
}
