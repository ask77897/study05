package project05;

import java.util.Scanner;

//조건문 기초실습, 심화실습
public class class24 {

	public static void main(String[] args) {
		int a = 1;
		if(10 < a) {
			System.out.println("안녕하세요.");
		}else if(a > 5) {
			System.out.println("안녕하세요.");
		}else if(a > 6) {
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
		
		//입력 Scanner
		//조건문을 통해서 "?입니다." 1->가위, 2->바위, 3->보
		
		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x == 1) {
			System.out.println("가위입니다.");
		}else if(x == 2) {
			System.out.println("바위입니다.");
		}else if(x == 3) {
			System.out.println("보입니다.");
		}else {
			System.out.println("잘못 입력 했습니다.");
		}
		
		switch(x) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		case 3:
			System.out.println("보");
			break;
		default : 
			System.out.println("잘못 입력 했습니다.");
		}	
		//둘이서 가위바위보 해서 누가 이겼는지 출력
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		
		if(p1==1 && p2==3) {
			System.out.println("p1:가위, p2:보");
			System.out.println("p1이 이겼습니다.");
		}else if (p1 == 3 && p2 ==1) {
			System.out.println("p1:보, p2:가위");
			System.out.println("p2가 이겼습니다.");
		}else if(p1>p2) {
			if(p1 == 1) {
				System.out.print("p1:가위, ");
			}else if(p1 == 2) {
				System.out.print("p1:바위, ");
			}else if(p1 == 3) {
				System.out.print("p1: 보, ");
			}
			if(p2 == 1) {
				System.out.println("p2: 가위");
			}else if(p2 == 2) {
				System.out.println("p2: 바위");
			}else if(p2 == 3) {
				System.out.println("p2: 보");
			}
			System.out.println("p1가 이겼습니다.");
		}else if(p1<p2) {
			if(p1 == 1) {
				System.out.print("p1:가위, ");
			}else if(p1 == 2) {
				System.out.print("p1:바위, ");
			}else if(p1 == 3) {
				System.out.print("p1: 보, ");
			}
			if(p2 == 1) {
				System.out.println("p2: 가위");
			}else if(p2 == 2) {
				System.out.println("p2: 바위");
			}else if(p2 == 3) {
				System.out.println("p2: 보");
			}
			System.out.println("p2가 이겼습니다.");
		}else {
			if(p1 == 1) {
				System.out.print("p1:가위, ");
			}else if(p1 == 2) {
				System.out.print("p1:바위, ");
			}else if(p1 == 3) {
				System.out.print("p1: 보, ");
			}
			if(p2 == 1) {
				System.out.println("p2: 가위");
			}else if(p2 == 2) {
				System.out.println("p2: 바위");
			}else if(p2 == 3) {
				System.out.println("p2: 보");
			}
			System.out.println("무승부입니다.");
		}
		
		if(p1 == p2) {
			System.out.println("무승부");
		}else if(p1 == 1 && p2 == 2) {
			System.out.println("패배");
		}else if(p1 == 1 && p2 == 3) {
			System.out.println("승리");
		}
		else if(p1==2) {
			if(p2==1) {
				System.out.println("승리");
//			}else if (p2 ==2) {
//				System.out.println("무승부");
			}else if (p2 ==3) {
				System.out.println("패배");
			}
		}
		else if(p1==3) {
			if(p2==1) {
				System.out.println("패배");
			}else if (p2 ==2) {
				System.out.println("승리");
//			}else if (p2 ==3) {
//				System.out.println("무승부");
			}
		}
		
		if(p1 == p2) {//p1.equals(p2)
			System.out.println("무승부");
		}else {
			switch(p1) {
			case 1:
				if(p2 == 2) {
					System.out.println("패배");
				}else if(p2 == 3) {
					System.out.println("승리");
				}
				break;
			case 2:
				switch(p2) {
				case 1:
					System.out.println("승리");
				case 3:
					System.out.println("패배");
				}
				break;
			case 3:
				if(p2 == 1) {
					System.out.println("패배");
				}else if(p2 == 2) {
					System.out.println("승리");
				}
				break;
			}
		}
		
		
		
		switch(p1) {
		case 1:
			System.out.println("p1: 가위");
			switch(p2) {
			case 1:
				System.out.println("p2: 가위");
				System.out.println("무승부입니다.");
				break;
			case 2:
				System.out.println("p2: 바위");
				System.out.println("p2가 이겼습니다.");
				break;
			case 3:
				System.out.println("p2: 보");
				System.out.println("p1이 이겼습니다.");
				break;
			}
			break;
		case 2:
			System.out.println("p1: 바위");
			switch(p2) {
			case 1:
				System.out.println("p2: 가위");
				System.out.println("p1이 이겼습니다.");
				break;
			case 2:
				System.out.println("p2: 바위");
				System.out.println("무승부 입니다.");
				break;
			case 3:
				System.out.println("p2: 보");
				System.out.println("p2가 이겼습니다.");
				break;
			}
			break;
		case 3:
			System.out.println("p1: 보");
			switch(p2) {
			case 1:
				System.out.println("p2: 가위");
				System.out.println("p2가 이겼습니다.");
				break;
			case 2:
				System.out.println("p2: 바위");
				System.out.println("p1이 이겼습니다.");
				break;
			case 3:
				System.out.println("p2: 보");
				System.out.println("무승부 입니다.");
				break;
			}	
			break;
		
		
		
		}
		

		
		int num = 1;
		
		switch(num) {
		case 12: //if(num==12)
			System.out.println(num);
			break;
		case 1:
			num *= 10;
			break;
		case -5:
			--num;
			break;
		case (int)10.25:
			System.out.println(num<2);
			break;
		case 'a':
			System.out.println("안녕하세요.");
			break;
		default:
			System.out.println("종착역 입니다.");
			
		}

	}

}
