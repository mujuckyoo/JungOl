package ifswitch;

//두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		if (a >= 4.0 && b >= 4.0 ) {
			System.out.println("A");
		} else if (a >=3.0 && b >= 3.0 ) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}
	
}
