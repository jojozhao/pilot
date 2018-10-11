package com.pilot.basic;

public class OverflowTest {
	
	public static void main(String[] args){
		System.out.print("test");
		int big = Integer.MAX_VALUE;
		System.out.println("big = " + big);
		int bigger = big * 4;
		System.out.println("bigger = " +  bigger);
	}
}
