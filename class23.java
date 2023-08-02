package project05;
//변수 심화실습 //연산자 이론, 기초실습, 심화실습
public class class23 {

	public static void main(String[] args) {
		int a = 10;
		float b = (float)10.0;//자바 내에서 기본적인 실수형태가 double
		float c = (float)20.25;
		String str;// char 변수들의 집합, 속에 메소드도 들어있다. 객체다.
		char ch;
		
		System.out.println(a+1);
		System.out.println(a+b);//변수 혹은 값이 연산할 때, 더 높은 자료형으로 변환되서 출력
		System.out.println(a/b);//10/10.0
		System.out.println(b/c);//10.0/20.25
		System.out.println(a/3);//둘 다 자료형이 int여서 int로 출력
		System.out.println(a%b);//0.0
		System.out.println(b%c);//10.0
		System.out.println(a&3);//2
		
		double d1 = 10.0;
		double d2 = 20.25;
		System.out.println(d1 < d2);//T
		
		boolean b2 = d1 >= d2;
		System.out.println(b2);//F
		System.out.println(!b2);//T
		System.out.println(d1 == 10.0);//T 
		System.out.println(d2 != 20.25);//F
		System.out.println((int)d2*10000 == (int)20.25*10000);//T
		
		System.out.println(d1 < d2 && b2);//T && F => F
		System.out.println(d1 == 10.0 || d2 != 20.25);//T || F => T
		//d1이 10.0이랑 같아? 또는 d2가 20.25가 같지 않아?
		System.out.println(d1< d2 && b2 || d1 == 10.0);//T && F || T
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		
		System.out.println(n1 >= --n2 || n3!= 3 && n3 > n2 && n3-- >n2++);
						 //     T     ||    F   &&    T    &&     T      =>  T
		
		
		d1 += 11;
		System.out.println(d1);//21.0
		d2 /= 4; //d2 = d2/4;
		System.out.println(d2);//5.0625
		
		d1 %= d2; //d1 = d1%d2; 나머지는 정수? 5.0625 * 4 => 20.25
		System.out.println(d1);//21.0 - 20.25
		
		System.out.println(d2++);
		System.out.println(d2);
		System.out.println(--d2);
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println((num1++)+(num2++)); //30
		System.out.println("num1:"+num1+", num2:"+num2);//num1 11, num2 21
		
		System.out.println();
		
		
		
		

	}

}


//변수 종류가 많다.

//연산자
//산술연산자 -> +, -, *, /, %
//비교연산자 -> <, >, <=, >=, ==, !=
//대입연산자 -> a = b a는 b다. 가 아니라 b값을 a에 대입한다.
//부정연산자 -> ! 뒤집개 true -> false, false -> true
//증감연산자 -> 자가자신에게 더하고 빼고 곱하고 나누고 하는 것
//			 a = a + 10; -> a += 10;
//			 +=, -=, *=, /=, 
//			 ex)12 %= 5, 12 = 12%5
//			 ++, -- -> 자신에게 1씩 증감시킨다.
//			 ++a, --a : 전위 - 해당코드를 시작하기 전에 값을 1 증감시킨다.
//			 a++, a-- : 후위 - 해당코드를 시작한 후에 값을1 증감시킨다. 
//논리연산자 -> &&(and), ||(or) - boolean을 대상으로 한 연산자
//and -> 양 쪽 모두 true일 때만 true 
//or -> 양 쪽 둘 다 false일 때만 false, 둘 중 하나라도 true면 true

