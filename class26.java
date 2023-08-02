package project05;

import java.util.Scanner;

//break, continue
public class class26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 2; i<=100; i++) {
			if(i%2 ==1) {
				continue;
			}
			System.out.print(i);				
		}
		System.out.println();
		
		//사용자가 숫자를 계속 입력 -> 입력된 값을 합해서 출력해주면 된다.
		//사용자가 음수를 입력하면 종료, 사용자가 두 자리수 이상을 입력하면 더해지지 않아야한다.
		System.out.println("----");
//		int b = 0;
		
//		for(int i = 0; i<10; i++) {
//			int a = sc.nextInt();
//			
//			if(a>=10) {
//				continue;
//			}
//			else if(a<0) {
//				break;
//			}
//				
//		}
//		System.out.println(b);
		
		
		
		int sum = 0;
		while(true) {
			int n = sc.nextInt();
			if(n<0) {
				break;
			}
			if(n>=10) {
				continue;
			}
			
			sum+=n;	
		}
		System.out.println(sum);
		
		
		

	}//main

}


//break, continue

//break -> 멈춰
//switch, 반복문 -> switch, 반복문 더 이상 실행하지말고 멈춰

//continue -> 계속해줘
//반복문 -> 내 아래의 코드를 무시하고 반복문 계속 실행해줘
