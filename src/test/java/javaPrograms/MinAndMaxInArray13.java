package javaPrograms;

public class MinAndMaxInArray13 {

	public static void main(String[] args) {

		int a[] = {1,2,3,6,7};

		//	int max = a[0];
		//	
		//	for(int i=1;i<a.length;i++) {
		//		if(a[i]>max)
		//		{
		//			max = a[i];
		//		}
		//	}
		//	System.out.println("max value is: "+max);

		int min = a[0];

		for(int i=1;i<a.length;i++) 
		{
			if(min>a[i])
			{
              min = a[i];
			}
		}
		System.out.println("min value is: "+min);
	}

}
