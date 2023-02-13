package operator03;

public class Operator01 {

	public static void main(String[] args) {
		/*
		1. 단항 연산자
		   항이 1개인 연산자 음수표시, ++, --
		2. 이항 연산자
		   항이 2개인 연산자
		   2 + 3
		3. 삼항 연산자
		   항이 3개인 연산자
		   10==5 ? 1 : 0
		4. 대입 연산자
		   int a = 10
		*/
		
		int num1 = 10;
		num1++;
		System.out.println(num1);
		++num1;
		System.out.println(num1);
		
		num1--;
		System.out.println(num1);
		--num1;
		System.out.println(num1);
		System.out.println("-----------");
		
		// ++, -- 앞에 붙으면 우선순위가 높다
		int num2 = 10;
		int result = ++num1 + ++num2;
		System.out.println(result);
		System.out.println("-----------");
		/*
		num1=10; 
		num2=10;
		*/
		
		// ++, -- 뒤에 붙으면 우선순위가 가장 낮다
		num1 = num2 = 10;
		result = num1++ + num2++;
		System.out.println(result);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("-----------");
		
		num1 = num2 =10;
		result = num1++ + ++num2;
		System.out.println(result);
		System.out.println("-----------");
		
		num1 = num2 = 10;
		result = --num1 + num2--;
		System.out.println(result);
		
		num1 = num2 = 10;
		result = ++num1 + num2--;
		
		int n1, n2, n3;
		int n4=10, n5=20, n6=30;
		
		n1=n2=n3=10;		
		result = ++n1 + n2-- - --n3;
		
		n1=n2=n3=10;
		result = n1++ * ++n2 + n3++;		
		System.out.println("-----------");
		
		n1=n2=n3=10;
		System.out.println(++n1);
		System.out.println(n2++);
		System.out.println(n2);
	}
}
