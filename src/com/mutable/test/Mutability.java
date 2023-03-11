package com.mutable.test;

final public class Mutability {
 final String name;
 final Age age;
public Mutability(String name, Age age) {
	this.name = name;
	//this.age = new Age(age.getYear());
	this.age = age;       
}
public String getName() {
	return name;
}
public Age getAge() {
	return new Age(this.age.getYear());
}

 
}
  