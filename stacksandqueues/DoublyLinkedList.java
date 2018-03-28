package com.job.prep.stacksandqueues;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

	DoublyNode head;
	
	public void insert(int x){
		if(head == null){
			DoublyNode newn = new DoublyNode();
			newn.data = x;
			head = newn;
		}else{
			DoublyNode newn = new DoublyNode();
			newn.data = x;
			newn.next=head;
			head.prev=newn;
			head = newn;
		}
	}
	
	public void insertEnd(int x){
		if(head==null){
			DoublyNode newn = new DoublyNode();
			newn.data = x;
			head = newn;
		}else{
			DoublyNode h = new DoublyNode();
			h=head;
			while(h.next!=null){
				h=h.next;
			}
			DoublyNode newn = new DoublyNode();
			newn.data = x;
			h.next = newn;
			newn.prev = h;
		}
	}
	
	public void delete(int key){
		if(head==null){
			throw new NoSuchElementException("LINKED LIST EMPTY!");
		}
		
		if(head.data==key){
			head = head.next;
			
			if(head!=null){
			head.prev=null;
			}
			
		}else{
			DoublyNode h = new DoublyNode();
			h = head;
			while(h.next!=null){
				if(h.next.data == key){
					h.next=h.next.next;
					if(!(h.next==null)){
						h.next.prev = h;
					}
					break;
				}else{
					h = h.next;
				}
			}
		}
	}
	
	public void printLinkedListStraight(){
		if(head==null){
			throw new NoSuchElementException("LINKED LIST EMPTY!");
		}else{
			DoublyNode h = new DoublyNode();
			h = head;
			System.out.println("PRINTING STRAIGHT ============================");
			while(h!=null){
				System.out.println(h.data);
				h=h.next;
			}
			System.out.println("==============================================");
		}
	}
	
	public void printLinkedListReverse(){
		if(head==null){
			throw new NoSuchElementException("LINKED LIST EMPTY!");
		}else{
			DoublyNode h = new DoublyNode();
			h = head;
			while(h.next!=null){
				h=h.next;
			}
			System.out.println("PRINTING REVERSE ============================");
			while(h!=null){
				System.out.println(h.data);
				h=h.prev;
			}
			System.out.println("==============================================");
		}
	}
	
	
}
