
public class Samhang {

	public static void main(String[] args) {
		int num1 = -6;
		int num2 = 10;
		int num3 = 1;

		int max = num1 > num2 ? num1 : num2;
		max = max > num3 ? max : num3;

		System.out.println("최대값 :" + max);

	}

}
