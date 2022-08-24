package sub2;

/*
 * 날짜 : 2022/08/24 
 * 이름 : 공민혁
 * 내용 : Java 캡슐화 실습하기
 * 
 * 캡슐화(Encapsulation)
 * - 캡슐화는 객체의 속성(필드)을 외부에서 참조하지 못하도록 객체의 정보를 은닉하는 특성
 * - 클래스의 속성은 반드시 private 선언을 통해 캡슐화 해야한다.
 * - 은닉된 정보(속성)의 안전한 참조를 위해 getter, setter를 정의한다.
 * 
 */


public class EncapsuleTest {

	public static void main(String[] args) {
		
		// 객체 생성과 초기화
		Car sonata = new Car("소나타", "흰색", 0);
		
		sonata.setColor("은색");
		
		//기능
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Account nb = new Account("농협은행", "sebar0112", "공민혁", 10000);
		
		nb.deposit(50000);
		nb.withdraw(30000);
		nb.show();
	}
	
}
