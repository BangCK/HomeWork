import java.util.Scanner;

//3. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
//   작은 값을 반환하는 메서드를 작성하고 사용하세요
public class _0315_Basic3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num0 = 0, num1 = 0;
        int min = 0, max = 0;
		
        num0 = inputNum("첫",sc);
        num1 = inputNum("두",sc);
        min = min(num0,num1);
        max = max(num0,num1);
        printMinMax(min,max);
		
		sc.close();
		
	}
	//입력메서드
	public static int inputNum(String order, Scanner sc) {
		int num = 0;
		System.out.println(order+" 번째 숫자를 입력하세요");
		num = sc.nextInt();
		return num;
						
	}
	// 큰 값을 계산하는 메서드
	 public static int max(int num0,int num1) {
		 
		 int max = 0;
		 if(num0> num1) {
			 max = num0;
			 
		 }
		 if(num0<num1) {
			 max = num1;
			 
		 }
		 else if(num1 == num0) {
			 max = num0;
		 }
		 return max;
		 
	 }
	 //작은 값을 계산하는 메서드
	 public static int min(int num0,int num1) {
		 int min = 0;
		 
		 if(num1 > num0) {
			 min = num0;
		 }
		 if(num1 < num0) {
			 min = num1;
		 }
		 else if(num1 == num0) {
			 min = num0;
		 }
		 
		 return min;
		 
			 
		 
	 }
	 //출력메서드
	 public static void printMinMax(int min,int max) {
		 
		 System.out.println("작은 값은 "+min+" 큰 값은 "+max);
	 }

}
