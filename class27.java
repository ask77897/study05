package project05;

import java.util.Scanner;

public class class27 {

	public static void main(String[] args) {
		//배열
		//김포공항* - 공항시장 - 마곡나루* - 양천향교 - 가양* - 증미 - 당산* - 국회의사당 - 여의도*
		//* 급행
		
		//어떤 열차를 탈래? -> 급행인지 급행이 아닌지
		//어디역에서 내릴래? -> 위에 있는 역 중에 입력(단, 급행열차는 일반역에 멈추지 않음)
		//내가 탄 열차가 지나온 역들이 쭉 출력.
		
		Scanner sc = new Scanner(System.in);
		String[] st = {"김포공항", "공항시장", "마곡나루", "양천향교", "가양", "증미", "당산", "국회의사당", "여의도"};
		

		String tr = sc.next();
		int a = sc.nextInt(); 
		if(tr.equals("급행")) {
			for(int i=0; i<st.length; i++) {
				if(i==a) {
					for(int j = 0; j<a*2; j+=2) {// system.out.print(st[i]);
						System.out.println(st[j]);//if(a-1 == 1){
					}								//break;
				}
			}
		}else if(tr.equals("일반")) {
			for(int i = 0; i<st.length; i++) {
				if(i==a) {
					for(int j = 0; j<a; j++) {
						System.out.println(st[j]);
					}
				}
			}
		}
		
		String tr1 = sc.next();
		String b = sc.next(); 
		if(tr1.equals("급행")) {
			for(int i=0; i<st.length; i++) {
				if(b.equals(st[i])) {
					for(int j = 0; j<i+1; j+=2) {
						System.out.println(st[j]);
					}
				}
			}
		}
		else if(tr1.equals("일반")) {
			for(int i = 0; i<st.length; i++) {
				if(b.equals(st[i])) {
					for(int j = 0; j<i+1; j++) {
						System.out.println(st[j]);
					}
				}
			}
		}
		//출발역
		String tr2 = sc.next();
		String c = sc.next(); 
		String d = sc.next();
		if(tr2.equals("급행")) {
			for(int i=0; i<st.length; i++) {
				if(c.equals(st[i])) {
					for(int j = i; j<st.length; j++) {
						if(d.equals(st[j])) {
							for(int k = i; k<j+1; k+=2) {
								System.out.println(st[k]);
							}
						}
					}
				}
			}
		}
		else if(tr2.equals("일반")) {
			for(int i = 0; i<st.length; i++) {
				if(c.equals(st[i])) {
					for(int j = i; j<st.length; j++) {
						if(d.equals(st[j])) {
							for(int k = i; k<j+1; k++) {
								System.out.println(st[k]);
							}
						}
					}
				}
			}
		}
		//출발역 - 일반역 -> 급행으로 갈아타기
		String tr3 = sc.next();
		String x = sc.next(); 
		String y = sc.next();
		if(tr3.equals("급행")) {
			for(int i=0; i<st.length; i++) {
				if(x.equals(st[i])) {//출발역
					for(int j = i; j<st.length; j++) {
						if(y.equals(st[j])) {//도착역
							for(int k = i; k<j+1; k+=2) {
								System.out.println(st[k]);
							}
						}
					}
				}
			}
		}
		else if(tr3.equals("일반")) {
			for(int i = 0; i<st.length; i++) {
				if(x.equals(st[i])) {//출발역
					for(int j = i; j<st.length; j++) {
						if(y.equals(st[j])) {//도착역
							for(int k = i; k<j+1; k++) {
								System.out.println(st[k]);
							}
						}
					}
				}
			}
		}
		//힌트 급행역과 일반역이 번갈아가면서 존재한다.
		
	}

}
