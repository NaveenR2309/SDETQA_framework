package javaPrograms;

public class MissingNumberInArray11 {

	public static void main(String[] args) {

//		int a[] = {1,3,5,2};
//		
//		int sum1 = 0;  //sum of array
//		
//		for(int i=0;i<a.length;i++) 
//		{
//			sum1 = sum1+a[i];
//			
//		}
//		System.out.println("sum of elements in array: "+sum1);
//		
//		int sum2 = 0;
//		
//		for(int i=1;i<=5;i++) {
//			sum2 = sum2+i;
//			
//		}
//		System.out.println("sum of missing elements: "+( sum2 - sum1));
		
		int a[] = {1,2,4,6,5};
		
		int sum1 = 0;
		for(int i=0;i<a.length;i++)
		{
			sum1 = sum1+a[i];
			
		}
		System.out.println(sum1);
		
		int sum2 = 0;
		
		for(int i=0;i<=6;i++) {
			sum2 = sum2+i;
			
		}
		System.out.println(sum2);
		
		System.out.println("missing no.is: "+ (sum2-sum1));
		
		
		
 	}

}
