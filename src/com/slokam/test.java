package com.slokam;

public class test {

	public static void main(String[] args) {
		shiva s = new A();
		s.m1();
		System.out.println(s);
		System.out.println("===============================");
		slokam s1 =new slokam() {
			
			@Override
			public void m1() {
				System.out.println("slokam m1 from unknown class");
				
			}
			public void m2() {
				System.out.println("slokam m1 from unknown class");
				
			}
		};s1.m1();	System.out.println(s1);
		System.out.println("===============================");
		shiva s3 = new shiva() {
			@Override
			public void m1() {
				System.out.println("shiav m1 from unknown class");
				super.m1();
				
			}
			public void m2() {
				System.out.println("slokam m1 from unknown class");
				
			}
		};s3.m1();
		System.out.println(s3);
		System.out.println("===============================");
	}
}
