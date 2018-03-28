package com.job.prep.finalpractice;

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ CHECK HERE ++++++++++++++++++++++++++++
public class CircularLinkedList {

	public Node insert(Node head, int d){
		if(head == null){
			Node h = new Node();
			h.data = d;
			head = h;
			return head;
		}else if(head.next==null){
			Node h= new Node();
			h.data = d;
			head.next = h;
			h.next = head;
			return head;
		}else{
			Node h = head;
			while(h.next!=head){
				h=h.next;
			}
			Node h1 = new Node();
			h1.data = d;
			h.next = h1;
			h1.next = head;
			//below line to add node in the front. without this its adding node at the end.
			//head=h1;
			return head;
		}
	}
	
	public void traverse(Node head){
		if(head==null){
			return;
		}else if(head.next==null){
			System.out.println(head.data);
			return;
		}else{
			System.out.println(head.data);
			Node h = head.next;
			while(h!=head){
				System.out.println(h.data);
				h=h.next;
			}
		}
	}
	
	public void update(Node head, int old, int neo){
		if(head==null){
			return;
		}else if(head.next==null){
			if(head.data==old){
				head.data=neo;
			}
			return;
		}else{
			if(head.data==old){
				head.data=neo;
				return;
			}else{
			Node h = head.next;
			while(h!=head){
				if(h.data==old){
					h.data = neo;
					break;
				}else{
					h=h.next;
				}
			}
			if(h==head){
				System.out.println("No Update Made!");
			}
			return;
			}
		}
	}
	
	public Node delete(Node head, int d){
		if(head==null){
			
		}else if(head.next==null){
			if(head.data==d){
				head=head.next;
			}
		}else if(head.next.next==null){
			if(head.data==d){
				head=head.next;
				head.next=null;
			}else if(head.next.data==d){
				head.next=null;
			}
		}else{
			
			if(head.data==d){
				Node h = head;
				while(h.next!=head){
					h=h.next;
				}
				h.next = head.next;
				head = h.next;
			}else{
				Node h = head;
				while(h.next!=head){
					if(h.next.data==d){
						h.next=h.next.next;
						break;
					}else{
						h=h.next;
					}
				}
			}
		}
		return head;
		
		}
	
	public Node reverse(Node head){
		if(head==null){
			
		}else if(head.next==null){
			
		}else if(head.next.next==null){
			head = head.next;
		}else{
			Node first = head;
			Node second = head.next;
			Node third = head.next.next;
			while(true){
				second.next = first;
				if(second==head){
					head=first;
					break;
				}
				first = second;
				second = third;
				third = third.next;
			}
		}
		return head;
	}
	
	
}
