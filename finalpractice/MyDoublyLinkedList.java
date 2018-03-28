package com.job.prep.finalpractice;

public class MyDoublyLinkedList {

	public DblNode insert(DblNode head, int d){
		if(head==null){
			DblNode h = new DblNode();
			h.data = d;
			head=h;
			return h;
		}else{
			DblNode h = new DblNode();
			h.data = d;
			h.next = head;
			head.prev = h;
			head = h;
			return head;
		}
	}
	
	public DblNode insertEnd(DblNode head, int d){
		if(head==null){
			DblNode h = new DblNode();
			h.data = d;
			head = h;
			return head;
		}else{
			DblNode h = head;
			while(h.next!=null){
				h=h.next;
			}
			DblNode h1 = new DblNode();
			h1.data = d;
			h.next = h1;
			h1.prev = h;
			return head;
		}
	}
	
	
	public void traverse(DblNode head){
		if(head==null){
			return;
		}else{
			DblNode h = head;
			while(h!=null){
				System.out.println(h.data);
				h=h.next;
			}
		}
	}
	
	public void update(DblNode head, int old, int neo){
		if(head==null){
			return;
		}else{
			DblNode h = head;
			while(h!=null){
				if(h.data==old){
					h.data = neo;
					break;
				}else{
					h = h.next;
				}
			}
			if(h==null){
				System.out.println("No Update Made!");
			}
		}
	}
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++ CHECK HERE ++++++++++++++++++++++++
	public DblNode delete(DblNode head, int d){
		if(head==null){
			return head;
		}else if(head.data==d){
			head=head.next;
			head.prev=null;
			return head;
		}else{
			DblNode h = head;
			while(h.next!=null){
				if(h.next.data==d){
					h.next=h.next.next;
					if(h.next!=null){
						h.next.prev=h;
					}
					break;
				}else{
					h=h.next;
				}
			}
			return head;
		}
	}
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ CHECK HERE ++++++++++++++++++
	public DblNode reverse(DblNode head){
		if(head==null){
			return head;
		}else if(head.next==null){
			return head;
		}else{
			DblNode h = head;
			while(h!=null){
				DblNode temp = h.next;
				h.next = h.prev;
				h.prev = temp;
				if(temp==null){
					head = h;
					break;
				}else{
				h = temp;
				}
			}
			return head;
		}
	}
	
	
	
}
