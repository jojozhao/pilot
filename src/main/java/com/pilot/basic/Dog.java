package com.pilot.basic;

public class Dog {
	void bark(String dogName){
		System.out.println(dogName + " is barking");
	}
	void bark(boolean danger){
		if(danger){
			System.out.println("howling");
		}else{
			System.out.println("quite");
		}
	}
	
	void bark(String dogName,boolean danger){
		if(danger){
			System.out.println(dogName + " is howling");
		}else{
			System.out.println(dogName + " is quite");
		}
	}
	void bark(boolean danger,String dogName){
		if(danger){
			System.out.println(dogName + " is howling");
		}else{
			System.out.println(dogName + " is quite");
		}
	}
	public static void main(String[] args){
		Dog d = new Dog();
		d.bark("good dog");
		d.bark(true);
		d.bark("good dog", true);
		d.bark(false, "good dog");
	}
}
