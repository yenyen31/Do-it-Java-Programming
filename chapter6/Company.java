package singleton;

public class Company {
	
	private static Company instance = new Company(); // �� ��ü���� �����ϰ� ���� �ν��Ͻ�
	
	private Company(){} // private constructor ����
	
	public static Company getInstance() {
		if(instance == null)
			instance = new Company();
		return instance;
	}  
}
