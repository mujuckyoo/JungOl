/*�Ǽ� 2���� �� ���� ���ڸ� �Է� �޾� ����ϵ� �Ǽ��� �ݿø��Ͽ� �Ҽ� ��°�ڸ����� ����ϴ� ���α׷����ۼ��Ͻÿ�.
(C, C++, Java �� ��� �Ǽ��� "double"�� �����ϼ���.)

�Է�
12.2536
526.129535
A

���
12.25
526.13
A

*/

package input;
import java.util.Scanner;

public class Test8 {
	public static void main(String[] args){
		double a;
		double b;
		String c;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.next();
		
		System.out.printf("%.2f\n%.2f\n%s", a, b, c);
	}
}
