package week1.assignments;

public class IsPrime {

	public static void main(String[] args) {

		int n = 102, flag = 0;

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				flag = 1;
			}
		}

		if (flag == 0) {
			System.out.println(n + " is a prime number ");
		} else {
			System.out.println(n + " is not a prime number ");
		}
	}
}
