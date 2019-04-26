package com.java0424;

import java.util.Scanner;

public class IFEX {
	void IFEX1(int score) {
		if(score>=60) {
			System.out.println("합격을 축하합니다.");
		}
	}
	void IFEX2(int score) {
		if(score>=60) {
			System.out.println("합격을 축하합니다.");
		}
		else {
			System.out.println("다음에 다시오세요.");
		}
	}
	void IFEX3(int score) {
		if(score>=90) {
			System.out.println("A학점입니다.");
		}else if(score>=80) {
			System.out.println("B학점입니다.");
		}else if(score>=70) {
			System.out.println("C학점입니다.");
		}else if(score>=60) {
			System.out.println("D학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
	}
	void IFEX4(int score) {
		String grade=null;
		if(score>=90) {
			if(score>=95) grade="A+";
			else grade="A0";
		}else if(score>=80) {
			if(score>=85) grade="B+";
			else grade="B0";
		}else if(score>=70) {
			if(score>=75) grade="C+";
			else grade="C0";
		}else if(score>=60) {
			if(score>=65) grade="D+";
			else grade="D0";
		}else {
			grade="F";
		}
		System.out.println(grade+"학점입니다");
	}
	void Ifex5(int score) {
		if(score>0) {
			System.out.println("Plus");
		} else if(score<0) {
			System.out.println("Minus");
		} else {
			System.out.println("0");
		}
	}
	void ifex6() {
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			Scanner scan=new Scanner(System.in);
			arr[i]=scan.nextInt();
			if(arr[i]>=90) {
				System.out.println("A학점입니다.");
			}else if(arr[i]>=80) {
				System.out.println("B학점입니다.");
			}else if(arr[i]>=70) {
				System.out.println("C학점입니다.");
			}else if(arr[i]>=60) {
				System.out.println("D학점입니다.");
			}else {
				System.out.println("F학점입니다.");
			}
		}
	}
	void ifex7() {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
			}
		}
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]);
		}
	}
	void ifex8(int height) {
		if(height>=50 && height<=70 || height%6==0) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
	}
	void ifex9() {
		Scanner scan=new Scanner(System.in);
		int car=170;
		int crash=0;
		int[] arr=new int[3];
		for(int i=0;i<3;i++) {
			arr[i]=scan.nextInt();
			if(car>arr[i]) {
				System.out.println("CRASH "+arr[i]);crash++;break;
			} else {
				continue;
			}
		}
		if(crash==0) {
			System.out.println("PASS");
		}
		
	}
}
