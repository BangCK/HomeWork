import java.util.Scanner;

//2. 2차원 평면에서 하나의 직사각형은 두 점으로 표현된다.
//   (50, 50)과 (100, 100)의 두 점으로 이루어진 사각형이 있다고 하자.
//   이 때 키보드로부터 한 점을 구성하는 정수 x와 y를 입력받고
//   점(x, y)가 이 직사각형 안에 있는지 밖에 있는지 판별하는 프로그램을
//   작성하세요
public class _0314_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =0, y=0;
		
		System.out.println("좌표를 입력하세요");
		System.out.print("x : ");
		x = sc.nextInt();
		System.out.print("y : ");
		y = sc.nextInt();
		
		if((x>=50)&&(x<=100)) {
			if((y>=50)&&(y<=100)) {
				System.out.println("("+x+","+y+")는 직사각형 안에 존재");
			}
		}
		else 
			System.out.println("("+x+","+y+")는 직사각형 밖에 존재");
		
		sc.close();
	}

}
