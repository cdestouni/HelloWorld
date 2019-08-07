package com.test.helloworld.Tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.test.helloworld.controller.Multiplier;

public class UnitTest {
	
	@Test
	public void calculationTest() {
		Multiplier tester = new Multiplier();
		assertEquals(4, tester.multiply(2, 2));
	}

}
