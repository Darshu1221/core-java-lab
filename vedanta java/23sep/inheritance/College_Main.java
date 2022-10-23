package inheritance;

import java.util.Scanner;

public class College_Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter City name of Vedanta College : ");
		String city_v =sc.nextLine();
		
		System.out.println("Enter city name of PNDoshi college : ");
		String city_p =sc.nextLine();
		
		System.out.println("Enter name , location and university of 1 st college >> ");
		String name_v= sc.nextLine();	String location_v= sc.nextLine(); 	String uni_v= sc.nextLine();
		
		System.out.println("Enter name , location and university of 2 nd college >> ");
		String name_s= sc.nextLine();	String location_s= sc.nextLine(); 	String uni_s= sc.nextLine();
		
		Vedanta_College v1 = new Vedanta_College(name_v, location_v, uni_v);
		PNDoshi p1 = new PNDoshi(name_s, location_s, uni_s);
		
		v1.getLocation(city_v);
		p1.getLocation(city_p);
		
		sc.close();

	}

}
