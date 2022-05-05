package thisEx;

class Person{
	String name;
	int age;
	
	public Person() {
		/*name = "�̸�����";
		age = 1;
		*/
		this("�̸�����", 1); // �̷��� �� �ٷ� ȣ�� ����
	}
	 
	public Person (String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() { // Ŭ���� �̸� ���� ���� ������ ����
		return this; 
	}
}


public class CallAnotherConst {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf());
	}

}
