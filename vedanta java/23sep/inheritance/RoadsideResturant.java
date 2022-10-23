package inheritance;

public class RoadsideResturant extends MughalResturant {

	
	int discountamount = 200;
	
	void totalPrice()
	{
		System.out.println(super.price-discountamount);
	}
	
	@Override
	void welcomeDrinks()
	{
		System.out.println("Tea");
	}
	
	@Override
	void mainCourse()
	{
		System.out.println("Biriyani Tandoor Roti Chicken Chap Mutton Korma");
	}
}
