package com.ravi.cal.Calculator;

import java.util.Scanner;

public class Calculator {

	private long first;
	private long second;
	
	
	public long getFirst() {
		return first;
	}

	public void setFirst(long first) {
		this.first = first;
	}

	public long getSecond() {
		return second;
	}

	public void setSecond(long second) {
		this.second = second;
	}

	
	public long addFunc(long first,long second)
	{
		return first+second;
	}


	public static void main(String[] args) {
		
		Calculator cc = new Calculator();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  first Value:");
		long first = sc.nextLong();
		cc.setFirst(first);
		
		System.out.println("Enter  second Value:");
		long second = sc.nextLong(); 
		cc.setSecond(second);
		
        System.out.println("The Sum of Two Numbers is:"+cc.addFunc(first, second));		
		
	}

}
