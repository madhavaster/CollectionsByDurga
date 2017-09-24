package collections.addAll;

import java.util.ArrayList;

public class Test {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("madhava");
		al.add("swapna");
		al.add("hemanth");
		al.add("manas");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("srinu");
		al2.add("rani");
		
		al.addAll(al2);
		
		for(String s: al) {
			System.out.println(s);;;;;;
		}
	}
}
