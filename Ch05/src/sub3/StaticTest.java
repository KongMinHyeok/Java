package sub3;

/*
 * 날짜 : 2022/08/25
 * 이름 : 공민혁
 * 내용 : Java 클래스 변수, 클래스 메서드 실습하기
 */

public class StaticTest {

	public static void main(String[] args) {  //car1, car2, car3 참조변수 인스턴트
		
		Car car1 = new Car("소나타", "흰색", 0);
		car1.show();
		
		Car car2 = new Car("쏘렌토", "남색", 0);
		car2.show();
		
		Car car3 = new Car("아반테", "은색", 0);
		car3.show();
		
		System.out.println("현재 전체 차량수 : " + Car.count);
	
		// 싱글톤(Singleton) 실습
		Calc cal = Calc.getInstance();
		
		int r1 = cal.plus(1, 2);
		System.out.println("r1 : "+r1);
		
	
	}
	
}
