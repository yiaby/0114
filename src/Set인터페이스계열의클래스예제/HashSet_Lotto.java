package Set�������̽��迭��Ŭ��������;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
/*
 * HashSet ��ü�� �����ϸ� ��ü ������ ���� ����
 * 
 * */
public class HashSet_Lotto {

	public static void main(String[] args) {
		Set set = new HashSet();

		for (int i = 0; set.size() < 6; i++) {
			Random rnd = new Random(); //���� �߻��ϴ� Ŭ����
			int number = rnd.nextInt(45) + 1; //1~45������ ���� �߻�
			set.add(new Integer(number));

		}
		List list = new ArrayList(set);
		Collections.sort(list);
		System.out.println("<<�ζǹ�ȣ �����ֱ�>>");
		System.out.println(list);

	}

}
