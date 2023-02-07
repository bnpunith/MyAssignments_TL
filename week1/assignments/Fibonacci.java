package week1.assignments;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int firstNum=0, secNum=1, sum=0;
		
		System.out.println("Fibonacci series from 0 to 56 are: ");
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for(int i=0; i<12; i++) {
			
			sum = firstNum+secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}
		
	}

}
