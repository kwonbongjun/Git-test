package com.java0426;

public class Loop2 {
	public void t1( ) {
		for(int i=0;i<10;i++) {
			System.out.println(""); //코드 실행 가능
			break;
			//System.out.println("");
		}
	}
	public void t3() {
		for(int i=0;i<10;i++) {
			System.out.println(i+"번째출력");
			if(i%2==0) {
				continue;
			}else {
				break;
			}
		}
	}
	public void t4(int stop) {
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue;
			}else if(i==stop) {
				break;
			}
			System.out.println(i+"번째출력");
		}
	}
}
