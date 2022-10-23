/*
Program: To find the element in an array
@Authour: Darshana Parab
@Date:18 August 2022
*/
class LinearSearch 
{
	// method to find number in an array
	static void findNumber(int searchNum)
	{
		
	int [] arr={25,20,40,23,56};
	    boolean flag = false;
        //traversing the array
		
		
		for(int i=0;i<arr.length;i++)
		{
	     if(searchNum == arr[i])
		 {
			 flag=true;
		     break;
		 }
		}
		 
		
		if(flag) //if flag==true
			System.out.println("The number" +serchNum+" is present in the array");
		else
			System.out.println("The number" +serchNum+" is not present in the array");
	
	}
	//calling main
	public static void main(String args[])
	{
		//calling findNumber method
		findNumber(Integer.parseInt(args[0]));
	}
	
}