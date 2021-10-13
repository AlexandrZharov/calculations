package com.calculations.service;

import java.math.BigInteger;

public class MultiplicationBigIntegerService implements MultiplicationService<BigInteger> {

	@Override
	public BigInteger calculate(String strA, String strB) {
		BigInteger a = new BigInteger(strA);
		BigInteger b = new BigInteger(strB);		
		return a.multiply(b);
	}

}
