package com.pilot.basic;

public class InitialConstructure {
	public String initStr;
	public int initInteger;
	
	public String initStrValue = "Test init String";
	InitialConstructure(){
		System.out.println("initStrValue in constructure:"+initStrValue);
		initStr = "Test init String in Constructure";
		initStrValue = "Test init String value in Constructure";
		
	}
	
	public static void main(String[] args){
		InitialConstructure obj =  new InitialConstructure();
		System.out.println("initStr:"+obj.initStr);
		System.out.println("initInteger:"+obj.initInteger);
		System.out.println("initStrValue:"+obj.initStrValue);
	}
}
