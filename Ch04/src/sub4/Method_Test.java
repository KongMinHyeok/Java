package sub4;

import java.util.Scanner;

public class Method_Test {
	
	public static int num(int a, int b) {
		
		int res = a;
		if(a < b) {
		 res = b;
		}
		return res;
	
	}
	public static int decimal(int a) {
		int cnt = 0;
		for(int i=1; i<=a; i++) {
						
			if(a % i == 0) {
				cnt++;
			}
		
		}
		return cnt;
	}
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(num(a,b));
		
		int num = sc.nextInt();
		if(decimal(num) == 1) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
	}
	
}