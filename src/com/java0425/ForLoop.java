package com.java0425;

public class ForLoop {
	/*for:for(1,2,3) {실행}
	 * 1)초기화식: for문에서 사용할 변수 선언 및 초기값
	 * 2)조건식: if문과 동일하게 거짓을 찾기위한 조건
	 * 3)증감식:for문에서 사용할 변수를 변화를 주기위한 식
	 * 
	 **************************************/
	public void t1() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
	public void t2(int s) {
		System.out.println("반복시작");
		for(int i=0;i<s;i++) {
			System.out.println(i);
		}
		System.out.println("반복종료");
	}
	public void t3(int a,int b) {
		System.out.println("t3 반복문 시작");
		for(;a<b;a++) {
			System.out.println (a);
		}
		System.out.println("t3 반복문 시작");
	}
	public void t4() {
		for(int i=0;i<5;i++) {
			if(i%2==0) {
				System.out.print("★");	
			}else {
				System.out.print("☆");
			}
			System.out.println("");
		}
	}
	public void t5() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				if(j%2==0) {
					System.out.print("★");	
				}else {
					System.out.print("☆");
				}
			}
			System.out.println("");
		}
	}
	
	public void t6() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				if((i-j)%2==0) {
					System.out.print("★");	
				}else {
					System.out.print("☆");
				}
				/*else {
					if(j%2==1) {
						System.out.print("★");	
					}else {
						System.out.print("☆");
					}
				}*/
			}
			System.out.println("");
		}
	}
	public void t7() {
		/*for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				if(j%2==0) {
					System.out.print("★");	
				}else {
					System.out.print("☆");
				}
			}
			System.out.println("");
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4-i;j++) {
				if(j%2==0) {
					System.out.print("★");	
				}else {
					System.out.print("☆");
				}
			}
			System.out.println("");
	}*/
		int t=0;
		for(int i=0;i<9;i++) {
			if(i>4) {
				t=t-2;
			}

		for(int j=0;j<=t;j++) {
			if(j%2==0) {
				System.out.print("★");
			}else {
				System.out.print("☆");
			}
		}
		t++;
		System.out.println("");
		}
}
	public void t8() {
		int t=0;
		for(int i=0;i<9;i++) {
			if(i>4) {
				t=t-2;
			}

		for(int j=0;j<=t;j++) {
			if((t-j)%2==0) {
				System.out.print("★");
			}else {
				System.out.print("☆");
			}
		}
		t++;
		System.out.println("");
		}
	}
	public void t9() {
		int n=1;

		for(int i=1;i<=9;i++) {
			System.out.println(i+"단");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
	
	public void t10() {
		/*for(int i=1;i<=9;i=i+3) {
			for(int j=i;j<i+3;j++) {
				System.out.print(j+"단");
				if(j!=i+2) {
				System.out.print("		");
				}
			}
			System.out.println("");
			for(int k=1;k<=9;k++) {
				for(int l=i;l<i+3;l++) {
				System.out.print(l+"*"+k+"="+l*k);
				System.out.print("		");
				}
				System.out.println("");
			}
			//c++;
			System.out.println("");
		}*/
		
		int j=1;
		int jfix=0;
		int k=1;
		for(int i=0;i<27;i++) {
			if(i%9==0) {
				jfix=j;
			for(;j<jfix+3;j++) {
				System.out.print(j+"단");
				System.out.print("		");
				}
			k=1;
			System.out.println("");
			}
			j=j-3;
			for(;j<jfix+3;j++) {
				System.out.print(j+"*"+k+"="+j*k);
				System.out.print("		");
			}
			k++;
			System.out.println("");
			if(k>=10) {
				System.out.println("");
			}
		}
	}
	
	public void t11() {
		/*for(int i=1;i<=3;i++) {
			 {
			for(int j=i;j<=9;j=j+3) {
				System.out.print(j+"단");
				System.out.print("		");
			}
			System.out.println("");
			}{
				for(int k=1;k<=9;k++) {
					for(int l=i;l<=9;l=l+3) {
					System.out.print(l+"*"+k+"="+l*k);
					System.out.print("		");
					}
					System.out.println("");
				}
			}
			//c++;
			System.out.println("");
		}*/
		int j=1;
		int a=0;
		int k=1;
		for(int i=0;i<27;i++) {
			if(i%9==0) {
				a=j;
			for(;j<=9;j=j+3) {
				System.out.print(j+"단");
				System.out.print("		");
				}
			k=1;
			System.out.println("");
			}
			j=a;
			for(;j<=9;j=j+3) {
				System.out.print(j+"*"+k+"="+j*k);
				System.out.print("		");
			}
			j=a+1;
			k++;
			System.out.println("");
			if(k>=10) {
				System.out.println("");
			}
		}
	}

	public void t12() { ///더해서 상수 나오게 해도됌
		/*for(int i=0;i<11;i++) {
			System.out.print("*");
		if (i==0) System.out.print("*********");	
		else if (i==5) System.out.print("*********");
		else if (i==10) System.out.print("*********");
		else if(i<5) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=i+1;j<10-i;j++) {
				if(j!=5) {
				System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.print("*");
			for(int j=11-i;j<10;j++) {
				System.out.print(" ");
			}
			}
		else {
				for(int j=1;j<10-i;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=11-i;j<i;j++) {
					if(j!=5) {
						System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
				}
				System.out.print("*");
				for(int j=i+1;j<10;j++) {
					System.out.print(" ");
				}
		}	
		System.out.println("*");
	}	*/
		/*if(i%5==0 || j%5==0 || i==j || i+j=10) {
			
		}*/
}
	
	
	public void t20() {
		/*for(int i=0;i<=4;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print("    ");
			}
			for(int j=4-i;j<=4+i;j++) {
				if(j%2==0) {
					System.out.print("★");	
				}else {
					System.out.print("☆");
				}
			}
			System.out.println("");
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("    ");
			}
			for(int j=i;j<7-i;j++) {
				if(j%2==0) {
					System.out.print("★");	
				}else {
					System.out.print("☆");
				}
			}
			System.out.println("");
		}
	}*/

		int t=0;
		for(int i=0;i<9;i++) {
			if(i>4) {
				t=t-2;
			}
			for(int j=0;j<4-t;j++) {
				System.out.print("    ");
			}
			for(int j=4-t;j<=4+t;j++) {
				if(j%2==0) {
					System.out.print("★");	
				}else {
					System.out.print("☆");
				}
			}
			System.out.println("");
			t++;
		}
	}
}
