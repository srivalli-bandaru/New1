package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class InstrumentTest {

	@Test
	public void StringInstrument1() {
		StringInstrument s = new StringInstrument() ;
		String s1 = s.play();
		assertEquals("1234",s1);
		
		
		
		
	}
}
