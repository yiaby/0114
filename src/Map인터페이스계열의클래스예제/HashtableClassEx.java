package Map인터페이스계열의클래스예제;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/*
 * 로그인 인증처리 =>ID와 Password 일치 여부 판단하는 프로그램
 */
public class HashtableClassEx {

	public static void main(String[] args) {
		String[] userID = { "Lee", "Kim", "Jang", "Wang", "Ha" };// 키
		String[] password = { "L123", "K456", "J234", "W879", "H23" };// 값

		// Hashtable객체 생성
		Map<String, String> ht = new Hashtable<String, String>(userID.length);

		// Hashtable객체 저장
		for (int i = 0; i < userID.length; i++) {
			ht.put(userID[i], password[i]);

		}
		System.out.println(ht);
		// {Jang=J234, Ha=H23, Lee=L123, Wang=W879, Kim=K456} 순서X=>키를 통해서 검색하기 때문
		//[중요]키와 값이한쌍으로 저장

		// 로그인 인증처리
		boolean FLAG = true;

		while (FLAG) {// 무한 Loop
			System.out.print("유저ID는?");
			Scanner scan = new Scanner(System.in);
			String user_key = scan.nextLine(); //Lee라고 가정
			String pw_value = ht.get(user_key);//L123라고 가정
		
			if(pw_value != null) {
				System.out.print("유저Password는?");
			String passwordInput = scan.nextLine();
			
			if(pw_value.equals(passwordInput)) {
				System.out.println("인증처리 성공, 암호가 일치합니다.");
			}else {System.out.println("인증처리 실패,암호가 일치하지 않습니다.");}
			}else{System.out.println("입력한 유저 ID는 등록되어 있지 않습니다.");
			}
	}
			
			}

}
