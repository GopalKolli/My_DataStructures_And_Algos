package com.job.collections;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashMap;

public class MapOperations {

	public void playAround(){
		Map<String,String> m = new LinkedHashMap<String,String>();
		
		for(int i=0;i<10;i++){
			m.put("Key"+Integer.toString(i),"value"+Integer.toString(i));
		}
		
		String s = m.get("Key4");
		System.out.println(s);
		
		Set<String> keys = m.keySet();
		
		for(String str : keys){
			System.out.println(str);
		}
		
		Collection<String> vals = m.values();
		
		for(String str : vals){
			System.out.println(str);
		}
		
		Set<Map.Entry<String,String>> entrys = m.entrySet();
		
		for (Map.Entry<String,String> ent : entrys){
			System.out.println(ent.getKey());
			System.out.println(ent.getValue());
		}
		
		m.clear();
		System.out.println(m.isEmpty());
	}
	
	public void playAraound2(){
		Map<Integer,Integer> m = new LinkedHashMap<Integer,Integer>();
		m.put(1,1);
		m.put(2,2);
		m.put(3,3);
		for(int i : m.keySet()){
			System.out.println(i);
		}
		m.put(2,4);
		System.out.println("LATER-----------");
		for(int i : m.keySet()){
			System.out.println(i);
		}
	}
	
}
