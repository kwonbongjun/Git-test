package com.java0426;

import java.util.Scanner;

public class Loop3 {
	public void t2() {
		Scanner scan= new Scanner(System.in);
		while(true) {
			System.out.println("입력");
			String input=scan.next();
			if("exit".equals(input)) {  //" " 공백으로는 비교불가 입력자체가 안됌
				break;
			}
			System.out.println("무한루프");
		}
		System.out.println("종료");
	}
	public void t3() {
		int count=0;
		while(count < 100) {
			count++;
		}
		System.out.println(count);
	}
}
