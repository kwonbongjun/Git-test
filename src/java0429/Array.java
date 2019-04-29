package java0429;

import java.util.Scanner;

public class Array {
	public void t1() {
		boolean[][] sheet=new boolean[5][5];
		sheet[0][0]=false;
		sheet[0][1]=false;
		sheet[0][2]=false;
		sheet[0][3]=false;
		sheet[0][4]=false;
		
		sheet[1][0]=true;
		sheet[1][1]=true;
		sheet[1][2]=true;
		sheet[1][3]=true;
		sheet[1][4]=true;
		
		for(int i=0;i<sheet.length;i++) {
			for(int j=0;j<sheet[i].length;j++) {
				if(i%2==0) {
					sheet[i][j]=false;
				}else {
					sheet[i][j]=true;
				}
				System.out.print(sheet[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void t2() {
		int[][] sheet=new int[5][5];
		
		for(int i=0;i<sheet.length;i++) {
			for(int j=0;j<sheet[i].length;j++) {
				if(i%2==0) {
					sheet[i][j]=1;
				}else {
					sheet[i][j]=0;
				}
				System.out.print(sheet[i][j]+"\t");
			}
			System.out.println();
		}
	}
public void t3() {
	int[][] sheet=new int[5][5];

		for(int i=0;i<sheet.length;i++) {
			for(int j=0;j<sheet[i].length;j++) {
				if(i==j || i+j==4) {
					sheet[i][j]=1;
				}else  {
					sheet[i][j]=0;
				}
				System.out.print(sheet[i][j]+"\t");
			}
			System.out.println();
		}
	}

public boolean t4(int aX,int aY, int bX, int bY) {
	boolean result =false;
	int [][] sheet={ 
			{0,0,0,0,0,0,0,0,0,0}, 
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,0,0,1,0,1,0,1,0},
			{0,1,0,0,1,0,1,0,1,0},
			{0,1,1,0,0,0,1,1,1,0},
			{0,1,0,0,0,0,1,0,1,0},
			{0,1,0,0,1,0,1,0,1,0},
			{0,1,0,0,1,0,1,0,1,0},
			{0,1,1,1,1,1,1,0,1,0},
			{0,0,0,0,0,0,0,0,0,0}
	};
	
	
	for(int y = 0; y < sheet.length; y++) { // 행
		for(int x = 0; x < sheet[y].length; x++) { // 열
			if(sheet[aY][aX] == 0) {
				aY = bY; 
				aX = bX;
				result = true;
			}
			if(y == aY && x == aX) {
				System.out.print(" ㉿ ");
			} else if(sheet[y][x] == 1) {
				System.out.print(" □ ");
			} else {
				System.out.print(" ■ ");
			}
		}
		System.out.println();
	}
	return result;
}

public void t5() {
		Scanner scan=new Scanner(System.in);
		int aX=1;
		int aY=1;
		int bX=1;
		int bY=1;
		t4(aX,aY,bX,bY);//시작을 위하여 필요한 호출 부분
		
	while(true) {
		String input=scan.next();
		switch(input.toLowerCase()) {
		case "w":
			aY--;
			break;
		case "s":
			aY++;
			break;
		case "a":
			aX--;
			break;
		case "d":
			aX++;
			break;
		default:
			break;
		}
		System.out.println(aY+", "+ aX + ", " + bY + ", " + bX);
		if(t4(aX,aY,bX,bY)) {
			//aX=bX;
			//aY=bY;
		} else {
			bX=aX;
			bY=aY;
		}
		if(aX==8 && aY==8) 
			break;
	}
	}


public boolean t6(int aX,int aY, int bX, int bY) {
	boolean result =true;
	int [][] sheet={ 
			{0,0,0,0,0,0,0,0,0,0}, 
			{0,1,0,1,1,1,1,1,1,0},
			{0,1,0,1,0,0,1,0,1,0},
			{0,1,0,2,0,1,1,0,1,0},
			{0,1,0,0,0,1,1,0,1,0},
			{0,1,0,1,0,0,0,0,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,0,0,1,0,0,1,0},
			{0,1,1,0,0,1,1,1,1,0},
			{0,0,0,0,0,0,0,1,0,0}
	};
	
	
	for(int i=0;i<sheet.length;i++) {
		for(int j=0;j<sheet[i].length;j++) {
			if(sheet[aY][aX]==0) {
				aY = bY; 
				aX=bX ;
				result=false;
			}else if(sheet[aY][aX]==2) {
				//powerup();
			}
			if(i==aY && j==aX) {
				System.out.print(" # ");
			}else if(i==3 && j==3) {
				System.out.print(" ♥ ");
			}
			else if(sheet[i][j]==1) {
				System.out.print(" □ ");
			}else {
				System.out.print(" ■ ");
			}
			//System.out.print(sheet[i][j]);
		}System.out.println();
	}
	return result;
}

public void t7() {
		Scanner scan=new Scanner(System.in);
		int aX=1;
		int aY=1;
		int bX=1;
		int bY=1;
		t6(aX,aY,bX,bY);//시작을 위하여 필요한 호출 부분
		
	while(true) {
		String input=scan.next();
		switch(input.toLowerCase()) {
		case "w":
			aY--;
			break;
		case "s":
			aY++;
			break;
		case "a":
			aX--;
			break;
		case "d":
			aX++;
			break;
		default:
			break;
		}
		System.out.println(aY+", "+ aX + ", " + bY + ", " + bX);
		if(t6(aX, aY, bX, bY)) { // 이동을 위하여 호출 부분
			aX = bX;
			aY = bY;
		} else {
			bX = aX;
			bY = aY;
		}
		if(aX==7 && aY==9) 
			break;
	}
	}


	public int t10(int aX, int aY, int bX, int bY) {
		int result = 0;
		int[][] 맵 = {
				{0,0,0,0,0,0,0,0,0,0}, 
				{0,1,0,1,1,1,1,1,1,0},
				{0,1,0,1,0,0,1,0,1,0},
				{0,1,0,2,0,1,1,0,1,0},
				{0,1,0,0,0,1,1,0,1,0},
				{0,1,0,1,0,0,0,0,1,0},
				{0,1,1,1,1,1,1,1,1,0},
				{0,1,1,0,0,1,0,0,1,0},
				{0,1,1,0,0,1,1,1,1,0},
				{0,0,0,0,0,0,0,0,0,0}
		};
		for(int y = 0; y < 맵.length; y++) { // 행
			for(int x = 0; x < 맵[y].length; x++) { // 열
				if(맵[aY][aX] == 0) {
					aY = bY; 
					aX = bX;
					result = 1;
				}else if(맵[aY][aX]==2) {
					aX=1;
					aY=1;
					result =2;
				}
				if(y == aY && x == aX) {
					System.out.print(" ㉿ ");
				} else if(y==3 && x==3) {
					System.out.print(" ♥ ");
				}else if(맵[y][x] == 1) {
					System.out.print(" □ ");
				} else {
					System.out.print(" ■ ");
				}
			}
			System.out.println();
		}
		return result;
	}
	
	public void t11() {
		Scanner scan = new Scanner(System.in);
		int aX = 1;
		int aY = 1;
		int bX = 1;
		int bY = 1;
		t10(aX, aY, bX, bY); // 시작을 위하여 필요한 호출 부분
		while(true) {
			String input = scan.next();
			System.out.println(input.toUpperCase());
			switch (input.toUpperCase()) {
				case "W": // 위쪽
					aY--;
					break;
				case "S": // 아래쪽
					aY++;
					break;
				case "A": // 왼쪽
					aX--;
					break;
				case "D": // 오른쪽
					aX++;
					break;
				default:
					break;
			}
			System.out.println(aY + ", " + aX + ", " + bY + ", " + bX);
			if(t10(aX, aY, bX, bY)==1) { // 이동을 위하여 호출 부분
				aX = bX;
				aY = bY;
			}else if(t10(aX,aY,bX,bY)==2) {
				aX=1;
				aY=1;
			}else {
				bX = aX;
				bY = aY;
			}
			if(aX==8 && aY==8) 
				break;
		}
	}
	/*void powerup(int aX,int aY) {
		Scanner scan = new Scanner(System.in);
		int bX = 1;
		int bY = 1;
		t10(aX, aY, bX, bY); // 시작을 위하여 필요한 호출 부분
		while(true) {
			String input = scan.next();
			System.out.println(input.toUpperCase());
			switch (input.toUpperCase()) {
				case "W": // 위쪽
					aY--;
					break;
				case "S": // 아래쪽
					aY++;
					break;
				case "A": // 왼쪽
					aX--;
					break;
				case "D": // 오른쪽
					aX++;
					break;
				default:
					break;
			}
			System.out.println(aY + ", " + aX + ", " + bY + ", " + bX);
			if(t10(aX, aY, bX, bY)) { // 이동을 위하여 호출 부분
				aX = bX;
				aY = bY;
			} else {
				bX = aX;
				bY = aY;
			}
			if(aX==8 && aY==8) 
				break;
		}
	}*/

	public int t12(int aX, int aY, int bX, int bY) {
		int result = 0;
		int[][] 맵 = {
				{0,0,0,0,0,0,0,0,0,0}, 
				{0,1,0,1,1,1,1,1,1,0},
				{0,1,0,1,0,0,1,0,1,0},
				{0,1,0,2,0,1,1,0,1,0},
				{0,1,0,0,0,1,1,0,1,0},
				{0,1,0,1,0,0,0,0,1,0},
				{0,1,1,1,1,1,1,1,1,0},
				{0,1,1,0,0,1,0,0,1,0},
				{0,1,1,0,0,1,1,1,1,0},
				{0,0,0,0,0,0,0,0,0,0}
		};
		for(int y = 0; y < 맵.length; y++) { // 행
			for(int x = 0; x < 맵[y].length; x++) { // 열
				if(맵[aY][aX] == 0) {
					aY = bY; 
					aX = bX;
					result = 1;
				}else if(맵[aY][aX]==2) {
					aX=1;
					aY=1;
					result =2;
				}
				if(y == aY && x == aX) {
					System.out.print(" ㉿ ");
				} else if(y==3 && x==3) {
					System.out.print(" ♥ ");
				}else if(맵[y][x] == 1) {
					System.out.print(" □ ");
				} else {
					System.out.print(" ■ ");
				}
			}
			System.out.println();
		}
		return result;
	}
	
	public void t13() {
		Scanner scan = new Scanner(System.in);
		int aX = 1;
		int aY = 1;
		int bX = 1;
		int bY = 1;
		t10(aX, aY, bX, bY); // 시작을 위하여 필요한 호출 부분
		while(true) {
			String input = scan.next();
			System.out.println(input.toUpperCase());
			switch (input.toUpperCase()) {
				case "W": // 위쪽
					aY--;
					break;
				case "S": // 아래쪽
					aY++;
					break;
				case "A": // 왼쪽
					aX--;
					break;
				case "D": // 오른쪽
					aX++;
					break;
				default:
					break;
			}
			System.out.println(aY + ", " + aX + ", " + bY + ", " + bX);
			if(t10(aX, aY, bX, bY)==1) { // 이동을 위하여 호출 부분
				aX = bX;
				aY = bY;
			}else if(t10(aX,aY,bX,bY)==2) {
				aX=1;
				aY=1;
			}else {
				bX = aX;
				bY = aY;
			}
			if(aX==8 && aY==8) 
				break;
		}
	}
}



