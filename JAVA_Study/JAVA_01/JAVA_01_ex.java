package java_01_f;

public class JAVA_01_ex {
	
	public static void main(String[] args) {
		
		// 문제 1
		// 다음 코드에 반복해서 나오는 숫자 4, 3을 다른 숫자로 한번에 변경할 수 있도록 다음을 변수 num1, num2를 사용하도록 변경해보세요.
		
		/*
		System.out.println(4 + 3);
		System.out.println(4 - 3);
		System.out.println(4 * 3);
		*/
		
		/*
		int num1 = 4;
		int num2 = 3;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		*/
		
		
		// 문제 2
		// 다음과 같은 작업을 수행하는 프로그램을 작성하세요.
		// 1. 변수 num1을 선언하고 이에 10을 할당하세요.
		// 2. 변수 num2를 선언하고 이에 20을 할당하세요.
		// 3. 두 변수의 합을 구하고, 그 결과를 새로운 변수 sum에 저장하세요.
		// 4. sum 변수의 값을 출력하세요.
		
		/*
		int num1 = 10;
		int num2 = 20;
		int sum = num1 + num2;
		
		System.out.println(sum);
		*/
		
		
		// 문제 3
		// long 타입의 변수를 선언하고, 그 변수를 백억으로 초기화한 후 출력하는 프로그램을 작성하세요.
		// boolean 타입의 변수를 선언하고, 그 변수를 true로 초기화한 후 출력하는 프로그램을 작성하세요.
		
		long num1 = 10000000000L;
		System.out.println(num1);
		
		boolean ex = true;
		System.out.println(ex);
	}

}
