package com.java0424;
import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하시오");
		Scanner scanner=new Scanner(System.in);
		int score=scanner.nextInt();
		
		IFEX ifex=new IFEX();
		SwitchEx s=new SwitchEx();
		ifex.IFEX1(score);
		ifex.IFEX2(score);
		ifex.IFEX3(score);
		ifex.IFEX4(score);
		
		s.SwitchEx1(score);
		
	}

}
