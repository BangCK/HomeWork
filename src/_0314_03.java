import java.util.Scanner;

//3. 2���� ��鿡�� �ϳ��� ���簢���� �� ������ ǥ���ȴ�. (50, 50)�� (100, 100)��
//   �� ������ �̷���� ���簢���� �ִٰ� ����. 
//   �̶� Ű����κ��� �ٸ� ���簢���� �����ϴ� �� ��(x1, y1), (x2, y2)�� �Է¹޾�
//   �� ���� ���簢���� ���� �浹�ϴ��� �Ǻ��ϴ� ���α׷��� �ۼ��ϼ���
public class _0314_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 =0, x2 = 0, y1 = 0, y2 = 0;
		
		System.out.println("��ǥ�� �Է��ϼ���");
		System.out.print("x1 : ");
		x1 = sc.nextInt();
		System.out.print("y1 : ");
		y1 = sc.nextInt();
		System.out.print("x2 : ");
		x2 = sc.nextInt();
		System.out.print("y2 : ");
		y2= sc.nextInt();
		
		if((x1<=100&&x1>=50&&y1<=100&&y1>=50)||
				(x2<=100&&x2>=50&&y2<=100&&y2>=50)) {
			System.out.println("�� �簢���� �浹�մϴ�");
		}
		else
			System.out.println("�� �簢���� �浹���� �ʽ��ϴ�");
		sc.close();
		
		
	}

}
