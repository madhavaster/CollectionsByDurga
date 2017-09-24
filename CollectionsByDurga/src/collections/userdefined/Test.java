package collections.userdefined;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String args[]) {
		Student s1 = new Student(1,"madhav",33);
		Student s2 = new Student(2,"swapna",29);
		Student s3 = new Student(3,"hemanth",7);
		Student s4 = new Student(4,"manas",5);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		for(Student student : al) {
			System.out.println(student);
		}
	}
}
