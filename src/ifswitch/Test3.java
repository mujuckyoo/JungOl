package ifswitch;

/*
���̸� �Է¹޾� 20�� �̻��̸� �������Դϴ�.�� ��� ����ϰ� 
�׷��� ������ ������� �۳� �Ŀ� ������ �˴ϴ�.�� ��� �޽����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
output
����� 2�� �Ŀ� ������ �˴ϴ�.
*
*/

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 20 - a;

		if (a > 20) {
			System.out.println("�����Դϴ�.");

		} else {
			System.out.println("����� " + b + "�� �Ŀ� ������ �˴ϴ�.");

		}
	}
}
