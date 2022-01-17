package Map�������̽��迭��Ŭ��������;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapClassEX {

	public static void main(String[] args) {
		// TreeMap ��ü ����
		Map<Integer, String> testMap = new TreeMap<Integer, String>();

		testMap.put(1, "apple");
		testMap.put(5, "pineapple");
		testMap.put(2, "orange");
		testMap.put(3, "strawberry");
		testMap.put(4, "melon");
		// System.out.println(testMap);
		// {1=apple, 2=orange, 3=strawberry, 4=melon, 5=pineapple}
		
		Iterator<Integer> it = testMap.keySet().iterator();
		//Iterator<Integer> it = ((TreeMap<Integer, String>)testMap).descendingKeySet().iterator();//iterator:�ݺ���//keySet:��������
		while (it.hasNext()) {
			int key = it.next();//�ϳ���
			System.out.println(key + "\t" + testMap.get(key));
			/*
			 * 1 apple 2 orange 3 strawberry 4 melon 5 pineapple
			 */

		}

	}

}
