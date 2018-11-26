package org.kp;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedHasMapByKey {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("Kamlesh", 11);
		map.put("Kaknoj", 33);
		map.put("Sudeep", 33);
		map.put("Rajat", 66);
		
		System.out.println("Unsorted Map"+map);
		
		Map<String,Integer> sortedTreeMap = new TreeMap<String,Integer>();
		sortedTreeMap.putAll(map);
		
		Map<String,Integer> sortedMap = new HashMap<String,Integer>();
		sortedMap.putAll(sortedTreeMap);
		
		System.out.println("Sorted Map"+sortedMap);
	}

}
