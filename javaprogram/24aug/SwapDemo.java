 class SwapDemo
 {  
 static void int getLargestSmallest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i+1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
		}
 }
{  
int a[]={1,2,5,6,3,2};  
  
System.out.println("First Largest: "+getSecondLargest ());  
System.out.println("Second Largest: "+getSecondLargest ());  
}
}  
public static void main(String args[])
{
	print getLargestSmallest();
}
}

