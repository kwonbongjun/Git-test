package com.java0423;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체(class) 객체변수 대입 생성키워드 생성자
		/*
		 * 객체,변수,메서드,출력,연산,접근제한자,저적,리턴타입,자료형,매개변수
		 * */
		
		//Var v = new Var();
		//v.var();
		//Var.var();
		//new Var();
		//int s=v.state1;
		//v.var2(1, 5);
		
		
		calculator cal=new calculator();
		int result=0;
		if(cal.sum(1, 2.1)-(int)cal.sum(1, 2.1)==0) {
			result=(int)cal.sum(1, 2.1);
			System.out.println("1+ 2= "+result);
		}
		else
		{
			System.out.println("1+ 2= "+cal.sum(1,2.1));
		}
		
		System.out.println("1- 2= "+cal.diff(1,2));
		System.out.println("1* 2= "+cal.mul(1, 2));
		System.out.println("1/ 2= "+cal.div(1, 2));
	
		/*System.out.println("1+ 2= "+sum(1, 2));
		System.out.println("1- 2= "+diff(1,2));
		System.out.println("1* 2= "+mul(1, 2));
		System.out.println("1/ 2= "+div(1, 2));*/
	
		
	}
	static int sum(int a,int b) {
		return a+b;
	}
	static int diff(int a,int b) {
		return a-b;
	}
	static int mul(int a,int b) {
		return a*b;
	}
	static int div(int a,int b) {
		return a/b;
	}
	

}
