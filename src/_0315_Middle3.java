import java.util.Random;

//3. 20개 배열을 선언하세요
//    20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
//    먼저 인덱스의 홀수번째는 앞에서부터 출력하고
//    짝수번째는 뒤에서부터 출력하세요
public class _0315_Middle3 {
	public static void main(String[] args) {

		Random rd = new Random();
		int[] nums = new int[20];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(101);
			//System.out.print(nums[i]+", ");
		}
		System.out.println("홀수번째 출력");

		for (int i = 0; i < nums.length; i++) {

			if (i % 2 == 1) {
				System.out.println("nums" + "[" + i + "] = " + nums[i]);
			}
		}
		
		System.out.println("짝수번째 출력");
		
		for (int i = nums.length-1; i >= 0; i--) {

			if (i % 2 == 0) {
				System.out.println("nums" + "[" + i + "] = " + nums[i]);
			}
		}

	}

}
