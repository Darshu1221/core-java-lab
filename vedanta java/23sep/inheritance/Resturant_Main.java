package inheritance;

public class Resturant_Main {

	public static void main(String[] args) {
		
		FiveStarResturant f1 = new FiveStarResturant();
		
		RoadsideResturant r1 = new RoadsideResturant();
		
		System.out.println("For FiveStar : " + (f1.price + f1.extraamount));
		System.out.println("For Roadside : " + (r1.price - r1.discountamount));
		
		r1.totalPrice();
		r1.welcomeDrinks();
		r1.mainCourse();

		//f1.welcomeDrinks();
		//f1.mainCourse();
	}

}
