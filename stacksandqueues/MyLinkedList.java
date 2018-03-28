package com.job.prep.stacksandqueues;

import java.util.NoSuchElementException;

public class MyLinkedList {

	Node head;
	
	public void insert(int x){
		Node newn = new Node();
		newn.data = x;
		
		newn.next = head;
		
		head = newn;
	}
	
	public void insertEnd(int x){
		Node newn = new Node();
		newn.data=x;
		
		if(head==null){
			head = newn;
		}else{
			Node h = new Node();
			h = head;
			while(h.next!=null){
				h=h.next;
			}
			h.next = newn;
		}
	}
	
	public void delete(int key){
		if(head==null){
			throw new NoSuchElementException("LINKED LIST EMPTY!");
		}
		
		if(head.data==key){
			head=head.next;
		}else{
			Node h = new Node();
			h = head;
			while(h.next!=null){
				if(h.next.data==key){
					h.next=h.next.next;
					break;
				}else{
					h=h.next;
					continue;
				}
				
			}
			
		}
	}
	
	public void reverse(){
		Node prevnode = null;
		Node nextnode=null;
		Node h = new Node();
		h=head;
		while(h!=null){
			nextnode = h.next;
			h.next = prevnode;
			prevnode = h;
			h=nextnode;
		}
		head = prevnode;
	}
	
	
	public void printLinkedList(){
		Node h = new Node();
		h = head;
		System.out.println("PRINTING LINKED LIST ==========================================");
		while(h!=null){
			System.out.println(h.data);
			h=h.next;
		}
		System.out.println("==========================================");
	}
	
	
	
}
