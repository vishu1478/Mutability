package com.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
  public static void main(String[] args) throws IOException {
	System.out.println("Enter a number");
	/*Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();*/
	
	InputStreamReader isr= new InputStreamReader(System.in);
	BufferedReader br =new BufferedReader(isr);
	String s=br.readLine();
	int a=Integer.parseInt(s);
	System.out.println("Output is: "+2*a);
}
}
