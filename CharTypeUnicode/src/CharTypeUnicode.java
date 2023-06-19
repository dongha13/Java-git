
public class CharTypeUnicode {

	public static void main(String[] args) {
		System.out.println(10.0+10.0);
		char ch1 = '헐';
		char ch2 = '확';
		
		char ch3 = 54736;
		char ch4 = 54869;
		
		char ch5 = 0xD5D0;
		char ch6 = 0XD655;
		
		int a = 1;
		char b = '1';
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(ch1 + " " + ch2);
		System.out.println(ch1 + " " + ch4);
		System.out.println(ch1 + " " + ch6);
	}

}
