package step1;

import java.util.Scanner;

public class _10 {

	public static void main(String[] args) {
	
		int arr [] = {1, 1, 2, 2, 2, 8};
		
		Scanner sc = new Scanner(System.in);
		
		int b[] = new int[6];
		int c[] = new int[6];
		
		for(int i=0; i<b.length; i++) {
			b[i] = sc.nextInt();	
		}
		sc.close();
		for(int a=0; a<c.length; a++) {
			System.out.println(arr[a] - b[a]);
		}
	}
	
	
}

