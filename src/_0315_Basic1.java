import java.util.Scanner;

//1. ���� 10���� �Է¹޾� �迭�� �����ϰ�, �� �����߿��� 3�� ����� ����ϼ���
public class _0315_Basic1 {
	public static void main(String[] args) {
		
		int[] nums = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0;i<nums.length;i++) {
			System.out.println("������ �Է��ϼ���");
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
