package step1;

import java.util.Scanner;

public class _12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = ((b % 10) * a);
		int d = (((b % 100) / 10) * a);
		int e = ((b / 100) * a);
		int f = a * b;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
	
}
