package ifswitch;

/*
 ����ü���� �����԰� 50.80kg ���ϸ� "�ö��̱�", 61.23kg ���� "����Ʈ��", 72.57kg ���� "�̵��", 88.45kg ���� "ũ������", �� �̻��� "����"�̶�� ����. 
�����Ը� �Է¹޾� ü���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		
		if (a <= 51.8) {
			
			System.out.println("�ö��̱�");
		} else if (a <= 61.23) {
			System.out.println("����Ʈ��");
		} else if (a <= 72.57) {
			System.out.println("�̵��");
		} else if (a <= 88.45) {
			System.out.println("ũ������");
		} else {
			System.out.println("����");
		}
		
	}
}
