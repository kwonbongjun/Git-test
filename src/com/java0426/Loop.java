package com.java0426;

import java.util.Scanner;

public class Loop {
	public void lv1() {
		/*
		 * 1난이도 (한행에 하나씩) 1단>2단(순차출력)
		 */
		for(int i=1;i<=9;i++) {
			System.out.println(i+"단");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("");
		}
	}
	public void lv2() {
		/*
		 * 2난이도(한행에 3단씩)
		 * 1 2 3 > 4 5 6 단
		 */
		for(int i=1;i<=9;i=i+3) {
			System.out.print(i+" 단\t");
			System.out.print(i+1+" 단\t");
			System.out.print(i+2+" 단\t");
			System.out.println("");
			for(int k=1;k<=9;k++) {
			System.out.print(i+"*"+k+"="+i*k);
			System.out.print((i+1)+"*"+k+"="+(i+1)*k);
			System.out.print((i+2)+"*"+k+"="+(i+2)*k);
			System.out.println("");
			}
			System.out.println("");
		//c++;
		System.out.println("");
	}
	}
	public void lv3() {
		for(int i=1;i<=3;i++) {
			System.out.print(i+" 단\t");
			System.out.print(i+3+" 단\t");
			System.out.print(i+6+" 단\t");
			System.out.println("");
			for(int k=1;k<=9;k++) {
			System.out.print(i+"*"+k+"="+i*k);
			System.out.print((i+3)+"*"+k+"="+(i+3)*k);
			System.out.print((i+6)+"*"+k+"="+(i+6)*k);
			System.out.println("");
			}
			System.out.println("");
		//c++;
		System.out.println("");
	}
}
	public void lv4() {
		Scanner scan=new Scanner(System.in);
		System.out.println("x축으로 출력 나올 갯수 입력");
		int x=scan.nextInt();
		for(int i=1;i<=9;i=i+x) {
			for(int k=1;k<=9;k++) {
				for(int c=0;c<x;c++) {	
					System.out.print((i+c)+"*"+k+"="+((i+c)*k)+"\t");
				}
				System.out.println("");
			}
			System.out.println("");
	}
	}
	public void lv5() {
		int c=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("x,y축으로 출력 나올 갯수 입력");
		int x=scan.nextInt();
		int y=scan.nextInt();
		for(int i=1;i<=y*x;i=i+x) {
			for(int k=1;k<=9;k++) {
				for(c=0;c<x;c++) {	
					if(i+c>9) break;
					System.out.print((i+c)+"*"+k+"="+((i+c)*k)+"\t");
				}
				System.out.println("");
			}
			if(i+c>9) break;
			System.out.println("");
	
		}
	}
	
	
}
