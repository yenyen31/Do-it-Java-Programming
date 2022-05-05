package staticex;

public class Student {

	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() { // 학생이 추가될 떄 마다 학번을 증가시키고 싶음
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10; // 지역변수
		i++;
		System.out.println(i);
		
		// studentName = "박보검"; // 멤버변수, 인스턴스변수
		
		return serialNum; // static변수, 클래스 변수
	}
	
}
