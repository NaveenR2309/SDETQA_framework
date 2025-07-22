package javaPrograms;

public class SearchAnElementInArray_Binary16 {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7};
		int key = 3;
		boolean flag = false;
		
		int l = 0;
		int h = arr.length-1;
		
		while(l<=h)
		{
			int m = (l+h)/2;
			
			if(arr[m]==key)
			{
				System.out.println("element found");
				flag = true;
				break;
				
			}
			if(arr[m]<key)
			{
				l = m+1;
			}
			if(arr[m]>key) 
			{
				l=m-1;	
				
			}			 	 
		}
		 if(flag==false) {
			 System.out.println("element not found");
		 }
	}

}
