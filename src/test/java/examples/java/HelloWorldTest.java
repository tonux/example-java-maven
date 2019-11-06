package examples.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private HelloWorld subject;

	@Before
	public void setup() {
		subject = new HelloWorld();
	}
	
	@Test
	public void testGetMessage() {
		assertEquals("Hello World!", subject.getMessage(false));
	}

	@Test
	public void testGetMessage2() {
		assertEquals("Hello Master SIR!", subject.getMessage(true));
	}

	@Test
	public void testSum(){
		assertEquals(4, subject.sum(2,2));
	}
	
}
