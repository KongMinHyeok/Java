package sub3;
/*
 * 날짜 : 2022/08/23
 * 이름 : 공민혁
 * 내용 : Java 메서드 실습하기
 * 
 * 메서드(Method)
 *  - 자주 사용하는 코드로직을 모듈화한 구조체(코드 덩어리)
 *  - 메서드에 선언한 변수는 지역변수이고 해당 메서드가 끝나면 메모리에서 소멸
 * 
 */

public class MethodTest {

	// 전역변수
	int num = 1;
	
	public static void main(String[] args) {
		
		// 메서드 호출
		int r1 = f(1);
		int r2 = f(2);
		int r3 = f(3);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		
		// 메서드 지역변수와 스택 (1,10) = argument 인자값
		int t1 = sum(1, 10);
		int t2 = sum(1, 100);
		
		System.out.println("t1 : "+t1);
		System.out.println("t2 : "+t2);
		
	}// main end
	
	// 메서드 정의 / void = 없다 / f() 반환값이 없다
	// 메서드는 항상 소문자로 시작
 	public static int f(int x) {
 		
 		int y = 2 * x + 3;
	
 		return y;
	}// f end
 	
 	// 메서드 정의 (int start, int end = 매개변수 parameter)
 	public static int sum(int start, int end) {
 	
 		// 지역변수 메서드가 끝나면 지역변수는 메모리상에 사라짐 (메서드안에 종속되는 변수들)
 	 	
 		int total = 0;
 		
 		for(int k=start; k<=end; k++) {
 			total += k;
 			
 		}
 		
 		return total;
 		
 	}
}
