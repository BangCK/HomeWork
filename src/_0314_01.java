import java.util.Scanner;

//1. ������ �Է¹�������
//   �������� �ƴ����� �Ǻ��ϼ���
//   4�� ������ �������� �ش� �ϴ� ���⿡ ���Խ�ŵ�ϴ�
//   ������ �����߿� 100���� ����������� �ش� ������� �ϵ�
//   ����߿� 400���� ������ �������� �ش� ���⿡ �ش��մϴ�
public class _0314_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int year = sc.nextInt();
		
		if((year%4==0)&&(year%100!=0)) {
			System.out.println("�����Դϴ�");			
		}
		else if ((year%4==0)&&(year%100==0)&&(year%400==0)) {
			System.out.println("�����Դϴ�");
		}
		else
			System.out.println("����Դϴ�");
		
		sc.close();
	}

}
