package operator;
import java.util.Scanner;

/*
4 > 5 --- 0
4 < 5 --- 1
4 >= 5 --- 0
4 <= 5 --- 1
*/

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean	c = a > b;
		boolean	d = a < b;
		boolean	e = a >= b;
		boolean	f = a <= b;
		
		System.out.println(a + " > " + b + " --- " + c);
		System.out.println(a + " < " + b + " --- " + d);
		System.out.println(a + " >= " + b + " --- " + e);
		System.out.println(a + " <= " + b + " --- " + f);
		
	}
	
}
