package com.pilot.object;

public class Incrementable {
	public static void increment() {
		StaticTest.i++;
	}
	
	public static void main(String[] args){
		StaticTest st1 = new StaticTest();
		st1.i++;
		System.out.println("StaticTest.i 1:" + StaticTest.i);
		System.out.println("st1.i 1:" + StaticTest.i);
		
		StaticTest st2 = new StaticTest();
		st2.i++;
		System.out.println("StaticTest.i 2:" + StaticTest.i);
		System.out.println("st1.i 2:" + st1.i);
		System.out.println("st2.i 2:" + st2.i);
		
		Incrementable.increment();	
		System.out.println("StaticTest.i 3:" + StaticTest.i);
		System.out.println("st1.i 3:" + st1.i);
		System.out.println("st2.i 3:" + st2.i);
		
	}
}
