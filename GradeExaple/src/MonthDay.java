import java.util.Scanner;

public class MonthDay {

	public static void main(String[] args) {
		
		

	  
	    int month = 2;

	    switch (month) {
	      case 1:
	      case 3:
	      case 5:
	      case 7:
	      case 8:
	      case 10:
	      case 12:
	        System.out.println(month + "월 31일 입니다.");
	        break;
	      case 4:
	      case 6:
	      case 9:
	      case 11:
	        System.out.println(month + "월 30일 입니다.");
	        break;
	      case 2:
	        System.out.println(month + "월 28일 입니다.");
	        break;
	      default:
	        System.out.println("잘못된 입력입니다.");
	        break;
	    }
	  }
	}

	


