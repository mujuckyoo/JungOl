package input;


//섭씨 = (화씨-32) x 0.55 화씨 = (섭씨 x 1.8) + 32이다.
//섭씨 21.6°를 화씨로 화씨 110.3°를 섭씨로 변환하여 다음 형식에 맞추어 소수 둘째 자리에서 반올림하여 소수 첫째자리까지 출력하시오.
//섭씨  21.6도는 화씨 70.9도이다.
//화씨 110.3도는 섭씨 43.1도이다.
 


public class Test5 {
 	public static void main(String[] args) {
 		double a = 21.6;
 		double b = 110.3;
 		double a1 = (a*1.8)+32;
 		double b1 = (b-32)*0.55; 		
 		
 		System.out.printf("섭씨 %5.1f도는 화씨 %4.1f도이다.\n화씨 %4.1f도는 섭씨 %3.1f도이다.", a, a1, b, b1);
	
 				
 				
 	}
	
}
