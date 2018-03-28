package com.job.prep.stacksandqueues;

import java.util.NoSuchElementException;

public class MyDynamicStack {

	int maxsize;
	int top;
	int[] stack;
	
	public MyDynamicStack(){
		maxsize = 2;
		stack = new int[maxsize];
		top=-1;
	}
	
	public Boolean isEmpty(){
		if(top==-1){
			return true;
		}else{
			return false;
		}
	}
	
	private Boolean isFull(){
		if(top==maxsize-1){
			return true;
		}else{
			return false;
		}
	}
	
	private void resize(){
		int[] newstack = new int[maxsize*2];
		System.arraycopy(stack, 0, newstack, 0,maxsize);
		stack=newstack;
		maxsize=maxsize*2;
	}
	
	public void push(int x){
		if(isFull()){
			resize();
		}
		top=top+1;
		stack[top]=x;
	}
	
	public int pop(){
		if(isEmpty()){
			throw new NoSuchElementException("UNDERFLOW");
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
