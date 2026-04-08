package Input_Output;

import java.util.Scanner;

public class BOJ_10869_사칙연산 {
	
	public static void main(String[] args) {
		
		// 브론즈 5
		// 두 자연수 A와 B가 주어진다.
		// 이때 A+B, A-B, A*B, A%B(나머지)를 출력한느 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		
	}

}
