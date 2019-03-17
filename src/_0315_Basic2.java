//2. 1부터 10까지 곱해서 그 결과를 출력하는 프로그램을 작성하세요
public class _0315_Basic2 {
	public static void main(String[] args) {
		
		int result = 1;
		
		for(int i = 1;i<=10;i++) {
			//result = result*i;
			result *= i;
			
		}
		System.out.println("결과값은 "+result);
	}

}
