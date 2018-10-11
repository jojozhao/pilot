package com.pilot.basic;

public class StringCompare {
	public static void compareString(String strA, String strB){
		StringCompare sc =  new StringCompare();
		sc.testStaticCall(strA, strB);
		System.out.println("A == B  :"+ (strA == strB));
		System.out.println("A != B  :"+ (strA != strB));
		System.out.println("A + B  :"+ (strA + strB));
	//!	System.out.println("A - B  :"+ (strA - strB));
	//!	System.out.println("A * B  :"+ (strA * strB));
	//!	System.out.println("A / B  :"+ (strA / strB));
	//!	System.out.println("A % B  :"+ (strA % strB));	
	//!	System.out.println("A > B  :"+ (strA > strB));
	//!	System.out.println("A < B  :"+ (strA < strB));
	//!	System.out.println("A >= B  :"+ (strA >= strB));
	//!	System.out.println("A <= B  :"+ (strA <= strB));
	//!	System.out.println("A & B  :"+ (strA & strB));
	//!	System.out.println("A | B  :"+ (strA | strB));
	//!	System.out.println("A && B  :"+ (strA && strB));
	//!	System.out.println("A || B  :"+ (strA || strB));
	//!	System.out.println("!A :"+ (!strA));
		
	}
	
	public void testStaticCall(String strA, String strB){
		System.out.println("A:"+ strA);
		System.out.println("B:"+ strB);
		
	}
	public static void main(String[] args){		
		StringCompare.compareString("a", "b");
	}

}
