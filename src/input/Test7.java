package input;

import java.util.Scanner;

/*
�� ���� ������ �Է� �޾� ���� ���� ����Ͻÿ�.
(���� �Է� �޴� ���� �׻� ũ�� �ԷµǴ� �� ������ 1�̻� 500�����̴�.)
�� = 80
�� = 3
*/ 


public class Test7 {

	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
	
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println("���� �Է� �� = " + (a*b));
		System.out.println("�� = " + (a/b));
		
		
	}
	
	
}
