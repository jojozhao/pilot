package com.pilot.basic;

import java.util.Random;

public class CtrlLanguage {
	
	static boolean condition(){
		double r =  Math.random() ;
		boolean result = r < 0.99;
		float f = (float) r;
		int i = (int) f;
		
		System.out.print(result + ", " +  r + ", " + f + ", "+ i + ", " + Math.round(f) + ",");
		return result;
	}
	
	public static void main(String[] args){		
		int i = 10;
		String x ="a";
		
		if(i<15){
			i=18;
			x="b";
		}else if(i<25){
			i=28;
			x="c";
		}else{
			i=38;
			x="d";
		}
		
		System.out.println("i: "+i);
		System.out.println("x: "+x);
		
		while(condition()){
			System.out.println("inside 'while");
		}
		System.out.println("Exited 'while");
		
		Random rand = new Random(47);
		
		System.out.println("rand:" + rand.nextLong());
		
	}	

}
