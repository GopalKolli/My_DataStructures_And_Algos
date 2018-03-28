package com.job.prep.junk;

public class Checker {
	public static void main(String[] args){
		Node n = new Node();
		n.data = 1;
		n.name = "prev";
		func(n);
		System.out.println(n.data);
		System.out.println(n.name);
	}
	
	public static void func(Node n1){
		n1.data = 4;
		n1.name = "Next";
	}

}
