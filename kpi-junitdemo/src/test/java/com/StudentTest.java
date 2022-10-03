package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Test;
public class StudentTest {

	@Test
		public void Teacher1() {
		Teacher T = new Teacher();
		String s = T.name();
		int s2 = T.age();
		assertEquals("Mark",s);
		assertEquals(2,s2);
	}
}
