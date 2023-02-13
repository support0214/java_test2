package operator03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 사용자로부터 숫자 2개를 입력받아
		// 사칙연산(+,-,*,/)과 몫, 나머지를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("연산할 첫번째 숫자를 넣으세요 : ");
		int num1 = sc.nextInt();
		System.out.println("연산할 두번째 숫자를 넣으세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		System.out.println(num1 + "*" + num2 + "=" + num1*num2);
		System.out.println(num1 + "/" + num2 + "=" + (double)num1/num2);
		System.out.println(num1 + "/" + num2 + "의 몫은 " + num1/num2);
		System.out.println(num1 + "/" + num2 + "의 나머지는 " + num1%num2);
	}
}
