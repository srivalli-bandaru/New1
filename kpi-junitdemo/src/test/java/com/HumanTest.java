package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class HumanTest {

	@Test
	public void Son() {
		Son s = new Son();
		String s1 = s.Work();
		String s3 = s.Dance();
		assertEquals("Work",s1);
		assertEquals("Dance",s3);
	}
}
