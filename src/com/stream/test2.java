package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.slokam1.calc;

public class test2 {
	public static void main44(String[] args) {
		employee e1 = new employee(4,  "druva", "sse", 1223.4);
		employee e2 = new employee(5,  "sai", "se", 4343.4);
		employee e3 = new employee(3,  "venu", "sse", 6565.4);
		employee e4 = new employee(2,  "hari", "dev", 7575.4);
		employee e5 = new employee(1,  "druva", "se", 2323.4);
		employee e6 = new employee(1,  "druva", "se", 2323.4);
		employee e7 = new employee(2,  "hari", "dev", 7575.4);
		employee e8 = new employee(1,  "druva", "se", 2323.4);
		employee e9 = new employee(3,  "venu", "sse", 6565.4);
		
		String[] s = {"druva", "sai","venu", "hari","druva", "sai","venu", "hari"};
		List<String> l=Stream.of(s).distinct().collect((Collectors.toList()));
		System.out.println(l);
		} 
	public static void main43(String[] args) {
		employee e1 = new employee(4,  "druva", "sse", 1223.4);
		employee e2 = new employee(5,  "sai", "se", 4343.4);
		employee e3 = new employee(3,  "venu", "sse", 6565.4);
		employee e4 = new employee(2,  "hari", "dev", 7575.4);
		employee e5 = new employee(1,  "druva", "se", 2323.4);
		employee e6 = new employee(1,  "druva", "se", 2323.4);
		employee e7 = new employee(2,  "hari", "dev", 7575.4);
		employee e8 = new employee(1,  "druva", "se", 2323.4);
		employee e9 = new employee(3,  "venu", "sse", 6565.4);
		
		List<employee> e = Arrays.asList(e1, e2, e3, e4,e5,e6,e7,e8,e9);
		Long c=e.stream().filter((x)->{
			if(x.getSal()>=2000)
				return true;
			else 
				return false;
		}).skip(2).limit(7).map((x)->{
			return x.getId();
		}).count();
		System.out.println(c);
	} 
	public static void main09(String[] args) {
		employee e1 = new employee(4,  "druva", "sse", 1223.4);
		employee e2 = new employee(5,  "sai", "se", 4343.4);
		employee e3 = new employee(3,  "venu", "sse", 6565.4);
		employee e4 = new employee(2,  "hari", "dev", 7575.4);
		employee e5 = new employee(1,  "druva", "se", 2323.4);
		employee e6 = new employee(1,  "druva", "se", 2323.4);
		employee e7 = new employee(2,  "hari", "dev", 7575.4);
		employee e8 = new employee(1,  "druva", "se", 2323.4);
		employee e9 = new employee(3,  "venu", "sse", 6565.4);
		
		List<employee> e = Arrays.asList(e1, e2, e3, e4,e5,e6,e7,e8,e9);
		e.stream().filter((x)->{
			if(x.getSal()>=2000)
				return true;
			else 
				return false;
		}).skip(2).limit(7).map((x)->{
			return x.getId();
		}).forEach((x)->{
			System.out.println(x);
		});
		
	} 
	public static void main6(String[] args) {
		employee e1 = new employee(4,  "druva", "sse", 1223.4);
		employee e2 = new employee(5,  "sai", "se", 4343.4);
		employee e3 = new employee(3,  "venu", "sse", 6565.4);
		employee e4 = new employee(2,  "hari", "dev", 7575.4);
		employee e5 = new employee(1,  "druva", "se", 2323.4);
		employee e6 = new employee(1,  "druva", "se", 2323.4);
		employee e7 = new employee(2,  "hari", "dev", 7575.4);
		employee e8 = new employee(1,  "druva", "se", 2323.4);
		employee e9 = new employee(3,  "venu", "sse", 6565.4);
		
		List<employee> e = Arrays.asList(e1, e2, e3, e4,e5,e6,e7,e8,e9);
		e.stream().filter((x)->{
			if(x.getSal()>=5000)
				return true;
			else 
				return false;
		}).map((x)->{
			return x.getId();
		}).distinct().forEach((x)->{
			System.out.println(x);
		});

	} 
	public static void main12(String[] args) {
		employee e1 = new employee(4,  "druva", "sse", 1223.4);
		employee e2 = new employee(5,  "sai", "se", 4343.4);
		employee e3 = new employee(3,  "venu", "sse", 6565.4);
		employee e4 = new employee(2,  "hari", "dev", 7575.4);
		employee e5 = new employee(1,  "druva", "se", 2323.4);
		employee e6 = new employee(1,  "druva", "se", 2323.4);
		employee e7 = new employee(2,  "hari", "dev", 7575.4);
		employee e8 = new employee(1,  "druva", "se", 2323.4);
		employee e9 = new employee(3,  "venu", "sse", 6565.4);
		
		List<employee> e = Arrays.asList(e1, e2, e3, e4,e5,e6,e7,e8,e9);
		e.stream().filter((x)->{
			if(x.getRole().equals("se"))
				return true;
			else 
				return false;
		}).map((x)->{
			return x.getName();
		}).distinct().forEach((x)->{
			System.out.println(x);
		});

	} 
	public static void main(String[] args) {
		employee e1 = new employee(4,  "druva", "sse", 1223.4);
		employee e2 = new employee(5,  "sai", "se", 4343.4);
		employee e3 = new employee(3,  "venu", "sse", 6565.4);
		employee e4 = new employee(2,  "hari", "dev", 7575.4);
		employee e5 = new employee(1,  "druva", "se", 2323.4);
		employee e6 = new employee(1,  "druva", "se", 2323.4);
		
		List<employee> e = Arrays.asList(e1, e2, e3, e4,e5,e6);
		e.stream().distinct().sorted((x,y)->{
			return -x.getSal().compareTo(y.getSal());
		}).forEach((x)->{
			System.out.println(x);
		});

	} 
	public static void main4(String[] args) {
		employee e1 = new employee(1,  "druva", "sse", 1223.4);
		employee e2 = new employee(2,  "sai", "se", 4343.4);
		employee e3 = new employee(3,  "venu", "sse", 6565.4);
		employee e4 = new employee(4,  "hari", "dev", 7575.4);
		employee e5 = new employee(5,  "druva", "se", 2323.4);
		employee e6 = new employee(5,  "druva", "se", 2323.4);
		
		List<employee> e = Arrays.asList(e1, e2, e3, e4,e5,e6);
		e.stream().distinct().forEach((x)->{
			System.out.println(x);
		});

	}
public static void main3(String[] args) {
	employee e1 = new employee(1,  "druva", "sse", 1223.4);
	employee e2 = new employee(2,  "sai", "se", 4343.4);
	employee e3 = new employee(3,  "venu", "sse", 6565.4);
	employee e4 = new employee(4,  "hari", "dev", 7575.4);
	employee e5 = new employee(5,  "druva", "se", 2323.4);
	
	List<employee> e = Arrays.asList(e1, e2, e3, e4,e5);
	e.stream().map((x)->{
		return x.getSal()+1000;
	}).forEach((x)->{
		System.out.println(x);
	});;

}
	public static void main2(String[] args) {
		employee e1 = new employee(1,  "druva", "sse", 1223.4);
		employee e2 = new employee(2,  "sai", "se", 4343.4);
		employee e3 = new employee(3,  "venu", "sse", 6565.4);
		employee e4 = new employee(4,  "hari", "dev", 7575.4);
		employee e5 = new employee(5,  "druva", "se", 2323.4);
		
		List<employee> e = Arrays.asList(e1, e2, e3, e4,e5);
		e.stream().filter((x)->{
			if(x.getRole().equals("se"))
				return true;
			else
				return false;
		})
		.forEach((x)->{
			System.out.println(x);
		});
	}
	public static void main1(String[] args) {
		employee e1 = new employee(1,  "druva", "sse", 1223.4);
		employee e2 = new employee(2,  "sai", "se", 4343.4);
		employee e3 = new employee(3,  "venu", "sse", 6565.4);
		employee e4 = new employee(4,  "hari", "dev", 7575.4);
		employee e5 = new employee(5,  "druva", "se", 2323.4);
		
		List<employee> e = Arrays.asList(e1, e2, e3, e4,e5);
		e.stream().forEach((x)->{
			System.out.println(x);
		});
	}
}
