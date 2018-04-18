package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(testngListeners.TestngListeners.class)
public class Assertions {
	public static SoftAssert assrt = new SoftAssert();
	@Test
	public static void testassertions(){
		assrt.assertEquals("B", "A");
		
		assrt.assertEquals("A", "A");
		System.out.println("Execution Completed");
		assrt.assertAll();
	}

}
