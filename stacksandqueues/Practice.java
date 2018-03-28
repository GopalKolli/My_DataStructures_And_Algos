package com.job.prep.stacksandqueues;

import java.util.ArrayList;
import java.util.List;

public class Practice {
	
	public void fibbonacci(int length){
		int first=0,second=1,l=2;
		int[] series = new int[length];
		series[0]=first;
		series[1]=second;
		
		while(l<length){
			int current = first+second;
			series[l]=current;
			first=second;
			second=current;
			l++;
		}
		
		for(int i=0;i<series.length;i++){
			System.out.println(series[i]);
		}
	}
	
	public int largestpalindrome(int x,int y){
		int num = x*y;
		int palindrome=-1;
		String s = Integer.toString(num);
		
		for(int pallength = 2; pallength<=s.length();pallength++){
			for(int i=0;i<=s.length()-pallength;i++){
				String currentstring = s.substring(i, i+pallength);
				if(isPalindrome(currentstring)){
					if(Integer.valueOf(currentstring)>palindrome){
						palindrome = Integer.valueOf(currentstring);
					}
				}
			}
		}
		return palindrome;
	}
	
	public boolean isPalindrome(String s){
		String first="";
		String second="";
		if(s.length()%2==0){
			first = s.substring(0,s.length()/2);
			second = new StringBuilder(s.substring(s.length()/2,s.length())).reverse().toString();
			return first.equals(second);
		}else{
			first = s.substring(0,s.length()/2);
			second = new StringBuilder(s.substring(s.length()/2+1,s.length())).reverse().toString();
			return first.equals(second);
		}
	}
	
	public int sumPairs(int[] arr, int num){
		List<Integer> wanted = new ArrayList<Integer>();
		int pairs=0;
		for(int i=0;i<arr.length;i++){
			if(wanted.contains(arr[i])){
				wanted.remove(wanted.indexOf(arr[i]));
				pairs++;
				continue;
			}else{
				wanted.add(num-arr[i]);
			}
		}
		return pairs;
	}

}
