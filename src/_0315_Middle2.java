import java.util.Scanner;

//2. 0���� ū ������ �Է¹ް� �������� 16������ ����ϼ���
public class _0315_Middle2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int mok =1, nmg =1;
		int[] nums = new int[20];
		int i ;

		System.out.println("0���� ū ������ �Է��ϼ���");
		num = sc.nextInt();
		
		//%02X%n 2�ڸ� ���(16����)�� �빮�ڷ� ǥ�� 1�ڸ��� �տ� 0�� ǥ�� %n�ٹٲ�
		
		System.out.format("�Է��� ������ 16������ ��ȯ�ϸ� %2X\n",num); 

		for (i = 0; mok != 0; i++) {
			mok = num / 2;
			nmg = num % 2;
			nums[i] = nmg;
			num = mok;

		}
		
		System.out.print("�Է��� ������ �������� ��ȯ�ϸ� ");
		for(int j = i-1;j>=0;j--) {
			System.out.print(nums[j]);
		}
		
		sc.close();

	}

}
