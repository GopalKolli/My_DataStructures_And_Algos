package com.job.prep.stacksandqueues;

import java.util.*;

public class ThreeStacks {

	int maxsize;
	int[] top;
	int[] arr;
	
	public ThreeStacks(int x){
		maxsize = x;
		arr = new int[3*x];
		top = new int[3];
		top[0] = -1;
		top[1] = maxsize-1;
		top[2] = (maxsize*2)-1;
	}
	
	private Boolean isFull(int x){
		if(top[x-1]==maxsize*(x)-1){
			return true;
		}else{
			return false;
		}
	}
	
	private Boolean isEmpty(int x){
		
		if(top[x-1]==maxsize*(x-1)-1){
			return true;
		}else{
			return false;
		}
		
	}
	
	public void push(int stack, int x){
		if(isFull(stack)){
			throw new NoSuchElementException("OVERFLOWN");
		}else{
			top[stack-1]=top[stack-1]+1;
			arr[top[stack-1]]=x;
		}
	}
	
	public int pop(int stack){
		if(isEmpty(stack)){
			throw new NoSuchElementException("UNDERFLOWN");
		}else{
			int x = arr[top[stack-1]];
			top[stack-1]=top[stack-1]-1;
			return x;
		}
	}
	
	public void printstacks(){
		if(isEmpty(1)){
			System.out.println("FIRST STACK EMPTY");
		}else{
		for(int i=top[0];i>=0;i--){
			System.out.println(arr[i]);
		}
		}
		System.out.println("----------------------------------------------");
		if(isEmpty(2)){
			System.out.println("SECOND STACK EMPTY");
		}else{
		for(int i=top[1];i>=maxsize;i--){
			System.out.println(arr[i]);
		}
		}
		
		System.out.println("----------------------------------------------");
		
		if(isEmpty(3)){
			System.out.println("THIRD STACK EMPTY");
		}else{
		for(int i=top[2];i>=maxsize*2;i--){
			System.out.println(arr[i]);
		}
		}
	}
		
		
}
