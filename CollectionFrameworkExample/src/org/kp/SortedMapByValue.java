package org.kp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author kamlu
 *
 */
public class SortedMapByValue {

	public static void main(String[] args) {
		
        Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("Kamlesh", 11);
		map.put("Kaknoj", 33);
		map.put("Sudeep", 33);
		map.put("Rajat", 66);
		
		System.out.println("Unsorted Map"+map);
		
		List<Entry<String,Integer>> al= new ArrayList<Entry<String,Integer>>();
		al.addAll(map.entrySet());
		
		
		System.out.println("Entry Set"+al);
		
		 Collections.sort(al,new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		    });
		    
		HashMap<String ,Integer> sortedMap = new LinkedHashMap<String, Integer>();
		
		System.out.println(al);
		
		for(Entry<String,Integer> entry:al) {
			System.out.println("Key :"+entry.getKey()+" and Value :"+entry.getValue());
			sortedMap.put(entry.getKey(), entry.getValue());
			}
		System.out.println("Sorted Map based on value :"+sortedMap);
	}

}
