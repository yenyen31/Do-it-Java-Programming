package singleton;

public class Company {
	
	private static Company instance = new Company(); // 이 전체에서 유일하게 사용될 인스턴스
	
	private Company(){} // private constructor 생성
	
	public static Company getInstance() {
		if(instance == null)
			instance = new Company();
		return instance;
	}  
}
