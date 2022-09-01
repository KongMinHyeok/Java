package sub6;

public class Car {

	// 자동차의 속성(변수) / 전역변수
	protected String color;
	protected String name;
	protected int speed;
	
	//생성자
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	

	
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
