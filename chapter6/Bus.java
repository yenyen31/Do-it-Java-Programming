package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) 
	{ // ���� ��ȣ
		this.busNumber = busNumber;
		// ���࿡ �޼ҵ� ��ȣ �ȿ� int Number�� int num �̶�� ������
		// bueNumber = num �̶�� �ص� ����, �ٵ� �ڹٿ����� this ���� ��
	}
	
	public void take(int money) // ������ �°��� �¿�� �޼ҵ�
	{
		passengerCount++;
		this.money += money;
	}
	
	public void showInfo() 
	{ // ������ ������ �����ִ� �޼ҵ�
		System.out.println("���� " + busNumber + "���� �°��� " + passengerCount + "���̰�, ������"
				+ money + "�Դϴ�.");
	}
}
