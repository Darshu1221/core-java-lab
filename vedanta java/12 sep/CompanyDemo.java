class CompanyDemo
{
 int id;
 String name;

 static String Company="Mahindra";
 static String faculty="It/Cs";

 void displaydata()
 {
	 System.out.println(id + " " +name);
     System.out.println(id + " " +email);
 }
}
{
      public static void main(String[] args)
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		
        e1.id=1;
		e1.name="Mishta";
		e1.email="mishta@gmail.com";
         
		e1.id=2;
		e2.name="Emmi";
		e2.email="emmi@gmail.com";
		
		e1.displayData();
		e2.displayData();
		
		System.out.println();
	}
} 