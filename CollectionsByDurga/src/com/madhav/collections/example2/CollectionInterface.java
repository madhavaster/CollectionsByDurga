package com.madhav.collections.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Iterator;
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
	}
}
