package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student james = new Student("james", 5000);
		Student mark = new Student("mark", 10000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100); // 제임스가 버스 100을 탐
		james.shoeInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		mark.takeSubway(subwayGreen);
		mark.shoeInfo();
		subwayGreen.showInfo();
	}

}
