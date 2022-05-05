package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();

		System.out.println(c1);
		System.out.println(c2); // 두 개의 주소값은 동일
		
		Calendar cal = Calendar.getInstance(); // java.util에 있는 예시
	}

}
