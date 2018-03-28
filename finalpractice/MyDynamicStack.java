package com.job.prep.finalpractice;

import java.util.NoSuchElementException;

public class MyDynamicStack {

	int top;
	int size;
	int[] arr;
	
	public MyDynamicStack(){
		top=-1;
		size = 2;
		arr = new int[size];
	}
	
	private boolean isFull(){
		if(top==size-1){
			return true;
		}else{
			return false;
		}
	}
	
	private boolean isEmpty(){
		if(top==-1){
			return true;
		}else{
			return false;
		}
	}
	
	private void resize(){
		int newsize = size*2;
		int[] newarr = new int[newsize];
		System.arraycopy(arr, 0, newarr, 0, arr.length);
		arr = newarr;
		size = newsize;
	}
	
	public void push(int i){
		if(isFull()){
			resize();
			top=top+1;
			arr[top] = i;
		}else{
			top=top+1;
			arr[top]=i;
		}
	}
	
	public int pop(){
		if(isEmpty()){
			throw new NoSuchElementException("Stack Empty!!");
		}else{
			int x = arr[top];
			top=top-1;
			return x;
		}
	}
	
	public int peek(){
		if(isEmpty()){
			throw new NoSuchElementException("Stack Empty!!");
		}else{
			return arr[top];
		}
	}
	
	public void see(){
		if(isEmpty()){
			throw new NoSuchElementException("Stack Empty!!");
		}else{
			for(int i=top;i>=0;i--){
				System.out.println(arr[i]);
			}
		}
	}
	
	
}
