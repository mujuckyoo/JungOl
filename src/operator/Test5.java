/*
두 개의 정수를 입력받아서
첫 번째 줄에는 두 정수의 값이 같으면 1 아니면 0을 출력하고
두 번째 줄에는 같지 않으면 1 같으면 0을 출력하는 프로그램을 작성하시오.
(JAVA는 1이면 true, 0이면 false를 출력한다.)
input
5 5
output
1
0
 *
 */

package operator;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a == b) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		if(a != b) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
