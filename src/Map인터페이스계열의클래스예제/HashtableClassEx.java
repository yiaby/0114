package Map�������̽��迭��Ŭ��������;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/*
 * �α��� ����ó�� =>ID�� Password ��ġ ���� �Ǵ��ϴ� ���α׷�
 */
public class HashtableClassEx {

	public static void main(String[] args) {
		String[] userID = { "Lee", "Kim", "Jang", "Wang", "Ha" };// Ű
		String[] password = { "L123", "K456", "J234", "W879", "H23" };// ��

		// Hashtable��ü ����
		Map<String, String> ht = new Hashtable<String, String>(userID.length);

		// Hashtable��ü ����
		for (int i = 0; i < userID.length; i++) {
			ht.put(userID[i], password[i]);

		}
		System.out.println(ht);
		// {Jang=J234, Ha=H23, Lee=L123, Wang=W879, Kim=K456} ����X=>Ű�� ���ؼ� �˻��ϱ� ����
		//[�߿�]Ű�� �����ѽ����� ����

		// �α��� ����ó��
		boolean FLAG = true;

		while (FLAG) {// ���� Loop
			System.out.print("����ID��?");
			Scanner scan = new Scanner(System.in);
			String user_key = scan.nextLine(); //Lee��� ����
			String pw_value = ht.get(user_key);//L123��� ����
		
			if(pw_value != null) {
				System.out.print("����Password��?");
			String passwordInput = scan.nextLine();
			
			if(pw_value.equals(passwordInput)) {
				System.out.println("����ó�� ����, ��ȣ�� ��ġ�մϴ�.");
			}else {System.out.println("����ó�� ����,��ȣ�� ��ġ���� �ʽ��ϴ�.");}
			}else{System.out.println("�Է��� ���� ID�� ��ϵǾ� ���� �ʽ��ϴ�.");
			}
	}
			
			}

}
