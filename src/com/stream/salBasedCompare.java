package com.stream;

import java.util.Comparator;

public class salBasedCompare implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		return o1.getSal().compareTo(o2.getSal());
	}

	
}
