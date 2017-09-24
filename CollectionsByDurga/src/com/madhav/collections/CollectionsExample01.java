package com.madhav.collections;

import java.util.Date;

import org.omg.CORBA.ShortSeqHelper;

import com.madhav.collections.beans.Student;

public class CollectionsExample01{
	public static void main(String args[]) {
		Student student1 = new Student(1,"madhava reddy",new Date("31-AUG-1984"));
		Student student2 = new Student(2,"swapna",new Date("08-JUN-1989"));
		Student[] arrStudent=new Student[10];
		arrStudent[0]=student1;
		arrStudent[1]=student2;
		for(Student student : arrStudent) {
			if(student !=null)
			System.out.println(student);
		}
	}
}