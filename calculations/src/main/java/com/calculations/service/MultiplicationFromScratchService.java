package com.calculations.service;

public class MultiplicationFromScratchService implements MultiplicationService<String> {

	@Override
	public String calculate(String strA, String strB) {
		String beforeResult = "";
		// Getting result sign
		if ((strA.charAt(0) == '-' || strA.charAt(0) == '-') &&
		    (strA.charAt(0) != '-' || strA.charAt(0) != '-'))
			beforeResult = "-";
		String s1 = new StringBuffer(strA).reverse().toString();
		String s2 = new StringBuffer(strB).reverse().toString();
		
		int[] m = new int[s1.length() + s2.length()];
		
		// Go from right to left in strA
		for (int i = 0; i < s1.length(); i++) {
			// Go from right to left in strB
			for (int j = 0; j < s2.length(); j++) {
				m[i + j] = m[i + j]
						+ (s1.charAt(i) - '0')
						* (s2.charAt(j) - '0');
			}
		}

		String result = new String();
		
		for (int i = 0; i < m.length; i++) {
			int digit = m[i] % 10;
            int carry = m[i] / 10;
            if (i + 1 < m.length) {
            	m[i + 1] = m[i + 1] + carry;
            }
            result = digit + result;
		}
		
		// ignore '0's from the right
		while (result.length() > 1 && result.charAt(0) == '0') {
			result = result.substring(1);
        }

		return beforeResult + result;
	}

}
