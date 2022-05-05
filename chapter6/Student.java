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
	
	// 버스 타는 행위
	public void takeBus(Bus bus) 
	{
		bus.take(1000); // 객체의 협업이 일어난 부분
		money -= 1000;
	}
	
	// 지하철 타는 행위
	public void takeSubway(Subway subway) 
	{
		subway.take(1500); // 객체의 협업이 일어난 부분
		money -= 1500;
	}
	
	public void shoeInfo() 
	{
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
	}
	
	
}


