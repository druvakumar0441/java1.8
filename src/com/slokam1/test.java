package com.slokam1;

public class test {

	public static void main(String[] args) {
		calc c = new calc();
		
		I1 i = c::add;
		i.add(2, 3);
		
		I2 k = c::mul;
		int j=k.mul(2, 3);
		System.out.println(j);
		 //============================= for static methods 
		calc2 c1 = new calc2();
		
		I1 i1 = calc2::add;
		i.add(2, 3);
		
		I2 k1 = calc2::mul;
		int j1=k1.mul(2, 3);
		System.out.println(j);
		 //============for different name methods argumets and return type sould be same
		
		calc3 c2 = new calc3();
		
		I1 i2 = c2::addddd;
		i.add(2, 3);
		
		I2 k2 = c2::mulllll;
		int j2=k2.mul(2, 3);
		System.out.println(j);
		
	}
}
