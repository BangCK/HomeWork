import java.util.Random;

//3. 20�� �迭�� �����ϼ���
//    20���� ���� ������ �̿��ؼ� 0 ~ 100������ ������ ä���ְ�
//    ���� �ε����� Ȧ����°�� �տ������� ����ϰ�
//    ¦����°�� �ڿ������� ����ϼ���
public class _0315_Middle3 {
	public static void main(String[] args) {

		Random rd = new Random();
		int[] nums = new int[20];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(101);
			//System.out.print(nums[i]+", ");
		}
		System.out.println("Ȧ����° ���");

		for (int i = 0; i < nums.length; i++) {

			if (i % 2 == 1) {
				System.out.println("nums" + "[" + i + "] = " + nums[i]);
			}
		}
		
		System.out.println("¦����° ���");
		
		for (int i = nums.length-1; i >= 0; i--) {

			if (i % 2 == 0) {
				System.out.println("nums" + "[" + i + "] = " + nums[i]);
			}
		}

	}

}
