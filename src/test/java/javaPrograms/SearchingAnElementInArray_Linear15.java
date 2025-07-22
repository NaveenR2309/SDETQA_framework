package javaPrograms;

public class SearchingAnElementInArray_Linear15 {

	public static void main(String[] args) {

		int arr[]= {1,2,4,7,5};
		int search = 9;
		boolean flag = false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search) {
				System.out.println("element found "+i);
				flag = true;
				break;
				
			}
		}
		if(flag==false) {
			System.out.println("element not found");
		}
	}

}
