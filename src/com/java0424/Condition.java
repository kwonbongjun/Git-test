package com.java0424;

public class Condition {
	/*
	  if문

	  if() {} 필수
	  else{}
	  else if() {} 다음 조건
	  -비교자
	  ==,!=, 
	  -switch문 :정해진 값에 많이 사용,여러 값 조합할 때 사용
	  switch(비교값)
	  case 값 : 비교값과 같으면 실행
	  default : 비교값이 case 값에 없으면 실행
	  */
	public void t1(int a) {
		if(10==a) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
	}
	public boolean t2(int a) {
		if(10==a) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public int t3(int a,int b) {
		if (a==b) {
			return 1;
		}else {
			return 0;
		}
	}
	public int t4(int a,int b) {
		if(a>b) {
			return a;
		}
		else if(a<b) {
			return b;
		}
		else {
			return -1;
		}
	}
	public String t5(int a,int b) {
		if(a==b) {
			return "같다";
		}
		else if(a!=b) {
			return "다르다";
		}
		else if(a>b) {
			return "크다";
		}
		else if(a<b) {
			return "작다";
		}
		else if(a>=b) {
			return "크거나같다";
		}
		else if(a<=b) {
			return "작거나같다";
		}
		else {
			return "비교불가";
		}
	}
	public String t6(int a,int b) {
		if(a==b) {
			return "같다";
		}
		if(a!=b) {
			return "두개의 값이 같지 않다";
		}
		if(a>b) {
			return "a 변수의 값이 크다";
		}
		if(a<b) {
			return "b 변수의 값이 크다";
		}
		return "비교불가";
	}
	public String t7(int a,int b) {

		String msg="";
		if(a==b) {
			msg="같다";
		}
		if(a!=b) {
			msg="다르다";
		}
		if(a>b) {
			msg="크다";
		}
		if(a<b) {
			msg="작다";
		}
		return msg;
	}
	public String t8(int a) {
		String msg="";
		
		switch(a) {
		case 0:
			msg="전달 받은 값은 0입니다";
			break;
		default:
			msg="전달 받은 값은 case 값에 없습니다.";
			break;
		}
		return msg;
	}
	public String t9(int a) {
		String msg="";
		switch(a) {
		case 0:
			msg=msg+"0 비교";
		case 1:
			msg=msg+"1비교";
		case 2:
			msg="2비교 범위의 값";
			break;
		default:
			msg="0~2 범위가 아님.";
			break;
		}
		return msg;
	}
	
	public String t10(int score) {
		String grade="";
		switch(score/10) {
		case 10:
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default: grade="F"; break;
		}
		return grade;
	}
}
