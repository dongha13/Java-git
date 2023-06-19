
public class IntegerLiterals {

	public static void main(String[] args) {
//		int num1 = 123;
//		int num2 = 0123;
//		int num3 = 0x123;

//		System.out.println("num1: " + num1);
//		System.out.println("num2: " + num1);
//		System.out.println("num3: " + num1);
//		
//		System.out.println("11 + 22 + 33 = " + (11 + 22 + 33));
//		System.out.println("011 + 022 + 033 = " + (011 + 022 + 033));
//		System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
//	
//		System.out.println(3147483647l + 314783648l);
//		
//		int num1 = 50;
//		long  num2 = 3147483647l;
//		System.out.println(num1 + num2);
	
//	double pi = 3.1415;
//	int wholeNumber = (int)pi;
//	
//	long num1 = 30000007l;
	
	
//	int num1 = 1;
//	int num2 = 2;
//	int num3=(short)(num1+num2);
//
//		int num1 = 4;
//		int num2 = 3;
//		double num3 = num2 / num1;
//		System.out.println(num3);
//		int num1 = 7;
//		int num2 = 3;
		
//		System.out.println(num1 / num2);
//		System.out.println(7.0 / 3.0);
//		num1 = num1 += 7; 
//		System.out.println(num1);
//		short num = 10;
//		num = (short)(num + 77L);
//		int rate = 3;
//		rate = (int)(rate * 3.5);
//		System.out.println(num); 
//		System.out.println(rate);
//		
//		num = 10;
//				num += 77l;
//				rate = 3;
//				rate *=3.5;
//				System.out.println(num);
//				System.out.println(rate);
//		System.out.println(3 >= 2);
//		System.out.println(3 <= 2);
//		System.out.println(7.0 == 7);
//		System.out.println(7.0 != 7);
		
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		result = 1 < num1 && (num1 < 100);
		System.out.println("1 초과 100 미만인가? " + result);
				
				result =((num2 % 2)==0)||((num2 % 3) ==0);
		System.out.println("2 또는 3의 배수인가? " +result);
		
		result = !(num1 !=0);
		System.out.println("0인가? " + result);
	}

}
