package com.java0424;

public class SwitchEx {
	void SwitchEx1(int score) {
		String grade;
		switch(score/10) {
		case 9: grade="A";break;
		case 8: grade="B";break;
		case 7: grade="C";break;
		case 6: grade="D";break;
		default: grade="F";break;
		}
		System.out.println(score+"점수는"+grade+"학점입니다.");
	}
	void SwitchEx2(int score) {
		
	}
}
