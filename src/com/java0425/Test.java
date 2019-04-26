package com.java0425;

import java.util.Scanner;

public class Test {
	int num=1;
	int input=0;
	Scanner scan=new Scanner(System.in);
	String score="";
	public Test() {
		System.out.println("평가시작");
		eval();
	}
	public void eval() {
		
		System.out.println(num+"번학생의 시험 점수를 입력하세요:");
		input=scan.nextInt();
		if(input==100 && input>=90) {
			score="A";
		}else if(input==89||input>=80) {
			score="B";
		}else if(input==79||input>=70) {
			score="C";
		}else if(input==69||input>=60) {
			score="D";
		}else  {
			score="F";
		}
		System.out.println(num+"번학생의 시험결과는"+score+"입니다.");
		num++;
//		scan.close();
		if(num>10) {
			System.out.println("평가종료");
			return;
		}else {
			eval();	
		}
	}
}
