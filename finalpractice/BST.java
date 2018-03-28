package com.job.prep.finalpractice;
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ CHECK HERE ++++++++++++++++++++++
//Left Sub Tree <=     |     Right Sub Tree >
public class BST {

	public TreeNode insert(TreeNode root, int d){
		
		if(root==null){
			TreeNode t = new TreeNode();
			t.data = d;
			root = t;
			return root;
		}else{
			if(d>root.data)
			root.right = insert(root.right, d);
			else
			root.left = insert(root.left, d);
			return root;
		}
		
	}
	
	
	public boolean find(TreeNode root, int d){
		if(root==null){
			return false;
		}else if(root.data==d){
			return true;
		}else{
			if(d>root.data){
				return find(root.right, d);
			}else{
				return find(root.left, d);
			}
		}
	}
	
	public TreeNode delete(TreeNode root, int d){
		
		if(root==null){
			return root;
		}else{
			if(root.data==d){
				if(root.left==null && root.right==null){
					return null;
				}else if(root.left==null && root.right!=null){
					return root.right;
				}else if(root.left!=null && root.right==null){
					return root.left;
				}else{
					TreeNode r = root;
					while(r.right!=null){
						r=r.right;
					}
					root.data = r.data;
					delete(root.right, r.data);
					return root;
				}
			}else{
				if(d>root.data){
					root.right = delete(root.right,d);
				}else{
					root.left = delete(root.left,d);
				}
				return root;
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	//public boolean isBalanced(TreeNode root)
	
	//public int[] elementsAtLevel(TreeNode root, int l)
	
	public boolean isBST(TreeNode root){
		
		if(root==null){
			return false;
		}else{
			if(root.left==null && root.right==null){
				return true;
			}else if(root.left==null && root.right!=null){
				if(root.right.data<=root.data){
					return false;
				}else{
					return isBST(root.right);
				}
			}else if(root.left!=null && root.right==null){
				if(root.left.data>root.data){
					return false;
				}else{
					return isBST(root.left);
				}
			}else{
				if(root.left.data>root.data || root.right.data<=root.data){
					return false;
				}else{
					return isBST(root.left)|isBST(root.right);
				}
			}
		}
		
		
	}
	
	
	
	public void preOrderTraversal(TreeNode root){
		if(root==null){
			return;
		}else{
			System.out.println(root.data);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	
	
	public void postOrderTraversal(TreeNode root){
		if(root==null){
			return;
		}else{
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.println(root.data);
		}
	}
	
	
	
	public void inOrderTraversal(TreeNode root){
		if(root==null){
			return;
		}else{
			inOrderTraversal(root.left);
			System.out.println(root.data);
			inOrderTraversal(root.right);
		}
	}
	
}
