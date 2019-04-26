package com.java0424;

public class Calculator {
	public int add(int a,int b) {
		return (a+b);
	}
	public int dif(int a,int b) {
		return (a-b);
	}
	public float div(int a,int b) {
		//명시적 형변환-기본자료형변환
		return (float) (a/b);
	}
	public float mul(int a,int b) {
		//명시적형변환-기본자료형변환
		return (float) (a*b);
	}
	
}
