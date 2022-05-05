package cooperation;

public class Student 
{

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money)
	{
		this.studentName = studentName;
		this.money = money;
	}
	
	// ���� Ÿ�� ����
	public void takeBus(Bus bus) 
	{
		bus.take(1000); // ��ü�� ������ �Ͼ �κ�
		money -= 1000;
	}
	
	// ����ö Ÿ�� ����
	public void takeSubway(Subway subway) 
	{
		subway.take(1500); // ��ü�� ������ �Ͼ �κ�
		money -= 1500;
	}
	
	public void shoeInfo() 
	{
		System.out.println(studentName + "���� ���� ����" + money + "�Դϴ�.");
	}
	
	
}


