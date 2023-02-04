package week1.assignments;

public class Mobile {
	
	public static void main(String[] args) {
	
	String mobileBrandName = "Samsung Galaxy";
	char mobileLogo = 'S';
	short noOfMobilePiece = 7654;
	int modelNumber = 65023;
	long mobileMeiNumber = 765438765454321l;
	float mobilePrice = 79999.99f;
	boolean isDamaged = false;
	
	System.out.println("The mobile details are as below:");
	System.out.println("Mobile is "+mobileBrandName);
	System.out.println("Mobile Logo is "+mobileLogo);
	System.out.println("Total number of mobile devices in market are"+noOfMobilePiece);
	System.out.println("Mobile device model number is "+modelNumber);
	System.out.println("The IMEI number is "+mobileMeiNumber);
	System.out.println("Mobile price is "+mobilePrice);
	System.out.println("Is Mobile damaged? - "+isDamaged);
	
	}

}
