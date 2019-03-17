import java.util.Scanner;

//1. 정수 10개를 입력받아 배열에 저장하고, 이 정수중에서 3의 배수만 출력하세요
public class _0315_Basic1 {
	public static void main(String[] args) {
		
		int[] nums = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0;i<nums.length;i++) {
			System.out.println("정수를 입력하세요");
			nums[i] = sc.nextInt();			
			}
		
		System.out.println();
		for(int i =0;i<nums.length;i++) {
		if(nums[i]%3==0&&nums[i]!=0) {
			System.out.print(nums[i]+", ");
		}
		
		sc.close();
		
	}

	}
}
