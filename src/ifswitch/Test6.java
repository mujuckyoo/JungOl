package ifswitch;

/*//남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
//성별('M', 'F')과 나이를 입력받아 "MAN"(성인남자), "WOMAN"(성인여자), "BOY"(미성년남자), "GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오.
//input
F 15*/
import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		int b;
		boolean c;
		
		for (int i = 0; i <= 3; i++) {
			
			a = sc.next();
			b = sc.nextInt();
			c = a.contentEquals("M");
			
			if (c == true && b >= 18 ) {
				System.out.println("MAN");
			} else if (c == true && b < 18) {
				System.out.println("BOY");
			} else if (c == false && b >= 18) {
				System.out.println("WOMAN");
			} else if (c == false && b <18) {
				System.out.println("GIRL");
			}
		}
	}	
	
}
