package input;


//���� = (ȭ��-32) x 0.55 ȭ�� = (���� x 1.8) + 32�̴�.
//���� 21.6�Ƹ� ȭ���� ȭ�� 110.3�Ƹ� ������ ��ȯ�Ͽ� ���� ���Ŀ� ���߾� �Ҽ� ��° �ڸ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� ����Ͻÿ�.
//����  21.6���� ȭ�� 70.9���̴�.
//ȭ�� 110.3���� ���� 43.1���̴�.
 


public class Test5 {
 	public static void main(String[] args) {
 		double a = 21.6;
 		double b = 110.3;
 		double a1 = (a*1.8)+32;
 		double b1 = (b-32)*0.55; 		
 		
 		System.out.printf("���� %5.1f���� ȭ�� %4.1f���̴�.\nȭ�� %4.1f���� ���� %3.1f���̴�.", a, a1, b, b1);
	
 				
 				
 	}
	
}
