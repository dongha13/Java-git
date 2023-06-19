
public class HelloWorld {

	public static void main(String[] args) {
		/*1부터 10까지의 합*/
//		 1 + 2 + 3 + 4 ...
		int num = 1;
		int sum = 0;
		
		while( num <= 10) {
			sum = sum + num;
				System.out.println(sum);
				num++;
		}
		System.out.println("합"+ sum);
//	
///////////////////////////////////////
		for(int i=0; i < 5; i++) {
			System.out.println("무한루프");
		}
		///////////////////////////////
		for(int i=1; i<=10; i++){
			sum = sum + i;
		}
		System.out.println(sum);
		
		for(int i=1; i<=100; i++){
			sum = sum + i;
		}
		System.out.println(sum);
		
		/////////////////////////
//		짝수의 합 구하기 2 + 4 + ~100
		 sum = 0;
		 for (int i = 1; i <= 100; i++) {
		  if (i % 2 == 0) {
          sum +=  i;
		  }
		 }
//		  홀수의 합 구하기 1 + 3 + ~100
		  sum = 0;
		  for(int i = 1; i <= 100; i++) {
		 		if (i % 2 == 1) {
		 			sum = sum + i;
		 		}
		  }
			System.out.println(sum);
			
			//3단  3*1=3
//			 for (int i = 1; i <= 9; i++) {
//			      System.out.println(3 * i);}
			
			int dan = 3;
			for (int i = 1; i <=9; i++) {
				System.out.println(dan + "*"+i+"=" + (dan * i));
				
			
			}
			////////
			dan = 7;
			for (int i = 1; i <=9; i++) {
				System.out.println(dan + "*"+i+"=" + (dan * i));
			    }
			  ////
			//1부터 100까지의 수중에
			//11의 배수이자 7의 배수인 첫번째 숫지
			
			for (int i = 1; i <=1000; i++) {
				
			
				if((i % 7 == 0) && (i % 11 == 0)) {
				System.out.println(i);
				break;
				}
			}
	}
}


		 


