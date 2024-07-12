package com.ram.main;

import com.ram.service.ArithmeticOperation;

public class AppRun 
{
	
public static void main(String[] args) 
{
	System.out.println("AppRun.main()");
	ArithmeticOperation op=new ArithmeticOperation();
	System.out.println(op.sum(20,30));;
}
}
