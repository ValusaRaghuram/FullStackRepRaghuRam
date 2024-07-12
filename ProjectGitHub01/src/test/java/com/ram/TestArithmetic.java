package com.ram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ram.service.ArithmeticOperation;

public class TestArithmetic 
{
	@Test
public void testSum()
{
	ArithmeticOperation a=new ArithmeticOperation();
	int actual=a.sum(100, 10);
	int expected=110;
	assertEquals(expected,actual);
}
}
