package com.java0430;

import java.util.Scanner;

public class Worm {
	int [][] map= { 
			{0,0,0,0,0,0,0,0,0,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,0,0,0,0,0,0,0,1,0}
	};
	int[] play= {1,1}; //y,x
	int[] tail= new int[6];
	int cnt=0;
	int[] history= {1,1};
	int[][] eat= {
			{2,2},{2,7},{4,5},{6,2},{6,8},{8,4}
	};
	public void start() {
		Scanner scan= new Scanner(System.in);
		view();	
		while(true) {
			switch(scan.next().toUpperCase()) {
			case "W":
				play[0]--;
				break;
			case "S" :
				play[0]++;
				break;
			case "A" :
				play[1]--;
				break;
			case "D":
				play[1]++;
				break;
			default:
				break;
			}
			//벽처리예외
			if(play[0]==0) {
				play[0]=1;//history[0];
			}else if(play[1]==0) {
				play[1]=1;
			}else if(play[1]==9) {
				play[1]=8;
			}else if(play[0]==9 && play[1]==8) {
				view();	
				System.out.println("끝");
				break;
			}else if(play[0]==9) {
				play[0]=8;
			} 

			//먹을거예외처리
			for(int obj=0;obj<eat.length;obj++) {
				if(play[0]==eat[obj][0] && play[1]==eat[obj][1]) {
					tail[cnt++]=obj+1;
					//먹을거의 히스토리
				}
			}
			if(cnt>0) {
				for(int obj=0;obj<cnt;obj++) {
					int prevobj=tail[obj]-1;
					//if(eat[prevobj][0]!=play[0] || eat[prevobj][1]!=play[1]) {
					if(obj==0) {
						eat[prevobj][0]=history[0];
						eat[prevobj][1]=history[1];
					}else {
						int pprevobj=tail[obj-1]-1;
						eat[prevobj][0]=eat[pprevobj][0];
						eat[prevobj][1]=eat[pprevobj][0];
					}

				}
			}
			view();	
			history[0]=play[0];
			history[1]=play[1];
		}
	}
	
	public void view() {
		boolean check;
		for(int row=0;row<map.length;row++) {
			for(int col=0;col<map[row].length;col++) {
				//System.out.print(map[row][col]);
				check=true;
				if(play[0]==row&&play[1]==col) {
					System.out.print(" ○ ");
					continue;
				}
				for(int obj=0;obj<eat.length;obj++) {
					for(int i=0;i<=cnt;i++) {
						if(obj+1 !=tail[i]) {
							if(eat[obj][0]==row&&eat[obj][1]==col) {
								System.out.print(" ● ");
								check=false;
								break;
							}
						}
						else  {
							if(eat[obj][0]==row&&eat[obj][1]==col) {
								System.out.print(" ○ ");
								check=false;
								break;
							}
						}
					}
				}
				if(check) {
				if(map[row][col]==0) {
					System.out.print(" ■ ");
				}else if(map[row][col]==1) {
					System.out.print(" □ ");
				}
				}
			}
			System.out.println();
		}
	}
	public void move() {
		
	}
	public void sum() {
		
	}
}
