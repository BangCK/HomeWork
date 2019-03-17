import java.util.Scanner;

//2. 0보다 큰 정수를 입력받고 이진수와 16진수로 출력하세요
public class _0315_Middle2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int mok =1, nmg =1;
		int[] nums = new int[20];
		int i ;

		System.out.println("0보다 큰 정수를 입력하세요");
		num = sc.nextInt();
		
		//%02X%n 2자리 헥사(16진수)를 대문자로 표시 1자리는 앞에 0을 표시 %n줄바꿈
		
		System.out.format("입력한 정수를 16진수로 변환하면 %2X\n",num); 

		for (i = 0; mok != 0; i++) {
			mok = num / 2;
			nmg = num % 2;
			nums[i] = nmg;
			num = mok;

		}
		
		System.out.print("입력한 정수를 이진수로 변환하면 ");
		for(int j = i-1;j>=0;j--) {
			System.out.print(nums[j]);
		}
		
		sc.close();

	}

}
