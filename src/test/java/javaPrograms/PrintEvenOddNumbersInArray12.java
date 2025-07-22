package javaPrograms;

public class PrintEvenOddNumbersInArray12 {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5};
		int even = 0;
		int odd = 0;
		
		for(int i=0;i<=a.length-1;i++) {
			
			if(a[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("total no.of even no. "+even);
		System.out.println("total no.of odd no. "+odd);
	}

}
