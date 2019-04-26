package com.java0423;

public class Var {
// 리턴유형 함수명(매개변수) 로직구현
	public Var() {
		//var();
	} //기본생성자
	protected int state1;
	public int state2;
	int state3;
	private int state4;
	
	public void var() {
		int a=1;
		System.out.println(a);
		int b=2;
		int c=a+b;
		System.out.println(c);
		System.out.println("good");
	}
	
	void var2(int a,int b) {
		System.out.println(a+b);
	}
}
