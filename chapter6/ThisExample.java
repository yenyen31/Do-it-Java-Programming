package thisEx;

class Birthday
{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}
 


public class ThisExample {

	public static void main(String args[]) {
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis(); // 이 두개의 출력값이 동일하게 나옴
	}
}
