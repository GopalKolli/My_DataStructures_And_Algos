package com.job.prep.finalpractice;

import java.util.NoSuchElementException;

public class MyStack {

	int top;
	int size;
	int[] arr;
	
	public MyStack(int s){
		top=-1;
		size = s;
		arr = new int[size];
	}
	
	private boolean isEmpty(){
		if(top==-1){
			return true;
		}else{
			return false;
		}
	}
	
	private boolean isFull(){
		if(top==size-1){
			return true;
		}else{
			return false;
		}
	}
	
	public void push(int i){
		if(isFull()){
			throw new NoSuchElementException("Stack Full!");
		}else{
			top=top+1;
			arr[top]=i;
		}
	}
	
	public int pop(){
		if(isEmpty()){
			throw new NoSuchElementException("Stack Empty!");
		}else{
			int x = arr[top];
			top=top-1;
			return x;
		}
	}
	
	public int peek(){
		if(isEmpty()){
			throw new NoSuchElementException("Stack Empty!");
		}else{
			return arr[top];
		}
	}
	
	public void see(){
		if(isEmpty()){
			System.out.println("Stack is Empty!!");
		}else{
		for(int i=top;i>=0;i--){
			System.out.println(arr[i]);
		}
		}
	}
	
	
	
}
