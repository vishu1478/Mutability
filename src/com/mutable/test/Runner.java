package com.mutable.test;

public class Runner {

	public static void main(String[] args) {
		String n="Visu";
		Mutability m =new Mutability(n, new Age(20)) ;
		System.out.println(m.name+" "+m.getAge().getYear());
		m.getAge().setYear(65);
		System.out.println(m.name+" "+m.getAge().getYear());
	}

}
