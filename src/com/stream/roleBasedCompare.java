package com.stream;

import java.util.Comparator;

public class roleBasedCompare implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		return o1.getRole().compareTo(o2.getRole());
	}

}
