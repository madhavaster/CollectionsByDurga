package com.madhav.collections.example2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
public class CollectionInterface {

	public static void main(String args[]) {
	List al = new ArrayList();
	al.add("madhava");
	al.add(123);
	al.add(new Date());
	System.out.println(al);
	Iterator itr =al.iterator();
	while(itr.hasNext()) {
		Object obj = itr.next();
		String name=obj.getClass().getName();
		System.out.println(obj);
		System.out.println(name);
	}
	// Iterating Collection through for-each loop
	ArrayList<String> al1 = new ArrayList<String>();
	al1.add("madhava");
	al1.add("reddy");
	al1.add("madhava");
	for(String str: al1) {
		System.out.println(str);
	}
	Collection c = new ArrayList();
	c.add("reddy");
	Iterator itr1 =c.iterator();
	while(itr1.hasNext()) {
		String s =	(String) itr1.next();
		System.out.println(s);
	}
	}
}
