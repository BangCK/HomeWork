//1. AB + BA = 99 �� �����ϴ� ��� A�� B�� ������ ���ϴ� ���α׷��� �ۼ��ϼ���
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
