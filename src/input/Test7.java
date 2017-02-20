package input;

import java.util.Scanner;

/*
두 개의 정수를 입력 받아 곱과 몫을 출력하시오.
(먼저 입력 받는 수가 항상 크며 입력되는 두 정수는 1이상 500이하이다.)
곱 = 80
몫 = 3
*/ 


public class Test7 {

	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
	
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println("정수 입력 곱 = " + (a*b));
		System.out.println("몫 = " + (a/b));
		
		
	}
	
	
}
