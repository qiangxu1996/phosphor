package edu.columbia.cs.psl.test.phosphor;

import static org.junit.Assert.*;

import org.junit.Test;

public class LambdaObjTagITCase {
	@Test
	public void testEmptyLambda() throws Exception {
		Runnable r = () -> {
		};
	}
}
