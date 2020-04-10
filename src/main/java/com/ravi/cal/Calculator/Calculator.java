package com.ravi.cal.Calculator;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Calculator {
	
	static Logger log = LogManager.getLogger(Calculator.class);

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
		//@SuppressWarnings("resource")
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		log.debug("Enter first Value");
		//System.out.println("Enter  first Value:");
		long first = sc.nextLong();
		cc.setFirst(first);
	
		log.debug("Enter Second Value");
//		System.out.println("Enter  second Value:");
		long second = sc.nextLong(); 
		cc.setSecond(second);
		
        log.debug("The Sum of Two Numbers is:"+cc.addFunc(first, second));
		// System.out.println("The Sum of Two Numbers is:"+cc.addFunc(first, second));		
		
	}

}
