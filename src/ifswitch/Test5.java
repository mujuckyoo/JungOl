package ifswitch;

//�� ���� �Ǽ��� �Է¹޾� ��� 4.0 �̻��̸� "A", ��� 3.0 �̻��̸� "B", �ƴϸ� "C" ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

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
