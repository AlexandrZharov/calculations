package com.calculations.main;

import com.calculations.service.MultiplicationBigIntegerService;
import com.calculations.service.MultiplicationFromScratchService;
import com.calculations.service.MultiplicationService;

public class Main {

	
	public static void main(String[] args) {
		System.out.println("Hello");
		MultiplicationService<?> multService = getService(args[0]);
		String result = multService.calculate(args[1], args[2]).toString();
		System.out.println(result);
		System.out.print("Is this correct? - " + "137174210013717420998628257899862825790".equals(result));
	}

	static MultiplicationService<?> getService(String condition) {
		if(condition.equals("1")) {
			System.out.println("Using BigIntegerService");
			return new MultiplicationBigIntegerService();
		} else {
			System.out.println("Using FromScratchService");
			return new MultiplicationFromScratchService();
		}
	}
}
