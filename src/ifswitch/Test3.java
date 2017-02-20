package ifswitch;

/*
나이를 입력받아 20살 이상이면 “성인입니다.” 라고 출력하고 
그렇지 않으면 “당신은 ○년 후에 성인이 됩니다.” 라는 메시지를 출력하는 프로그램을 작성하시오.
output
당신은 2년 후에 성인이 됩니다.
*
*/

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 20 - a;

		if (a > 20) {
			System.out.println("성인입니다.");

		} else {
			System.out.println("당신은 " + b + "년 후에 성인이 됩니다.");

		}
	}
}
