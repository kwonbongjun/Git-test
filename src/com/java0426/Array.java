package com.java0426;

import java.util.Scanner;

public class Array {
	public void t1() {
		int a;
		int[] aa;
		a=1;
		aa=new int[5];
		aa[0]=1;
		int[] bb=new int[2];
		bb[0]=0;
		bb[1]=1;
		System.out.println(a);
		System.out.println(aa);
		System.out.println(bb);
		
		System.out.println(aa[0]);
		System.out.println(bb[0]);
	}
	
	public void t2() {
		int[] one=new int[9];
		for(int i=0;i<9;i++) {
			one[i]=1*(i+1);
		}
		System.out.println("1*5="+one[4]);
	}
	public void t3() {
		int[] d=new int[9];
		for(int i=1;i<=9;i++) { //정수 배열에 값 담기 반복문 실행
			int a=(1*i);
			int index=i-1;
			d[index]= a;
		}
		for(int i=0;i<d.length;i++) {
			System.out.println("1*"+(
					i+1)+"="+d[i]);
		}
	}
	public void t4() {
		String[] days=new String[7];
		days[0]="일";
		days[1]="월";
		days[2]="화";
		days[3]="수";
		days[4]="목";
		days[5]="금";
		days[6]="토";
		for(int i=0;i<=days.length;i+=2) {
		System.out.println(days[i]);		
		}		
	}
	public void t5() {
		int[][] bingo= new int[5][5]; 
		bingo[0][0]=5;
		for(int i=0;i<bingo.length;i++) {
			for(int j=0;j<bingo[i].length;j++) {
				bingo[i][j]=1;
				System.out.print(bingo[i][j]);
			}
			System.out.println();
		}
	}
	public void t6() {
		String[][] days=new String[7][5]; //현재 달의 달력 데이터를 요일 베열에 데이터 담기, 출력 오늘 요일을 표현
		Scanner scan=new Scanner(System.in);//월부터시작
		int num=scan.nextInt();
		int d=1;
		for(int i=0;i<days.length;i++) {
			for(int j=0;j<days[i].length;j++) {
				if(j*7+i<30) {
				if((i+d)%7==1) days[i][j]="월";
				else if((i+d)%7==2) days[i][j]="화";
				else if((i+d)%7==3) days[i][j]="수";
				else if((i+d)%7==4) days[i][j]="목";
				else if((i+d)%7==5) days[i][j]="금";
				else if((i+d)%7==6) days[i][j]="토";
				else if((i+d)%7==0) days[i][j]="일";
				}
				else {
					days[i][j]="   ";
				}
			System.out.print(days[i][j]);	
			}
			System.out.println();
		}
		System.out.println(days[(num-1)%7][(num-1)/7]);
	}
	
	
	
	
	
public void t10(int m, int day) {
		String[][] days=new String[7][5]; //현재 달의 달력 데이터를 요일 베열에 데이터 담기, 출력 오늘 요일을 표현
		int d=1;
		//while(m) 
		if(m==1 || m==3||m==5||m==7||m==8||m==10||m==12) {
			d+=31;
		}
		else if(m==4 || m==6||m==9||m==11) {
			d+=31;
		}
		else {
			d+=28;
		}
		for(int i=0;i<days.length;i++) {
			for(int j=0;j<days[i].length;j++) {
				if(1<=j*7+i && j*7+i<=30) {
				if(i==0) days[i][j]="일";
				else if(i==1) days[i][j]="월";
				else if(i==2) days[i][j]="화";
				else if(i==3) days[i][j]="수";
				else if(i==4) days[i][j]="목";
				else if(i==5) days[i][j]="금";
				else if(i==6) days[i][j]="토";
				}
				else {
					days[i][j]="   ";
				}
			System.out.print(days[i][j]);	
			}
			System.out.println();
		}
		System.out.println(days[26%7][26/7]);
}
}




