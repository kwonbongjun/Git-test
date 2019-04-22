package com.java0422;

public class Main {

	public static void main(String[] a) {
		System.out.println("변수 시작!");
		String 문자열 = "Hello World"; // 변수 선언 과 대입이 동시에 이루어진거.
		System.out.println(문자열); // 변수 사용
		문자열 = "문자열 변경";   // 값 변경
		System.out.println(문자열); // 변수 사용
		문자열 = "1234"; // 연산
		System.out.println(문자열); // 변수 사용
		
		int 정수 = 1;
		System.out.println(정수);
		
		String 결과값 = 문자열 + (정수 + 정수 + 정수d);
		System.out.println(결과값);
	}

}
