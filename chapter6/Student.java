package staticex;

public class Student {

	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() { // �л��� �߰��� �� ���� �й��� ������Ű�� ����
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10; // ��������
		i++;
		System.out.println(i);
		
		// studentName = "�ں���"; // �������, �ν��Ͻ�����
		
		return serialNum; // static����, Ŭ���� ����
	}
	
}
