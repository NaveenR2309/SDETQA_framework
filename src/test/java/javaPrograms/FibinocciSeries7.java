package javaPrograms;

public class FibinocciSeries7 {

	public static void main(String[] args) {

//		int n1 = 0;
//		int n2 = 1;
//	    int sum = 0;
//	    
//	    System.out.print(n1+" "+n2); // 0 1
//	    
//	    for(int i=2;i<10;i++) {
//	    	sum = n1+n2;
//	    	System.out.print(" "+sum);
//	    	n1=n2;
//	    	n2=sum;
//	    	
//	    
//	    }
		
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		
		System.out.println(n1+" "+n2);
		for(int i=2;i<10;i++) {
			sum = n1+n2;
			System.out.println(sum);
			n1 = n2;
			n2 = sum;
			
		}
		
	}

}
