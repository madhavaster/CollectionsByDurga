package com.madhav.demo2;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class Test {
	public static void main(String args[]) {
		Vector<Integer> v=new Vector();
		for(int i=1;i<=10;i++) {
			v.add(i);
		}
		Enumeration<Integer> elements = v.elements();
		while(elements.hasMoreElements()) {
			Integer nextElement = elements.nextElement();
			System.out.println(nextElement);
			//v.addElement(20); //it goes into infinite loop
		}
		System.out.println("----------------------------------");
		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext()) {
			Integer next = itr.next();
			System.out.println(next);
			if(next==8)
			itr.remove();
			//v.remove(next); // CME
			//v.add(40); //CME
		}
		System.out.println(v);
	}
}