import java.util.Arrays;
import java.util.Random;

//2. ���������� �̿��ؼ� �迭�� ������������ �����ϴ� �޼����
//   ������������ �����ϴ� �޼��带 ����� ����غ�����
public class _0315_Advance2 {
	public static void main(String[] args) {
		int[] nums = new int[5];
		inputArray(nums);
		abc(nums);
		printArray(nums);
		cba(nums);
		printArray(nums);

	}
	//��������
	public static void abc(int[] nums) {
		int[] temp = new int[5];

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i; j < nums.length; j++)
				if (nums[i] > nums[j]) {
					temp[i] = nums[i];
					nums[i] = nums[j];
					nums[j] = temp[i];

				} else {
					nums[i] = nums[i];
				}

		}
	}
	//��������
	public static void cba(int[] nums) {
		int[] temp = new int[5];

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i; j < nums.length; j++)
				if (nums[i] < nums[j]) {
					temp[i] = nums[i];
					nums[i] = nums[j];
					nums[j] = temp[i];

				} else {
					nums[i] = nums[i];
				}

		}

	}
	
	// �迭�� ���� ��  �Է�
	public static void inputArray(int[]array) {
		Random rd = new Random();
		for (int i = 0;i<array.length;i++) {
			array[i] = rd.nextInt(10);
		}
		
		
	}
	
	// ��¸޼���
	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	
}
