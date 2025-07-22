package javaPrograms;

import java.util.Arrays;

public class ArraysAreEqualOrNot10 {

	public static void main(String[] args) {

		int a[]= {1,2,3};
		int b[]= {1,2,3,4};
		
//		boolean status = Arrays.equals(a, b);
//		
//		if(status==true)
//		{
//			System.out.println("equal");
//		}else
//		{
//			System.out.println("not equal");
//		}	
		
		// approach 2
		
		boolean status = true;
		
		if(a.length==b.length) 
		{
			for(int i=0;i<a.length;i++)
			{
				if (a[i] != b[i])
				{
					status = false;
				}
				
			}
		}
		else
		{
			status = false;
		}
		if(status==true) {
			System.out.println("array are equal");
		}else {
			System.out.println("array are not equal");
		}
		
		
		
	}

}
