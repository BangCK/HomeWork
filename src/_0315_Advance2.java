import java.util.Arrays;
import java.util.Random;

//2. 선택정렬을 이용해서 배열의 오름차순으로 정렬하는 메서드와
//   내림차순으로 정렬하는 메서드를 만들고 사용해보세요
public class _0315_Advance2 {
	public static void main(String[] args) {
		int[] nums = new int[5];
		inputArray(nums);
		abc(nums);
		printArray(nums);
		cba(nums);
		printArray(nums);

	}
	//오름차순
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
	//내림차순
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
	
	// 배열에 랜덤 수  입력
	public static void inputArray(int[]array) {
		Random rd = new Random();
		for (int i = 0;i<array.length;i++) {
			array[i] = rd.nextInt(10);
		}
		
		
	}
	
	// 출력메서드
	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	
}
