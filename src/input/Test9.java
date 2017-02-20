package input;
import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		
		float a;
		float b;
		double c;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextDouble();
		
		System.out.printf("%.3f\n%.3f\n%.3f", a, b, c);
		
	}
	
}
