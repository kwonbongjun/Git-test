package com.java0423;
//import java.util.Scanner;

public class calculator {
		
		/*T sum(T a,T b) {
			return a+b;
		}*/
		double sum(double a,double b) {
			return a+b;
		}
		int diff(int a,int b) {
			return a-b;
		}
		int mul(int a,int b) {
			return a*b;
		}
		int div(int a,int b) {
			try {
				return a/b;}
				catch(ArithmeticException e) {
					System.out.println("0으로나눌수 없음");
					return -1;
			}
		}
		
}
