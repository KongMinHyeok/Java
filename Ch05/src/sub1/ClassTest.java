package sub1;

/*
 * 날짜 : 2022/08/24
 * 이름 : 공민혁
 * 내용 : Java 클래서 객체 실습하기
 */

public class ClassTest {

	public static void main(String[] args) {
		
		Car sonata;
		//객체 생성 (참조변수 = 객체)
		sonata = new Car();
		
		//객체 속성 초기화 
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		//객체 기능 실행
		sonata.speedUp(100);
		sonata.speedDown(40);
		sonata.show();
		
		//객체 생성
		Car bmw = new Car();
		bmw.name = "bmw 520";
		bmw.color = "남색";
		bmw.speed = 0;
		
		bmw.speedUp(80);
		bmw.speedDown(40);
		bmw.show();
		
		//Account 객체 생성
		Account kb = new Account();
		
		//초기화
		kb.bank = "국민은행";
		kb.id = "101-11-1001";
		kb.name = "김유신";
		kb.balance = 0;
	
		kb.deposit(100000);
		kb.withdraw(35000);
		kb.show();
		
		//Account 객체 생성, 초기화, 기능
		Account wr = new Account();
		
		wr.bank = "우리은행";
		wr.id = "101-12-1111";
		wr.name = "김춘추";
		wr.balance = 10000;
		
		wr.deposit(50000);
		wr.withdraw(30000);
		wr.show();
	}
	
}
