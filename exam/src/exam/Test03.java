package exam;

public class Test03 {

	public static void main(String[] args) {
		
		int num = 1;
		int result = num + num;
		
		
		result = num++;
		System.out.println("result : "+result);
		
		result = ++num;
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);
		
	}
	
}
