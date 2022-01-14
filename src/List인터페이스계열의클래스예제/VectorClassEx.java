package List�������̽��迭��Ŭ��������;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorClassEx {

	public static void main(String[] args) {
		// ���� �迭 ��ü ����
		String[] name = { "������", "����ȣ", "������", "�����", "�ڰ渮" };

		// ���� �迭 ��ü ����<E> ���׸� ��� => Element(���)
		// List<��üŸ��>�������� = new ������<��üŸ��>(�Ű�����1,�Ű�����2);
		// List<String> list = new Vector<String>();�⺻ 10�� ���� Ȯ��
		// (�ʱⰳ��4��,������ �����Ѹ� 3���� �ø���.)
		List<String> list = new Vector<String>(4, 3);
		System.out.println("������ �뷮��: " + ((Vector<String>) list).capacity());
		// ������ �뷮��: 4

		// ���� �迭�� String ��ü����Vector �����迭�� �����ϱ�
		for (int i = 0; i < name.length; i++) {
			list.add(name[i]);
		}
		System.out.println(list);
		// [������, ����ȣ, ������, �����, �ڰ渮]//��ü�� ��ü ���̴� ,�������� ���еȴ�.
		System.out.println("������ �뷮��: " + ((Vector<String>) list).capacity());// �뷮�� ũ��
		// ������ �뷮��: 7
		System.out.println("���Ϳ� ����� ����� ������" + list.size());// ���Ϳ� ����� ��ü�� ����

		list.add("�ڱ���");
		System.out.println(list);
		// [������, ����ȣ, ������, �����, �ڰ渮, �ڱ���]

		// �����迭 �߰��� ��ü ����ֱ�(����) �������� ����ȣ ���̿�"������"�� ����
		list.add(1, "������");
		System.out.println(list);
		// [������, ������, ����ȣ, ������, �����, �ڰ渮, �ڱ���]

		// ��ü �˻�
		System.out.println(list.get(2));// ����ȣ

		boolean contains_result = list.contains("�����");// contains:"�����"�� ���ԵǾ� �ִ���
		System.out.println(contains_result);// true

		// boolean contains_result2 = list.contains("ȫ�浿");//contains:"ȫ�浿"�� ���ԵǾ� �ִ���
		// System.out.println(contains_result2);//false

		for (String item : list) {// ���� for��
			System.out.print(item + "\t");// tap��ŭ ����
			// ������ ������ ����ȣ ������ ����� �ڰ渮 �ڱ���

			// ��ü �����ϱ�=>����ȣ ��ü�� �̹��� ��ü�� �����ϱ�
		}
		System.out.println();// �ٹٲ�

		// ��ä �����ϱ� => ����ȣ ��ü�� �̹��� ��ü�� �����ϱ�
		list.set(2, "�̹���");
		System.out.println(list);

		// ��ü �����ϱ� => ������ ��ü �����ϱ�
		list.remove(3);
		System.out.println(list);
		// [������, ������, �̹���, ��ȫ��, �ڰ渮, �ڱ���]

		// ��ü �����ϱ� => ������ ��ü �����ϱ�
		list.remove("������");
		System.out.println(list);
		// [������, �̹���, ��ȫ��, �ڰ渮, �ڱ���]

		/* ���� �迭�� ��ü �����ϱ� => ��������(Ascending Sort ���ڷ� asc) */
		System.out.println();// �ٹٲ�
		System.out.println("[��ü �������� �����ϱ�]");
		Collections.sort(list);
		System.out.println(list);
		// [������, ��ȫ��, �ڰ渮, �ڱ���, �̹���]

		/* ���� �迭�� ��ü �����ϱ� => ��������(Descending Sort ���ڷ� desc) */
		System.out.println();// �ٹٲ�
		System.out.println("[��ü �������� �����ϱ�]");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		// [�̹���, �ڱ���, �ڰ渮, �����, ������]

		System.out.println();// �ٹٲ�
		list.add("�����");
		System.out.println(list);
		// [�̹���, �ڱ���, �ڰ渮, �����, ������, �����]=>�ߺ� ���� ����

	
	
	}

}
