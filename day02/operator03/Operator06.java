package operator03;

import java.util.Scanner;

public class Operator06 {

	public static void main(String[] args) {
		// 삼항연산자
		// 조건식 ? 식1 : 식2
		
		int a = 10;
		int b = 5;
		int result = a > b ? a : b ;
		System.out.println(result);
		
		// 사용자로부터 2수를 입력받아 더 큰 숫자를 출력하시오

		Scanner abc = new Scanner(System.in);
		System.out.println("첫번째 숫자 : ");
		int num1 = abc.nextInt();
		System.out.println("두번째 숫자 : ");
		int num2 = abc.nextInt();
		
		System.out.println(num1 + "과 " + num2 + "중 큰 숫자 : " + (num1 > num2 ? num1 : num2));

		// 사용자로부터 숫자 1개 입력받아
		// 짝수, 홀수인지 출력하기
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num3 = scanner.nextInt();
		String str = num3 % 2 == 1 ? "홀수" : "짝수";
		System.out.println(str);
		System.out.println(num3 % 2 == 1 ? "홀수" : "짝수");
	}
}






