package javaPrograms;

public class PrintEvenAndOddNumbers2 {
	public static void main(String[] args)
	{
		int num = 1;
		
		while(num<10)
		{			
			if(num%2==0) 
			{
				System.out.println("even number " + num);
			}else 
			{
				System.out.println("odd number "+ num);
			}
			num++;
		}
	}


}
