package com.job.prep.finalpractice;

public class Checker {

	public static void main(String[] args){
		//Checking MyStack
		/*MyStack s = new MyStack(6);
		s.push(4);
		s.push(6);
		s.push(8);
		s.push(10);
		s.push(12);
		s.push(14);
		s.see();
		System.out.println("======================");
		System.out.println(s.peek());
		System.out.println("======================");
		System.out.println("==POPPING==");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println("==========================");
		s.see();*/
		
		//Checking MyDynamicStack
		/*MyDynamicStack ds = new MyDynamicStack();
		ds.push(4);
		ds.push(6);
		ds.push(8);
		ds.push(10);
		ds.push(11);
		
		ds.see();
		
		System.out.println("==POPPING==");
		System.out.println(ds.pop());
		System.out.println(ds.pop());
		System.out.println(ds.pop());
		System.out.println("==POPPING==");
		
		ds.see();*/
		
		//Checking MyQueue
		/*MyQueue q = new MyQueue(6);
		q.enQueue(4);
		q.enQueue(6);
		q.enQueue(8);
		q.enQueue(10);
		q.enQueue(12);
		q.enQueue(3);
		
		q.see();
		System.out.println("============================");
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println("============================");
		q.see();
		q.enQueue(101);
		System.out.println("============================");
		q.see();*/
		
		//Checking LinkedList
		/*Node n=null;
		MyLinkedList l = new MyLinkedList();
		n=l.insert(n, 10);
		n=l.insert(n, 20);
		n=l.insert(n, 30);
		n=l.insert(n, 40);
		n=l.insert(n, 50);
		
		System.out.println("==============================");
		l.traverse(n);
		System.out.println("==============================");
		
		l.insertEnd(n,100);
		l.insertEnd(n,200);
		l.insertEnd(n,300);
		l.insertEnd(n,400);
		l.insertEnd(n,500);
		
		System.out.println("==============================");
		l.traverse(n);
		System.out.println("==============================");
		
		l.update(n, 100, 120);
		l.update(n, 200, 220);
		l.update(n, 300, 320);
		l.update(n, 400, 420);
		l.update(n, 500, 520);
		l.update(n, 600, 620);
		
		System.out.println("==============================");
		l.traverse(n);
		System.out.println("==============================");
		
		n=l.delete(n, 420);
		n=l.delete(n, 50);
		n=l.delete(n, 520);
		
		System.out.println("==============================");
		l.traverse(n);
		System.out.println("==============================");
		
		n=l.reverse(n);
		
		System.out.println("===============================");
		l.traverse(n);
		System.out.println("===============================");*/
		
		//Checking DoublyLinkedList
				/*DblNode n=null;
				MyDoublyLinkedList ll = new MyDoublyLinkedList();
				n=ll.insert(n, 10);
				n=ll.insert(n, 20);
				n=ll.insert(n, 30);
				n=ll.insert(n, 40);
				n=ll.insert(n, 50);
				
				System.out.println("==============================");
				ll.traverse(n);
				System.out.println("==============================");
				
				ll.insertEnd(n,100);
				ll.insertEnd(n,200);
				ll.insertEnd(n,300);
				ll.insertEnd(n,400);
				ll.insertEnd(n,500);
				
				System.out.println("==============================");
				ll.traverse(n);
				System.out.println("==============================");
				
				ll.update(n, 100, 120);
				ll.update(n, 200, 220);
				ll.update(n, 300, 320);
				ll.update(n, 400, 420);
				ll.update(n, 500, 520);
				ll.update(n, 600, 620);
				
				System.out.println("==============================");
				ll.traverse(n);
				System.out.println("==============================");
				
				n=ll.delete(n, 420);
				n=ll.delete(n, 520);
				n=ll.delete(n, 50);
				
				System.out.println("==============================");
				ll.traverse(n);
				System.out.println("==============================");
				
				n=ll.reverse(n);
				
				System.out.println("===============================");
				ll.traverse(n);
				System.out.println("===============================");*/
		
		//Checking Circular Linked List
		/*Node n=null;
		CircularLinkedList cl = new CircularLinkedList();
		n=cl.insert(n, 10);
		n=cl.insert(n, 20);
		n=cl.insert(n, 30);
		n=cl.insert(n, 40);
		n=cl.insert(n, 50);
		
		System.out.println("==============================");
		cl.traverse(n);
		System.out.println("==============================");
		
		n=cl.insert(n,100);
		n=cl.insert(n,200);
		n=cl.insert(n,300);
		n=cl.insert(n,400);
		n=cl.insert(n,500);
		
		System.out.println("==============================");
		cl.traverse(n);
		System.out.println("==============================");
		
		cl.update(n, 100, 120);
		cl.update(n, 200, 220);
		cl.update(n, 300, 320);
		cl.update(n, 400, 420);
		cl.update(n, 500, 520);
		cl.update(n, 600, 620);
		
		System.out.println("==============================");
		cl.traverse(n);
		System.out.println("==============================");
		
		n=cl.delete(n, 420);
		n=cl.delete(n, 520);
		n=cl.delete(n, 50);
		n=cl.delete(n, 10);
		
		System.out.println("==============================");
		cl.traverse(n);
		System.out.println("==============================");
		
		n=cl.reverse(n);
		
		System.out.println("===============================");
		cl.traverse(n);
		System.out.println("===============================");*/
		
		
		//Checking Binary Search Tree
		TreeNode root = null;
		BST bstree = new BST();
		root = bstree.insert(root, 20);
		root = bstree.insert(root, 10);
		root = bstree.insert(root, 30);
		root = bstree.insert(root, 15);
		root = bstree.insert(root, 5);
		root = bstree.insert(root, 25);
		root = bstree.insert(root, 35);
		
		bstree.inOrderTraversal(root);
		System.out.println("=============================");
		bstree.preOrderTraversal(root);
		System.out.println("=============================");
		bstree.postOrderTraversal(root);
		
		System.out.println("============================= is BST?");
		System.out.println(bstree.isBST(root));
		System.out.println("=============================");
		
		System.out.println(bstree.find(root, 5));
		System.out.println(bstree.find(root, 3));
		System.out.println(bstree.find(root, 25));
		
		root = bstree.delete(root, 20);
		root = bstree.delete(root, 30); 
		
		System.out.println(bstree.find(root, 5));
		System.out.println(bstree.find(root, 3));
		System.out.println(bstree.find(root, 20));
		
		System.out.println("============================= is BST?");
		System.out.println(bstree.isBST(root));
		System.out.println("=============================");  
		
	}
}
