package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) 
	{ // 버스 번호
		this.busNumber = busNumber;
		// 만약에 메소드 괄호 안에 int Number을 int num 이라고 받으면
		// bueNumber = num 이라고 해도 ㅇㅋ, 근데 자바에서는 this 많이 씀
	}
	
	public void take(int money) // 버스에 승객을 태우는 메소드
	{
		passengerCount++;
		this.money += money;
	}
	
	public void showInfo() 
	{ // 버스의 정보를 보여주는 메소드
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은"
				+ money + "입니다.");
	}
}
