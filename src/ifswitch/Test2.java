package ifswitch;

/*��������+100-Ű���� �񸸼�ġ �����̶�� ����.
Ű�� �����Ը� �ڿ����� �Է¹޾� ù ��° �ٿ� �񸸼�ġ�� ����ϰ�, �񸸼�ġ�� 0���� ũ�� �����ٿ� ���̶�� �޽����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
(��������� �Ʒ� ��� ���� �����ϼ���.)
�񸸼�ġ�� 5�Դϴ�.
����� ���̱���.
*/

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		int c = b + 100 - a;

		if (c > 0) {
			System.out.println("�񸸼�ġ�� " + c + "�Դϴ�.");
			System.out.println("����� ���̱���.");
		} else {
			System.out.println(c);
		}
		
	
	}
}
