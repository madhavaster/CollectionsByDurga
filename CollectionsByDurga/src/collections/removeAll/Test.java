package collections.removeAll;

import java.util.ArrayList;

public class Test {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("madhava");
		al.add("swapna");
		al.add("hemanth");
		al.add("manas");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("swapna");
		al2.add("hemanth");
		al2.add("lakshmi");
		
		al.removeAll(al2);
		
		for(String s: al) {
			System.out.println(s);;;;;;
		}
		System.out.println("for al2");
		for(String s: al2) {
			System.out.println(s);;;;;;
		}
	}
}
