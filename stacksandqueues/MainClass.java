package com.job.prep.stacksandqueues;

public class MainClass {

	public static void main(String[] args) {
		MainClass checker = new MainClass();
		Practice prac = new Practice();
		//checker.checkStack();
		//checker.checkDynamicStack();
		//checker.checkThreeStacks();
		//checker.checkQueue();
		//checker.checkDynamicQueue();
		//checker.checkLinkedList();
		//checker.checkDoublyLinkedList();
		//checker.checkCircularLinkedList();
		//checker.checkBinarySearchTree();
		//prac.fibbonacci(24);
		//System.out.println(prac.largestpalindrome(99, 91));
		int[] arr = {26,10,13,12,2,2,15,11,12,16,6,17,9,24,1,0,14,1,0,32,20,24,4,2};
		System.out.println(prac.sumPairs(arr,26));
	}
	
	private void checkStack(){

		MyStack stack = new MyStack(10);
		
		stack.push(1);
		stack.push(2);
		stack.push(4);
		stack.push(8);
		stack.push(16);
		stack.push(32);
		System.out.println("-----------------------");
		stack.printStack();
		stack.push(64);
		stack.push(128);
		stack.push(256);
		stack.push(512);
		System.out.println("-----------------------");
		stack.printStack();
		stack.push(13);
		stack.push(12);
		System.out.println("-----------------------");
		stack.printStack();
		
		System.out.println("-----------------------");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("after 6 pops-----------------------");
		stack.printStack();
		System.out.println("-----------------------------------");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("after 10 pops-----------------------");
		stack.printStack();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("after 13 pops-----------------------");
		stack.printStack();
		System.out.println("------------------------------------");
		stack.push(2017);
		stack.printStack();

	
	}
	
private void checkDynamicStack(){

		
		MyDynamicStack stack = new MyDynamicStack();
		
		stack.push(1);
		stack.push(2);
		stack.push(4);
		stack.push(8);
		stack.push(16);
		stack.push(32);
		System.out.println("after 6 pushes -----------------------");
		stack.printStack();
		stack.push(64);
		stack.push(128);
		stack.push(256);
		stack.push(512);
		System.out.println("after 10 pushes -----------------------");
		stack.printStack();
		stack.push(13);
		stack.push(12);
		System.out.println("after 12 pushes -----------------------");
		stack.printStack();
		
		System.out.println("POPPING NOW  -----------------------");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("after 6 pops-----------------------");
		stack.printStack();
		System.out.println("POPPING NOW  -----------------------------------");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("after 10 pops-----------------------");
		stack.printStack();
		System.out.println("POPPING NOW  -----------------------");
		
		try {
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("after 13 pops-----------------------");
		stack.printStack();
		System.out.println("------------------------------------");
		stack.push(2017);
		stack.printStack();

	
	}

	private void checkThreeStacks(){
		
		ThreeStacks stacks = new ThreeStacks(6);
		for(int i=0;i<6;i++){
			stacks.push(1,i);
		}
		
		for(int i=0;i<6;i++){
			stacks.push(2,10+i);
		}
		
		for(int i=0;i<6;i++){
			stacks.push(3,20+i);
		}
		
		stacks.printstacks();
		System.out.println("-------------------------------------");
		System.out.println(stacks.pop(1));
		System.out.println("-------------------------------------");
		System.out.println(stacks.pop(1));
		System.out.println("-------------------------------------");
		System.out.println(stacks.pop(1));
		System.out.println("-------------------------------------");
		System.out.println(stacks.pop(1));
		System.out.println("-------------------------------------");
		System.out.println(stacks.pop(1));
		System.out.println("-------------------------------------");
		System.out.println(stacks.pop(1));
		System.out.println("-------------------------------------");
		System.out.println(stacks.pop(1));
		System.out.println("-------------------------------------");
		System.out.println(stacks.pop(1));
		System.out.println("-------------------------------------");
		stacks.printstacks();
	}

	private void checkQueue(){
		
		MyQueue q = new MyQueue(5);
		q.enQueue(1);
		q.printQueue();
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.printQueue();
		
		try {
			q.enQueue(6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		q.printQueue();
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		q.printQueue();
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		
		try {
			System.out.println(q.deQueue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void checkDynamicQueue(){

		
		MyDynamicQueue q = new MyDynamicQueue();
		q.enQueue(1);
		q.printQueue();
		q.enQueue(2);
		q.printQueue();
		q.enQueue(3);
		q.printQueue();
		q.enQueue(4);
		q.enQueue(5);
		q.printQueue();
		
		
		q.printQueue();
		System.out.println("dequeing now!! 3 times");
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println("--------------");
		q.printQueue();
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		
		try {
			System.out.println(q.deQueue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public void checkLinkedList(){
		MyLinkedList linkl = new MyLinkedList();
		linkl.insertEnd(200);
		linkl.insertEnd(22);
		linkl.insert(1);
		linkl.insert(2);
		linkl.insert(3);
		linkl.printLinkedList();
		linkl.reverse();
		linkl.printLinkedList();
		linkl.delete(22);
		linkl.printLinkedList();
		linkl.delete(3);
		linkl.printLinkedList();
		linkl.delete(33);
		linkl.printLinkedList();
		linkl.delete(1);
		linkl.printLinkedList();
		linkl.delete(2);
		linkl.printLinkedList();
		linkl.delete(200);
		linkl.printLinkedList();
		linkl.delete(4);
	}
	
	public void checkDoublyLinkedList(){
		DoublyLinkedList ls = new DoublyLinkedList();
		try{
		ls.printLinkedListStraight();
		ls.printLinkedListReverse();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		ls.insert(2);
		ls.insert(4);
		ls.insertEnd(45);
		ls.insertEnd(100);
		ls.insert(222);
		
		ls.printLinkedListStraight();
		ls.printLinkedListReverse();
		ls.delete(222);
		ls.printLinkedListStraight();
		ls.printLinkedListReverse();
		ls.delete(222);
		ls.printLinkedListStraight();
		ls.printLinkedListReverse();
		ls.delete(4);
		ls.printLinkedListStraight();
		ls.printLinkedListReverse();
		ls.delete(45);
		ls.printLinkedListStraight();
		ls.printLinkedListReverse();
		ls.delete(2);
		ls.printLinkedListStraight();
		ls.printLinkedListReverse();
		ls.delete(100);
		ls.printLinkedListStraight();
		ls.printLinkedListReverse();
	}

	public void checkCircularLinkedList(){
		CircularLinkedList cll = new CircularLinkedList();
		try{
		cll.printCircularLinkedList();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("EXCEPTION CAUGHT!!");
		}
		System.out.println("EXECUTING REST");
		cll.insert(1);
		cll.insert(2);
		cll.insert(3);
		cll.insert(4);
		cll.insert(5);
		cll.printCircularLinkedList();
		cll.delete(200);
		cll.printCircularLinkedList();
		cll.delete(1);
		cll.delete(5);
		cll.delete(3);
		cll.printCircularLinkedList();
		
	}
	
	public void checkBinarySearchTree(){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(8);
		bst.insert(4);
		bst.insert(16);
		bst.insert(2);
		bst.insert(7);
		bst.insert(12);
		bst.insert(20);
		bst.printBinaryTree();
	}
	
	
	public void checking(){
		System.out.println(Integer.toBinaryString(235));
		System.out.println(Integer.toBinaryString(140));
		System.out.println(Integer.toBinaryString(4));
	}
	
	
}
