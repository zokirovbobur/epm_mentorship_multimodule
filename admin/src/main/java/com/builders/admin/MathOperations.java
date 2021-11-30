package com.builders.admin;

import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MathOperations {
	private final static Logger logger = Logger.getLogger("MathOperations");

	public static BigInteger addLargeNumbers(BigInteger a, BigInteger b){
		logger.log(Level.INFO, "addLargeNumbers( " + a + " , " + b + " )");
		BigInteger result = a.add(b);
		logger.log(Level.INFO, "addLargeNumbers( " + a + " , " + b + " ) = " + result);
		return result;
	}
}
