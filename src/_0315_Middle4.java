import java.util.Scanner;

//4. 3���� ������ �Է¹ް� ū ���� ��ȯ�ϴ� �޼����
//   ���� ���� ��ȯ�ϴ� �޼��带 �ۼ��ϰ� ����ϼ���
public class _0315_Middle4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num0 = 0, num1 = 0, num2 = 0;
		int min = 0, max = 0;

		num0 = inputNum("ù", sc);
		num1 = inputNum("��", sc);
		num2 = inputNum("��", sc);
		max = max(num0, num1, num2);
		min = min(num0, num1, num2);
		printMinMax(min,max);

		sc.close();

	}

	// �Է¸޼���
	public static int inputNum(String order, Scanner sc) {
		int num = 0;
		System.out.println(order + "��° ���ڸ� �Է��ϼ���");
		num = sc.nextInt();
		return num;
	}

	// �ִ밪 ��ȯ �޼���
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

	// �ּҰ� ��ȯ �޼���
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

	// ��¸޼���
	static void printMinMax(int min,int max) {
		 System.out.println("�ּҰ��� "+min+" �ִ밪�� "+max);
	 }
	 
	
	
}


