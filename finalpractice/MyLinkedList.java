package com.job.prep.finalpractice;

public class MyLinkedList {

	public Node insert(Node head, int d){
		if(head==null){
			Node h = new Node();
			h.data = d;
			head = h;
			return head;
		}else{
			Node h = new Node();
			h.data = d;
			h.next = head;
			head = h;
			return head;
		}
	}
	
	public Node insertEnd(Node head, int d){
		if(head == null){
			Node h = new Node();
			h.data = d;
			head = h;
			return head;
		}else{
			Node h = head;
			while(h.next!=null){
				h=h.next;
			}
			Node h1 = new Node();
			h1.data = d;
			h.next = h1;
			return head;
		}
	}
	
	public void traverse(Node head){
		if(head==null){
			return;
		}else{
			Node h = head;
			while(h!=null){
				System.out.println(h.data);
				h=h.next;
			}
		}
	}
	
	public void update(Node head, int old, int neo){
		if(head==null){
			return;
		}else{
			Node h = head;
			while(h!=null){
				if(h.data==old){
					h.data = neo;
					break;
				}else{
					h=h.next;
				}
			}
			if(h==null){
				System.out.println("No Update Made!");
			}
		}
	}
	
	public Node delete(Node head, int d){
		if(head==null){
			return head;
		}else if(head.data==d){
			head = head.next;
			return head;
		}else{
			Node h = head;
			while(h.next!=null){
				if(h.next.data==d){
					h.next=h.next.next;
					break;
				}else{
					h=h.next;
				}
			}
			return head;
		}
	}
	
	public Node reverse(Node head){
		if(head==null){
			return head;
		}else if(head.next==null){
			return head;
		}else{
			Node first = head;
			Node second = head.next;
			Node third = head.next.next;
			while(true){
				second.next = first;
				first=second;
				second=third;
				if(third==null){
					break;
				}else{
					third=third.next;
				}
			}
			head.next = null;
			head = first;
			return head;
		}
	}
	
}
