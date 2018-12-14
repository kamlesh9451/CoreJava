package org.kp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountTheOccuranceOfeachChrInString {

	public static void main(String[] args) {

		String str ="abcdabcdjrfhghjjjjjjjjjjjj";
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		Set<Character> keySet = null;
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char ch :charArray) {
			keySet = map.keySet();
			if(keySet.contains(ch)) {
				map.put(ch, (map.get(ch)+1));
			}
			else 
			{
				map.put(ch,1);
			}
			
		}
		
		System.out.println(map);		
	}

}
