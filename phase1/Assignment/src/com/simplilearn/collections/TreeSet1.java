package com.simplilearn.collections;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSet1 {

	public static void main(String[] args) {
		
		//ref variable
		Set<String> set=new TreeSet<String>();
		
		set.add("apple");
		set.add("banana");
		//set.add(null);// null not allowed in TreeSet
		set.add("banana");
		set.add("cherry");
		set.add("almond");
		
		System.out.println("Size: "+set.size());
		System.out.println(set);
		
		System.out.println("Contains "+set.contains("cherry"));
		
		System.out.println(set);
		
		//foreach loop
		for(String s:set)
		{
			System.out.println(s);
		}
		
		//iterate using iterator	
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		
	}
}
