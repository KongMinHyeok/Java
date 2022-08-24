package sub1;

public class Car {

	// 자동차의 속성(변수) / 전역변수
	String color;
	String name;
	int speed;
	
	//자동차의 기능(메서드) / 지역변수
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("차량명 : "+ this.name);
		System.out.println("차량색 : "+ this.color);
		System.out.println("속도 : "+ this.speed);
	}
}
