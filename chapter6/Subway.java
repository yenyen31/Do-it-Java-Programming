package cooperation;

public class Subway 
{
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) 
	{ // 지하철 노선 번호
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) // 버스에 승객을 태우는 메소드
	{
		passengerCount++;
		this.money += money;
	}
	
	public void showInfo() 
	{ // 버스의 정보를 보여주는 메소드
		System.out.println("지차헐 " + lineNumber + "호선의 승객은 " + passengerCount + "명이고, 수입은"
				+ money + "입니다.");
	}

}
