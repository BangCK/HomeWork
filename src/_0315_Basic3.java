import java.util.Scanner;

//3. 2���� ������ �Է¹ް� ū ���� ��ȯ�ϴ� �޼����
//   ���� ���� ��ȯ�ϴ� �޼��带 �ۼ��ϰ� ����ϼ���
public class _0315_Basic3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num0 = 0, num1 = 0;
        int min = 0, max = 0;
		
        num0 = inputNum("ù",sc);
        num1 = inputNum("��",sc);
        min = min(num0,num1);
        max = max(num0,num1);
        printMinMax(min,max);
		
		sc.close();
		
	}
	//�Է¸޼���
	public static int inputNum(String order, Scanner sc) {
		int num = 0;
		System.out.println(order+" ��° ���ڸ� �Է��ϼ���");
		num = sc.nextInt();
		return num;
						
	}
	// ū ���� ����ϴ� �޼���
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
	 //���� ���� ����ϴ� �޼���
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
	 //��¸޼���
	 public static void printMinMax(int min,int max) {
		 
		 System.out.println("���� ���� "+min+" ū ���� "+max);
	 }

}
