package Set�������̽��迭��Ŭ��������;
//           �ڽ�Ŭ���� extends �θ�Ŭ����
public class Member extends Object{
  //��� ����(=�ν��Ͻ� ����)
	public String name; //�̸�
	public int age;//����
	public String juminNum; //�ֹι�ȣ
	
	
//������                                     �Ű�����(parameter)	
	public Member(String name,int age,String juminNum) {
		this.name = name;//�̸� �ٸ��� this ���ص� ��(this:������ Ŭ������ �������� ��Ī��)
		this.age = age;
		this.juminNum = juminNum;
	}
	//�θ� Ŭ������ �޼ҵ带 �������� �������̵� ��Ű�� ��� 
	//=> ����e�� �Է��ϰ� ctrl+spacebar ���ÿ� ������ �޼ҵ尡 ���.���� Ŭ���Ѵ�.
     @Override //������̼�:�θ�Ŭ������ �޼ҵ����� �˷��� ����,���������� ����
    	public boolean equals(Object obj) {
    		if(obj instanceof Member) {
    			Member member =(Member)obj;
    			return member.name.equals(name)&&(member.age==age)
    					&& member.juminNum.equals(juminNum);
    		}else {
    			return false;
    		}
    		}
    		
    	
     
     
     @Override 
    	public int hashCode() {
    		return name.hashCode() + age + juminNum.hashCode(); 
    		
    	}

}
