package ifswitch;

/*//���ڴ� 'M' ���ڴ� 'F'�� ��Ÿ����� �ϰ� 18�� �̻��� �����̶�� ����.
//����('M', 'F')�� ���̸� �Է¹޾� "MAN"(���γ���), "WOMAN"(���ο���), "BOY"(�̼��Ⳳ��), "GIRL"(�̼��⿩��)�� �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
