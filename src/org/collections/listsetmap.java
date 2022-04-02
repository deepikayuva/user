package org.collections;

import java.util.*;
import java.util.Map.Entry;

public class listsetmap {
	/*
public static void main(String[] args) {
	List <Integer> l  = new ArrayList();
l.add(10);
l.add(20);
l.add(30);
l.add(40);
for (int i = 0; i < l.size(); i++) {
	System.out.println(l.get(i));
	
	
}

}*/
/*	
	public static void main(String[] args) {
		Map<Integer,String> m =  new HashMap<Integer,String>();
		m.put(10,"Java");
		m.put(20, "String");
		m.put(40, "Python");
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
			System.out.println(entrySet);

			
		}
	}*/
	
	public static void main(String[] args) {
		Map<Integer,String> m =  new HashMap<Integer,String>();
		m.put(10,"Java");
		m.put(20, "String");
		m.put(40, "Python");
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey());
		}
	}}
