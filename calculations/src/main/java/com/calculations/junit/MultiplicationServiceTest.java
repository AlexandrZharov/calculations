package com.calculations.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.calculations.service.MultiplicationBigIntegerService;
import com.calculations.service.MultiplicationFromScratchService;
import com.calculations.service.MultiplicationService;

class MultiplicationServiceTest {
	
	@SuppressWarnings("rawtypes")
	MultiplicationService service1, service2;
	String num1, num2;

	@BeforeEach                                         
	void setUp() {
		service1 = new MultiplicationBigIntegerService();
		service2 = new MultiplicationFromScratchService();
		num1 = "12345678901234567890";
		num2 = "11111111111111111111";
	}

	@Test
	@DisplayName("Simple multiplication using both services - should work")
	void testMultiply() {
		String result1 = service1.calculate(num1, num2).toString();
		String result2 = service2.calculate(num1, num2).toString();
		assertEquals(result1, result2);
	}

	@Test
	@DisplayName("Simple multiplication using BigIntegerService - should work")
	void testMultiplyBigIntegerService() {
		String result1 = service1.calculate(num1, num2).toString();
		String result2 = service2.calculate(num1, num2).toString();
		assertEquals(result1, result2);
	}

	@Test
	@DisplayName("Simple multiplication using FromScratchService - should work")
	void testMultiplyFromScratchService() {
		String result1 = service1.calculate(num1, num2).toString();
		String result2 = service2.calculate(num1, num2).toString();
		assertEquals(result1, result2);
	}

}
