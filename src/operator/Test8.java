package operator;

/*
 * 3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고 세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오.
input
10 9 9
output
1 0
 */

import java.util.Scanner;


public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.print("1 ");
		} else {
			System.out.print("0 ");
		}
		
		if(a==b && b==c) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
	}
	
}
