import java.util.Scanner;

//1. 연도를 입력받으세요
//   윤년인지 아닌지를 판별하세요
//   4로 나누어 떨어지는 해는 일단 윤년에 포함시킵니다
//   하지만 윤년중에 100으로 나누어떨어지는 해는 평년으로 하되
//   평년중에 400으로 나누어 떨어지는 해는 윤년에 해당합니다
public class _0314_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int year = sc.nextInt();
		
		if((year%4==0)&&(year%100!=0)) {
			System.out.println("윤년입니다");			
		}
		else if ((year%4==0)&&(year%100==0)&&(year%400==0)) {
			System.out.println("윤년입니다");
		}
		else
			System.out.println("평년입니다");
		
		sc.close();
	}

}
