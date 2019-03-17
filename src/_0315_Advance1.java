//1. AB + BA = 99 를 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하세요
public class _0315_Advance1 {
	public static void main(String[] args) {
		
		for(int i =0;i<=9;i++) {
			for(int j = 0;i<=9;j++) {
				
				if(((i*10+j)+(j*10+i)==99)) {
					System.out.println(i+j+"+"+j+i+"=99");
					System.out.println();
				}
			}
		}
	}

}
