package org.kp.multithreading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {

	public static void main(String[] args) {
		List al = new ArrayList();
		
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		
		Iterator it = al.iterator();
	    if(it.hasNext())
	    {
	    	al.remove(1);
	    }

		

	}

}
