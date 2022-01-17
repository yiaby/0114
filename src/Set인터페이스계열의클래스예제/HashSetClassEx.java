package Set�������̽��迭��Ŭ��������;

import java.util.HashSet;
import java.util.Set;

/*
 *HashSet�� ��ü�� �����ϱ����� 
   * ���� ��ü��hashCode()�޼ҵ带 ȣ���ؼ� �ؽ��ڵ带 ���´�.
   * �׸��� �̹� ����Ǿ� �ִ�  ��ü���� �ؽ��ڵ�� ���Ѵ�.
   * ���� ������ �ؽ��ڵ尡 �ִٸ� equals()�޼ҵ�� �� ��ü�� ���ؼ�
   * true�������� ������ ��ü�� �Ǵ��ϰ� �ߺ� ������ ���� �ʴ´�.
   *  
*/
public class HashSetClassEx {

	public static void main(String[] args) {
		//HashSet ��ü����
        Set<Member>member_set = new HashSet<Member>();
        
        //[���]������ => �Ȱ��� ��ü�� �� ���̸� �ȵȴ�. ���� �ϳ��� ��ü�� �����Ǿ�� �Ѵ�.
		Member member1 = new Member("�����", 31, "111111-1111111");
		Member member2 = new Member("�����", 31, "111111-1111111");
	
	    member_set.add(member1);
	    member_set.add(member2);
	
	    System.out.println("��ü�� �Ѱ�����?"+member_set.size());
	    //��ü�� �Ѱ�����?1
	    
	    System.out.println(member1.hashCode());//-1166721462
	    System.out.println(member2.hashCode());//-1166721462

	    System.out.println(member1.equals(member2));//true
	    
	}

}
