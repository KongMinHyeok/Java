package step3;

import java.util.Scanner;
public class _3_01 {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);	
		int a = in.nextInt();
		
		in.close();		
		
		for(int i = 1; i<10;i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
}