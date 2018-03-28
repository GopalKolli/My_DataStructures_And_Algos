package com.job.prep.finalpractice;

import java.util.NoSuchElementException;

public class MyQueue {

	int head;
	int tail;
	int size;
	int[] arr;
	
	public MyQueue(int s){
		head = -1;
		tail = -1;
		size = s;
		arr = new int[size];
	}
	
	private boolean isEmpty(){
		if(head==-1 && tail==-1){
			return true;
		}else{
			return false;
		}
	}
	
	private boolean isFull(){
		if((tail+1)%size==head){
			return true;
		}else{
			return false;
		}
	}
	
	public void enQueue(int i){
		if(isFull()){
			throw new NoSuchElementException("Queue Full!");
		}else if(isEmpty()){
			head=head+1;
			tail=tail+1;
			arr[tail] = i;
		}else{
			tail=(tail+1)%size;
			arr[tail] = i;
		}
	}
	
	public int deQueue(){
		if(isEmpty()){
			throw new NoSuchElementException("Queue Empty!!");
		}else if(head==tail){
			int x = arr[head]; 
			head = -1;
			tail = -1;
			return x;
		}else{
			int x = arr[head];
			head = (head+1)%size;
			return x;
		}
	}
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++CHECK HERE++++++++++++++++++++++++
	public void see(){
		if(isEmpty()){
			throw new NoSuchElementException("Queue Empty!");
		}else{
			boolean done=false;
			
			for(int i=head;!done;i=(i+1)%size){
				System.out.println(arr[i]);
				if(i==tail){
					done=true;
				}
			}
		}
	}
	
	
}
