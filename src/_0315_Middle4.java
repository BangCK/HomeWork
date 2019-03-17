import java.util.Scanner;

//4. 3개의 정수를 입력받고 큰 값을 반환하는 메서드와
//   작은 값을 반환하는 메서드를 작성하고 사용하세요
public class _0315_Middle4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num0 = 0, num1 = 0, num2 = 0;
		int min = 0, max = 0;

		num0 = inputNum("첫", sc);
		num1 = inputNum("두", sc);
		num2 = inputNum("세", sc);
		max = max(num0, num1, num2);
		min = min(num0, num1, num2);
		printMinMax(min,max);

		sc.close();

	}

	// 입력메서드
	public static int inputNum(String order, Scanner sc) {
		int num = 0;
		System.out.println(order + "번째 숫자를 입력하세요");
		num = sc.nextInt();
		return num;
	}

	// 최대값 반환 메서드
	public static int max(int num0, int num1, int num2) {
		int max = 0;

		if (num0 > num1 && num0 > num2) {
			max = num0;
		} 
		else if (num1 > num0 && num1 > num2) {
			max = num1;
		} 
		else
			max = num2;
		return max;

	}

	// 최소값 반환 메서드
	public static int min(int num0, int num1, int num2) {
		 int min = 0;
		 
		 if(num0<num1&&num0<num2) {
			 min = num0;
		 }
		 else if(num1<num0&&num1<num2) {
			 min = num1;
		 }
		 else 
			 min = num2;
		 return min;	 
		 
	 }

	// 출력메서드
	static void printMinMax(int min,int max) {
		 System.out.println("최소값은 "+min+" 최대값은 "+max);
	 }
	 
	
	
}


