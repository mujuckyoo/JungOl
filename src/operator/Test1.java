/*
 * 세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)
10 25 33
합계 : 68
평균 : 22
 */

package operator;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a; 
		int b;
		int c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int d = a + b + c;
		int e = d/3;
				
		System.out.printf("합계 : %d\n평균 : %d",d,e);
		
	}
	
	
	
}
