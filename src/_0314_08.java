import java.util.Random;
import java.util.Scanner;

//4. ���� ���� �� ������ ����ϴ�
//   ��ǻ�ʹ� ������ �����ϰ� ����ڴ� ���ڿ��� �Է¹޽��ϴ�
//   10�� �����ϰ� �� �� ��� �� ����ϼ���
public class _0314_08 {
	public static void main(String[] args) {
		int com = 0;
		int user = 0;
		String stUser = "";
		Random rd = new Random();
		com = rd.nextInt(3);//0~2���� ���� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����������!!");
		//System.out.println(com);//���� �� Ȯ��
		System.out.println("����,����,���� �Է��ϼ���");
		stUser = sc.nextLine(); 
		
		// ����ڿ� �Է¿� ���� ���ڸ� ����
		if(stUser.equals("����"))
			user = 0;
		else if(stUser.equals("����"))
			user = 1;
		else if(stUser.equals("��"))
			user = 2; 
		
		//�������� ������������ ��ġ
		if(com==0)
			System.out.println("��ǻ�ʹ� ����!");
		else if(com==1)
			System.out.println("��ǻ�ʹ� ����!");
		else if(com==2)
			System.out.println("��ǻ�ʹ� ��!");
		
		if(user==com) {
			System.out.println("����!");
		}
		else if((user==0&&com==2)||
				(user==1&&com==0)||
				(user==2&&com==1)) {
			System.out.println("�̰��!");
		}
		else if((user==0&&com==1)||
				(user==1&&com==2)||
				(user==2&&com==0)) {
			System.out.println("����!");
		}
		
		
		sc.close();
	
		
		
		
	}

}
