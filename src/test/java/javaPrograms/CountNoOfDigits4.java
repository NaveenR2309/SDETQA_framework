package javaPrograms;

public class CountNoOfDigits4 {

	public static void main(String[] args) {

		int i = 12345;
		int count = 0;
		
		while(i>0) 
		{
			i = i/10;
			count++;
		}
		System.out.println(count);
	}

}
