/*
�� ���� ������ �Է¹޾Ƽ�
ù ��° �ٿ��� �� ������ ���� ������ 1 �ƴϸ� 0�� ����ϰ�
�� ��° �ٿ��� ���� ������ 1 ������ 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
(JAVA�� 1�̸� true, 0�̸� false�� ����Ѵ�.)
input
5 5
output
1
0
 *
 */

package operator;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a == b) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		if(a != b) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
