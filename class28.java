package project05;
//2차원 배열
public class class28 {

	public static void main(String[] args) {
		int[][] arr = new int[8][8];
		
		for(int i =0; i<8; i++) {
			for(int j = 0; j<8; j++) {
				arr[i][j] = j+1;
			}
		}
		
		for(int i =0; i<8; i++) {
			for(int j = 0; j<8; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		for(int i =0; i<8; i++) {
			for(int j = 0; j<8; j++) {
				arr[i][j] = 8*i+j+1;
			}
		}
		
		for(int i =0; i<8; i++) {
			for(int j = 0; j<8; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		for(int i =0; i<8; i++) {
			for(int j = 0; j<8; j++) {
				if((i==1 && (j>0&&j<7))||((i<7&&i>0) && j == 1)||(i==6 && (j>0&&j<7))||((i<7&&i>0) && j == 6)) {
					arr[i][j] = 0;
				}
				else if((i==4||i==3)&&(j==3||j==4)) {
					arr[i][j] = 0;
				}
				else {
					arr[i][j] = 8*i+j+1;
				}
			}
		}
		
		for(int i =0; i<8; i++) {
			for(int j = 0; j<8; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}//main

}


//한 줄짜리 1차원배열을 여러개 사용.
//반복문 안에 반복문

//String[][] arr = new String[7][8]
//8개짜리 배열이 7개 있다.