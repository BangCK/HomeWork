import java.util.Scanner;

//2. 2���� ��鿡�� �ϳ��� ���簢���� �� ������ ǥ���ȴ�.
//   (50, 50)�� (100, 100)�� �� ������ �̷���� �簢���� �ִٰ� ����.
//   �� �� Ű����κ��� �� ���� �����ϴ� ���� x�� y�� �Է¹ް�
//   ��(x, y)�� �� ���簢�� �ȿ� �ִ��� �ۿ� �ִ��� �Ǻ��ϴ� ���α׷���
//   �ۼ��ϼ���
public class _0314_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =0, y=0;
		
		System.out.println("��ǥ�� �Է��ϼ���");
		System.out.print("x : ");
		x = sc.nextInt();
		System.out.print("y : ");
		y = sc.nextInt();
		
		if((x>=50)&&(x<=100)) {
			if((y>=50)&&(y<=100)) {
				System.out.println("("+x+","+y+")�� ���簢�� �ȿ� ����");
			}
		}
		else 
			System.out.println("("+x+","+y+")�� ���簢�� �ۿ� ����");
		
		sc.close();
	}

}
