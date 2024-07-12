package com.ram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ram.service.ArithmeticOperation;

public class TestArithmetic 
{
	@Test
	public void testSumWithPositives()
	{
		
		System.out.println("TestArithmetic(begin)");
		
		ArithmeticOperation a=new ArithmeticOperation();
		int actual=a.sum(100, 10);
		int expected=110;
		assertEquals(expected,actual);
	}
	@Test
	public void testSumWithNegatives()
	{
		ArithmeticOperation a=new ArithmeticOperation();
		int actual=a.sum(-234,-210);
		int expected=-444;
		assertEquals(expected,actual);
	}
	@Test
	public void testSumWithZero()
	{
		ArithmeticOperation a=new ArithmeticOperation();
		int actual=a.sum(0, 0);
		int expected=0;
		assertEquals(expected,actual);
	}
}
