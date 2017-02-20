package ifswitch;

//정수를 입력받아 첫 줄에 입력 받은 숫자를 출력하고 둘째 줄에 음수이면 “음수입니다.” 라고 출력하는 프로그램을 작성하시오.
//input 
//-5
//output 
//-5
//음수입니다.
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a < 0) {
			System.out.println(a);
			System.out.println("음수입니다.");
		} else {
			System.out.println(a);
		}

	}
}
