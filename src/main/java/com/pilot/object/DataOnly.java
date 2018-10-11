package com.pilot.object;

public class DataOnly {
	int i;
	double d;
	boolean b;
	
	int storage(String s) {
		return s.length() * 2;
	}
	
	public static void main(String[] args){
		DataOnly dataOnly = new DataOnly();
		dataOnly.i = 4;
		dataOnly.d = 4.7;
		dataOnly.b = false;
		System.out.println("dataOnly:"+ dataOnly);
		System.out.println("dataOnly.i:"+ dataOnly.i);
		System.out.println("dataOnly.d:"+ dataOnly.d);
		System.out.println("dataOnly.b:"+ dataOnly.b);
		
	}
}
