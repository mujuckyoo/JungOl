package ifswitch;

//������ �Է¹޾� ù �ٿ� �Է� ���� ���ڸ� ����ϰ� ��° �ٿ� �����̸� �������Դϴ�.�� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//input 
//-5
//output 
//-5
//�����Դϴ�.
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a < 0) {
			System.out.println(a);
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println(a);
		}

	}
}
