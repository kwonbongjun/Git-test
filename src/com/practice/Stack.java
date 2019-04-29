package com.practice;

import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		LinkedList l=new LinkedList();
		int x;
		for(int i=0;i<n;i++) {
		String s=scan.next();
		if(s.equals("push")) {
			x=scan.nextInt();
			l.push(x);
		}else if(s.equals("pop")) {
			l.pop();
		}else if(s.equals("size")) {
			l.size();
		}else if(s.equals("empty")) {
			l.empty();
		}else if(s.equals("top")) {
			l.top();
		}
		}
		scan.close();
	}

}/*
class LinkedList{
	Node Top;
	LinkedList(){
		Top=null;
	}
	void push(int x) {
		//LinkedList l=new LinkedList();
		Node node=new Node();
		if(Top!=null) {
		node.prev=Top;
		Top.next=node;
		}
		Top=node;
		node.data=x;
		node.next=null;
	};
	void pop() {
		if(Top==null) {
			System.out.println("-1");
			return;
		}
		System.out.println(Top.data);
		Top=Top.prev;
		if(Top!=null)
		Top.next=null;
	};
	void size() {
		Node temp=Top;
		int c=0;
		while(temp!=null) {
			temp=temp.prev;
			c++;
		}
		System.out.println(c);
	};
	void empty() {
		if(Top==null) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	};
	void top() {
		if(Top!=null)
		System.out.println(Top.data);
		else {
			System.out.println("-1");
		}
	};
}
class Node{
Object data; //int 대입할때 wrapper클래스 Integer로 변환되서 대입
Node next;
Node prev;
Node() {
	data=0;
	prev=null;
	next=null;
}
}*/