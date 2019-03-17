import java.util.Random;
import java.util.Scanner;

//4. 가위 바위 보 게임을 만듭니다
//   컴퓨터는 난수로 생성하고 사용자는 문자열로 입력받습니다
//   10번 진행하고 승 패 비김 을 출력하세요
public class _0314_08 {
	public static void main(String[] args) {
		int com = 0;
		int user = 0;
		String stUser = "";
		Random rd = new Random();
		com = rd.nextInt(3);//0~2까지 숫자 랜덤
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보!!");
		//System.out.println(com);//랜덤 수 확인
		System.out.println("가위,바위,보를 입력하세요");
		stUser = sc.nextLine(); 
		
		// 사용자에 입력에 따라서 숫자를 지정
		if(stUser.equals("가위"))
			user = 0;
		else if(stUser.equals("바위"))
			user = 1;
		else if(stUser.equals("보"))
			user = 2; 
		
		//랜덤수를 가위바위보와 매치
		if(com==0)
			System.out.println("컴퓨터는 가위!");
		else if(com==1)
			System.out.println("컴퓨터는 바위!");
		else if(com==2)
			System.out.println("컴퓨터는 보!");
		
		if(user==com) {
			System.out.println("비겼다!");
		}
		else if((user==0&&com==2)||
				(user==1&&com==0)||
				(user==2&&com==1)) {
			System.out.println("이겼다!");
		}
		else if((user==0&&com==1)||
				(user==1&&com==2)||
				(user==2&&com==0)) {
			System.out.println("졌다!");
		}
		
		
		sc.close();
	
		
		
		
	}

}
