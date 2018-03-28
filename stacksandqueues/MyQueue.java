package com.job.prep.stacksandqueues;

import java.util.NoSuchElementException;

public class MyQueue {

	int head;
	int tail;
	int maxsize;
	int[] arr;
	
	public MyQueue(int size){
		maxsize = size;
		arr = new int[maxsize];
		head=-1;
		tail=-1;	
	}
	
	private Boolean isEmpty(){
		return (head==-1 && tail==-1);
	}
	
	private Boolean isFull(){
		return ((tail+1)%maxsize==head);
	}
	
	public void enQueue(int x){
		if(isFull()){
			throw new NoSuchElementException("QUEUE FULL");
		}else if(isEmpty()){
			head++;
			tail++;
			arr[tail]=x;
		}else{
			tail = (tail+1)%maxsize;
			arr[tail]=x;
		}
	}
	
	public int deQueue(){
		if(isEmpty()){
			throw new NoSuchElementException("QUEUE EMPTY");
		}else if(head==tail){
			int x=arr[head];
			head=-1;
			tail=-1;
			return x;
		}else{
			int x=arr[head];
			head = (head+1)%maxsize;
			return x;
		}
	}
	
	public void printQueue(){
		if(isEmpty()){
			throw new NoSuchElementException("QUEUE EMPTY");
		}else{
			System.out.println("=================================================");
			for(int i=head;(i-1)%maxsize!=tail;i++){
				System.out.println(arr[i]);
			}
			System.out.println("=================================================");
		}
	}
}
