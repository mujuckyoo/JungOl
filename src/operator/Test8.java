package operator;

/*
 * 3���� ������ �Է� �޾� ù ��° ���� ���� ũ�� 1 �ƴϸ� 0�� ����ϰ� �� ���� ���� ��� ������ 1 �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
input
10 9 9
output
1 0
 */

import java.util.Scanner;


public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.print("1 ");
		} else {
			System.out.print("0 ");
		}
		
		if(a==b && b==c) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
	}
	
}
