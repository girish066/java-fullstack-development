package com.simplilearn.map;
import java.util.HashMap;
import java.util.Map;
public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1, "arya");
		map.put(2, "amruth");
		map.put(5, "test");
		map.put(null,null);
		map.put(null, "suresh");
		map.put(8, null);
		
		System.out.println(map);
		System.out.println("get element "+map.get(5));
		map.remove(8);
		System.out.println(map);
		
		//iterate using for loop
		for(Map.Entry m :map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
