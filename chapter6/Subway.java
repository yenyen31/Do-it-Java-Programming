package cooperation;

public class Subway 
{
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) 
	{ // ����ö �뼱 ��ȣ
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) // ������ �°��� �¿�� �޼ҵ�
	{
		passengerCount++;
		this.money += money;
	}
	
	public void showInfo() 
	{ // ������ ������ �����ִ� �޼ҵ�
		System.out.println("������ " + lineNumber + "ȣ���� �°��� " + passengerCount + "���̰�, ������"
				+ money + "�Դϴ�.");
	}

}
