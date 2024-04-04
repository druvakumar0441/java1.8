package com.stream;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter property");
		String s =sc.next();
		Comparator<student> ob=null;
		if(s.equals("name")) {
			ob= new nameBasedCompare();
		}else if(s.equals("sal")) {
		ob = new salBasedCompare();	
		}
		else if(s.equals("role")) {
			ob= new roleBasedCompare();
		}
		TreeSet<student> sl = new TreeSet<student>(ob);
		sl.add(new student(1,  "druva", "manager", 1223.4));	
		sl.add(new student(2,  "sai", "se", 4343.4));	
		sl.add(new student(3,  "venu", "sse", 6565.4));	
		sl.add(new student(4,  "hari", "se", 7575.4));	
		sl.add(new student(5,  "druva", "test", 2323.4));	
		sl.add(new student(6,  "naveen", "test", 1243.4));	
		
	for (student student : sl) {
		System.out.println(student);
	}
		
	}

}
