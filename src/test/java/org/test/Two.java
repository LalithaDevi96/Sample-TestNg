package org.test;

import org.testng.annotations.Test;

public class Two {
	
	@Test
	private void C1() {
		System.out.println("A");
	}
	
	@Test
	public void B2() {
		System.out.println("B");
	}
	
	@Test
	public void A3() {
		System.out.println("C");
	}
	
}