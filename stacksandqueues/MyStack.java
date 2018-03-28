package com.job.prep.stacksandqueues;

import java.util.*;

public class MyStack {

	int maxsize;
	int top;
	int[] stack;
	
	public MyStack(int size){
		top = -1;
		maxsize = size;
		stack = new int[size];
	}
	
	public Boolean isFull(){
		if(top==maxsize-1){
			return true;
		}else{
			return false;
		}
	}
	
	public Boolean isEmpty(){
		if(top==-1){
			return true;
		}else{
			return false;
		}
	}
	
	public void push(int x){
		if(isFull()){
			//throw new NoSuchElementException("OVERFLOW");
			System.out.println("OVERFLOWN");
		}else{
			top=top+1;
			stack[top] = x;
		}
	}
	
	public int pop(){
		if(isEmpty()){
			//throw new NoSuchElementException("UNDERFLOW");
			System.out.println("UNDERFLOWN");
			return 0;
		}else{
			int x = stack[top];
			top=top-1;
			return x;
		}
	}
	
	
	//below is not a stack operation
	public void printStack(){
		if(!(isEmpty())){
			for(int i=top;i>=0;i--){
				System.out.println(stack[i]);
			}
		}
	}
	
}
