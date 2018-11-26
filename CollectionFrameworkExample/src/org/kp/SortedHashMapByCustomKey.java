package org.kp;

import java.util.ArrayList;
import java.util.Collections;import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


/**
 * @author kamlu
 *
 */
public class SortedHashMapByCustomKey {
	
	/**
	 * @param agrs
	 */
	public static void main(String []agrs) {
		Map<Employee,String> map = new HashMap<Employee,String>();
		map.put(new Employee(12,"Kamlesh"),"Kamlesh");
		map.put(new Employee(12,"Kaaa"),"Kamlesh");
		map.put(new Employee(14,"Kaaa"),"Kaaa");
		map.put(new Employee(15,"Ankit"),"Ankit");
		
		List<Entry<Employee,String>> al = new ArrayList<Entry<Employee,String>>();
		al.addAll(map.entrySet());
		
		Collections.sort(al,new Comparator<Entry<Employee,String>>() {

			@Override
			public int compare(Entry<Employee, String> o1, Entry<Employee, String> o2) {
				if(o1.getKey().getEid()==o2.getKey().getEid() )
					return o1.getKey().getName().compareTo(o2.getKey().getName());
				else
					return o1.getKey().getEid().compareTo(o2.getKey().getEid());								
			}
		});
	
		System.out.println(al);
		
		HashMap<Employee,String> sortedMap = new LinkedHashMap<Employee,String>();
		for(Entry<Employee,String> entry:al) {
			
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println("Sorted Map :"+sortedMap);

	}

}

class Employee{
	
	Integer eid;
	String name;
	
	public Employee(int i, String name) {
		eid=i;
		this.name=name;		
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	
	
}
