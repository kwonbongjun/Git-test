package com.java0424;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		char c=scan.next().charAt(0);
		//String s=scan.next();
		///char c=s.charAt(0);
		int b=scan.nextInt();
		//System.out.println(c);

		//String r="";
		float r=0;
		Calculator cal=new Calculator();
		switch(c) {
		case '+':
			/*r=a+"+"+b+"="+cal.*/r=cal.add(a, b);break;
		case '-':
			/*r=a+"+"+b+"="+*/r=cal.dif(a, b);break;
		case '*':
			/*r=a+"+"+b+"="+*/r=cal.mul(a, b);break;
		case '/':
			/*r=a+"+"+b+"="+*/r=cal.div(a, b);break;
		default: System.out.println("연산 불가");break;
		}
		System.out.println(a+""+c+""+b+"="+r);
		
		scan.close();
	}

}
