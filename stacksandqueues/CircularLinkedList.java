package com.job.prep.stacksandqueues;

import java.util.NoSuchElementException;

public class CircularLinkedList {

	//Dont initiate the head here! I mean don't do Node head = new Node();
	Node head;
	
	public void insert(int x){
		if(head==null){
			Node newn = new Node();
			newn.data = x;
			newn.next = newn;
			head=newn;
		}else{
			Node h = new Node();
			h=head;
			while(h.next!=head){
				h=h.next;
			}
			Node newn = new Node();
			newn.data = x;
			h.next = newn;
			newn.next=head;
			head=newn;
		}
		
	}
	
	public void delete(int key){
		if(head==null){
			throw new NoSuchElementException("LINKED LIST EMPTY!");
		}else if(head.data == key){
			Node h = new Node();
			h=head;
			while(h.next!=head){
				h=h.next;
			}
			h.next = h.next.next;
			head=head.next;
		}else{
			Node h = new Node();
			h=head;
			
			while(h.next.data!=key && h.next!=head){
				h=h.next;
			}
			
			if(h.next!=head)
			h.next = h.next.next;
		}
	}
	
	public void printCircularLinkedList(){
		if(head==null){
			throw new NoSuchElementException("LINKED LIST EMPTY!");
		}
		Node h = new Node();
		h = head;
		System.out.println("PRINTING CIRCULAR LINKED LIST================");
		System.out.println(h.data);
		h=h.next;
		while(h!=head){
			System.out.println(h.data);
			h=h.next;
		}
		System.out.println("=============================================");
	}
	
	
	
	
}
