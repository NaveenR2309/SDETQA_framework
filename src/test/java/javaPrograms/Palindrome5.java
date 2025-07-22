package javaPrograms;

public class Palindrome5 {

	public static void main(String[] args) {

		int num = 123216;
		int org = num;
		int rev = 0;
		
		while(num!=0) 
		{
			rev = rev*10+ num%10;
			num = num/10;
		}
			if(org == rev) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not palindrome");
			}
		}
		
	}


