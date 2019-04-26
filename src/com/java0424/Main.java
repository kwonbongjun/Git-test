package com.java0424;

public class Main {
	int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.생성자안에 생성자,메소드생성x
		//2.변수,상수-전역
		//3.메소드>변수-메소드 변수(전역-지역)
		//메소드안에 메소드,생성자 생성x
		//4.static(정적):만들지않는다. main에만 사용.
		//기능구현할때 가능하면 클래스를 적극활용한다.
		int a=2,b=4,c;
		float d;
		
		Calculator calc=new Calculator();
		c=calc.add(a, b);
		calc.dif(a, b);
		d=calc.mul(a, b);
		calc.div(a, b);
		
	}
	/*void aa() {
		int b;
		for(int i=0;i<10;i++) {
			System.out.println(i); //for문 안에서 사용하는 지역변수
		}
	}*/

}
