package Input_Output;

import java.util.Scanner;

public class BOJ_1008_AB_4 {
	
	public static void main(String[] args) {
		
		// 브론즈 5
		// 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextInt(); 
		double B = sc.nextInt();
		
		System.out.println(A / B);
		
		// float는 소수 정밀도가 7자리 정도밖에 안되기에
		// double을 사용해야 한다. (해당 문제는 정밀한 값을 요구한다.)
		
	}

}
