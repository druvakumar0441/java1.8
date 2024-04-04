package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class test1 {
	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(1000);	i.add(2);	i.add(3);	i.add(4);	i.add(5);	i.add(7);	
		i.add(9);	i.add(53);	i.add(74);	i.add(60);	i.add(44);	i.add(61);
		i.stream().sorted().forEach((x)->{
			System.out.println(x);
		});

	}

	public static void main1(String[] args) {
	
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(1);	i.add(2);	i.add(3);	i.add(4);	i.add(5);	i.add(7);	
		i.add(9);	i.add(53);	i.add(74);	i.add(60);	i.add(44);	i.add(61);
		
		i.stream().filter((x)->{
			if(x%2==0) {
				return false;
			}else
				return true;
		}).map((x)->{
			return x*x;
		})
		.forEach((x)->{
			System.out.println(x);
		});

	}
	public static void main2(String[] args) {
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(111);	i.add(232);	i.add(33);	i.add(44);	i.add(53);	i.add(75);	
		i.add(49);	i.add(53);	i.add(74);	i.add(60);	i.add(44);	i.add(651);
		
		Optional<Integer> o=	i.stream().filter((x)->{
			if(x%2==0)
				return false;
			else return true;
		}).reduce((x,y)->{
		
			if(x<y)
				return x;
			else
				return y;
		});System.out.println(o.get());
	}

}
