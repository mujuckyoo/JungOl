/*
�� ���� ������ �Է¹޾� ���� ��ġ ���� �����ڿ� ��ġ ���� �����ڸ� ����Ͽ� �� ���� ���� ���� �� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
input : 10 20
output : 11 19 190

 */

package operator;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a++*--b;				
		
		System.out.println(a + " " + b + " " + c);
				
	}
	
}
