package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class PersonTest {
	
	@Test
	public void Person1() {
		Person p = new Person();
		String s = p.name();
		int s2 = p.age();
		assertEquals("Ram",s);
		
		
	}

}
