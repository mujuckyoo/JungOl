/*
 * �� ���� ������ �Է� �޾Ƽ� �հ�� ����� ����Ͻÿ�. (�� ����� �Ҽ� ���ϸ� ������ �����κи� ����Ѵ�.)
10 25 33
�հ� : 68
��� : 22
 */

package operator;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a; 
		int b;
		int c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int d = a + b + c;
		int e = d/3;
				
		System.out.printf("�հ� : %d\n��� : %d",d,e);
		
	}
	
	
	
}
