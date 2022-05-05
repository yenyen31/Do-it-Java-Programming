package thisEx;

class Person{
	String name;
	int age;
	
	public Person() {
		/*name = "이름없음";
		age = 1;
		*/
		this("이름없음", 1); // 이렇게 한 줄로 호출 가능
	}
	 
	public Person (String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() { // 클래스 이름 값을 리턴 값으로 가짐
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
