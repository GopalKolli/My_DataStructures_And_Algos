package com.job.prep.dynamicprogramming;

public class Implementation {

	int[] mem = new int[101];
	int[] profits = {0,2,5,6,7};
;	
	//This is Recursion. The same sub problem tends to be solved multiple times.
	//If this is an optimization problem, sub problems tend to be solved too many times than normal. High time complexity.
	public int fibonacciNumberRecursive(int position){
		if(position == 1){
			return 0;
		}else if(position == 2){
			return 1;
		}else{
			return fibonacciNumberRecursive(position-1)+fibonacciNumberRecursive(position-2);
		}
	}
	
	//This is Recursion with Memoization. 
	//Good for applying while solving optimization problems(as the subproblems are repeatedly solved many times)
	public int fibonacciNumberRecMemoization(int position){
		if(position == 1){
			return 0;
		}else if(position == 2){
			return 1;
		}else{
			if(mem[position]!=0){
				return mem[position];
			}else{
				int res = fibonacciNumberRecMemoization(position-1)+fibonacciNumberRecMemoization(position-2);
				mem[position]=res;
				return res;
			}
		}
	}
	
	//Applicable for progressively increasing series solutions.
	public int fibonacciBottomUpDP(int position){
		if(position==1){
			return 0;
		}else if(position==2){
			return 1;
		}else{
			int first = 0;
			int second = 1;
			int third = 0;;
			for(int i=3;i<=position;i++){
				third = first+second;
				first = second;
				second = third;
			}
			return third;
		}
	}
	
	//This is an optimization problem.
	//So, we do Recursion with Memoization
	public int OptimalRodCutting(int length){
		//keep all known results in memory
		int[] res = {0,2,5,7,10};
		//Recursion break conditions using known results.
		if(length<= 4){
			return res[length];
		}
		//Check if the subproblem is already solved.
		//Return the solution if available
		else if(mem[length]!=0){
			return mem[length];
		}else{
			//Find the current best next step (cut) that can be made for which we know the profit/loss.
			//here you can also choose to not make a cut in order to maximize profit.
			int maxprofit = -1;
			int nocutprofit = -1;
			if(length<5){
				nocutprofit = profits[length];
			}
			for(int i=1;i<=4;i++){
				int currentCutProfit = res[i] + OptimalRodCutting(length-i);
				if(nocutprofit > maxprofit){
					maxprofit = nocutprofit;
				}
				if(currentCutProfit > maxprofit){
					maxprofit = currentCutProfit;
				}
			}
			//As the subproblem is solved once, keep its result in memory so that the result can be reused instead of solving the subproblem again.
			mem[length] = maxprofit;
			return maxprofit;
		}
	}
	
	public int OptimalRodCuttingBottomUpDP(int length){
		int[] res = new int[101];
		res[1] = 2;
		res[2] = 5;
		res[3] = 7;
		res[4] = 10;
		
		if(length<5){
			return res[length];
		}else{
			for(int i=5;i<=length;i++){
				int maxprofit = -1;
				for(int j=1;j<=i/2;j++){
					int currentprofit = res[j]+res[i-j];
					if(currentprofit > maxprofit){
						maxprofit = currentprofit;
					}
				}
				res[i] = maxprofit;
			}
			return res[length];
		}
	}
	
}
