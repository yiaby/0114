package Set�������̽��迭��Ŭ��������;
/*
 * Set �̶�� �������̽��� �������� Ŭ�������(HashSet, TreeSet)�� ������ ��ü��
 * ù°; ������ �������� �ʰ� ����Ǹ�
 * ��°; �ߺ����� ��� ���� 
 */
import java.util.HashSet;
import java.util.Set;

public class HashSetClassEx02 {

	public static void main(String[] args) {
		Set<String>hashSet = new HashSet<String>();
		
		hashSet.add(new String("����ȣ"));
		hashSet.add(new String("������"));
		hashSet.add(new String("����ö"));
		hashSet.add(new String("����ö"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("����ö"));
		
		
		System.out.println(hashSet);
		//[ȫ����, ������, ����ö, ����ȣ, ����ö]
	
	
	}

}
