package Map�������̽��迭��Ŭ��������;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesClassEX {

	public static void main(String[] args) {
		//��ü ����
		Properties prop = new Properties();
		//prop�� ����Ű�� ��ü�� key,value �� �ֱ�
		prop.setProperty("name", "ȫ�浿");
		prop.setProperty("email", "hong77@naver.com");
		prop.setProperty("HP", "010-2315-1234");
		
		//System.out.println(prop);
		//{email = hong77@naver.com, name = ȫ�浵, HP=010-2315-1234};
		
		//��������
		Enumeration enu = prop.propertyNames();
		
		while(enu.hasMoreElements()) {
			String ele = (String)enu.nextElement();
			System.out.println(ele+":"+prop.getProperty(ele));
		}
	}

}
