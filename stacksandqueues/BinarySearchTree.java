package com.job.prep.stacksandqueues;

public class BinarySearchTree {
	
	TreeNode root;
	
	public void insert(int x){
		if(root==null){
			TreeNode newn = new TreeNode();
			newn.data = x;
			root = newn;
		}else{
			TreeNode targetnode = new TreeNode();
			targetnode = root;
			while(targetnode!=null){
				if(x<=(targetnode.data)){
					targetnode = targetnode.left;
				}else{
					targetnode = targetnode.right;
				}
			}
			
			TreeNode newn = new TreeNode();
			newn.data = x;
			targetnode = newn;
			
		}
		System.out.println("NODE INSERTED");
	}
	
	public void printBinaryTree(){
		printBTree(root);
	}
	
	private void printBTree(TreeNode n){
		if(n!=null){
			System.out.println(n.data);
			if(n.left!=null){
				printBTree(n.left);
			}
			if(n.right!=null){
				printBTree(n.right);
			}
		}
	}
	
}
