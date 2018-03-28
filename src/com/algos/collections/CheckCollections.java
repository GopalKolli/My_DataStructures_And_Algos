package com.job.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class CheckCollections {

	public static void main(String []args){/*
		List<String> ls = new ArrayList<String>();
		ls.add("Element0");
		ls.add("Element1");
		ls.add("Element0");
		
		for(String s : ls){
			System.out.println(s);
		}
		System.out.println("-----------");
		
		//ls.add(0,"NewElement0");
		//ls.add(1,"NewElement1");
		
		ls.remove("Element0");
		
		for(String s : ls){
			System.out.println(s);
		}
	*/
		//checkTreeSet();
		
		checkMapOperations();
		}
	
	private static void checkMapOperations(){
		MapOperations mo = new MapOperations();
		mo.playAraound2();
	}
	
	/*private static void checkTreeSet(){
		Set<Integer> s = new TreeSet<Integer>();
		s.add(34);
		s.add(678);
		s.add(1);
		s.add(-45);
		
		for(Integer i: s){
			System.out.println(i);
		}
		
	}*/
}
