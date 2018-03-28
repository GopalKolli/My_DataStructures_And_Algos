package com.job.prep.stacksandqueues;

import java.util.NoSuchElementException;

public class MyDynamicQueue {
	
	int maxsize;
	int head;
	int tail;
	int[] arr;
	
	public MyDynamicQueue(){
		maxsize=2;
		arr = new int[maxsize];
		head =-1;
		tail =-1;
	}
	
	public Boolean isEmpty(){
		return (head==-1 && tail==-1);
	}
	
	public Boolean isFull(){
		return ((tail+1)%maxsize==head);
	}
	
	public void enQueue(int x){
		if(isFull()){
			//throw new NoSuchElementException("QUEUE FULL");
			resize();
			tail = (tail+1)%maxsize;
			arr[tail] = x;
		}else if(isEmpty()){
			head++;
			tail++;
			arr[tail]=x;
			
		}else{
			tail = (tail+1)%maxsize;
			arr[tail] = x;
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
	
	private void resize(){
		int[] newarr = new int[maxsize*2];
		System.arraycopy(arr, 0, newarr, 0, arr.length);
		maxsize=maxsize*2;
		arr=newarr;
		System.out.println("ARRAY RESIZED");
	}

	public void printQueue(){
		if(isEmpty()){
			System.out.println("Queue Empty");
		}else{
			System.out.println("QUEUE  :  ===============================================");
			for(int i=head;(i-1)%maxsize!=tail;i++){
				System.out.println(arr[i]);
			}
			System.out.println("===============================================");
		}
	}
}
