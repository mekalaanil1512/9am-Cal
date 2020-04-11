package com.ravi.cal.Calculator;

import java.io.PrintStream;
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

	public long ProdFunc(long first,long second)
	{
		return first*second;
	}

	
	public static void main(String[] args) {
		
		
		Calculator cc = new Calculator();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		PrintStream psObj = new PrintStream(System.out);
		
		
		psObj.println("Enter first Value");
		long first = sc.nextLong();
		cc.setFirst(first);
	
		psObj.println("Enter Second Value");
		long second = sc.nextLong(); 
		cc.setSecond(second);
		
		psObj.println("The Sum of Two Numbers is:"+cc.addFunc(first, second));	
		psObj.println("The Product of Two Numbers is:"+cc.ProdFunc(first, second));	
		
	}

}
