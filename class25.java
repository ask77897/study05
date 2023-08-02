package project05;

import java.util.Scanner;

//반목문
public class class25 {

	public static void main(String[] args) {
		// 두명이서 5번 게임을 했을 때, 누가 이겼는지 혹은 1번째 사람이 (몇승 몇무 몇패)
		Scanner sc = new Scanner(System.in);
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
		
		for(int i = 0; i<5; i++) {
			int p1 = sc.nextInt();
			int p2 = sc.nextInt();
			while(true){//(p1!=1&&p1!=2&&p1!=3)
				if(p1==1||p1==2||p1==3) {
					break;
				}
				System.out.println("잘못 입력했습니다.");
				p1 = sc.nextInt();
				p2 = sc.nextInt();
			}
			
			
			if(p1 == p2) {//p1.equals(p2)
				System.out.println("무승부");
				cnt1++;
			}else {
				switch(p1) {
				case 1:
					if(p2 == 2) {
						System.out.println("패배");
						cnt2++;
					}else if(p2 == 3) {
						System.out.println("승리");
						cnt3++;
					}
					break;
				case 2:
					switch(p2) {
					case 1:
						System.out.println("승리");
						cnt3++;
						break;
					case 3:
						System.out.println("패배");
						cnt2++;
						break;
					}
					break;
				case 3:
					if(p2 == 1) {
						System.out.println("패배");
						cnt2++;
					}else if(p2 == 2) {
						System.out.println("승리");
						cnt3++;
					}
					break;
				}
			}
			
		}
		//전에 코드를 반복문으로 감싸고, 변수 3개를 만들어서 최종적으로 출력한다.
		System.out.println("p1은 "+cnt3+"승, "+cnt1+"무, "+cnt2+"패 입니다.");
		System.out.println("p2은 "+cnt2+"승, "+cnt1+"무, "+cnt3+"패 입니다.");
		

	}//main

}
