package javaPrograms;

public class FactorialOfNumbers8 {

	public static void main(String[] args) {

		int num = 5;
		long factorial = 1;
		
		for(int i=1;i<=5;i++) {
			factorial = i * factorial;
			
		}
		System.out.println("factorial of a number"+factorial);
	}

}
