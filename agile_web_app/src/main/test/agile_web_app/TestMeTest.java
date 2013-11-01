package agile_web_app;

import static org.junit.Assert.*;

import org.agile_web_app.TestMe;
import org.junit.Test;

public class TestMeTest {

	@Test
	public void test() {
		TestMe test = new TestMe();
		assertTrue("is it true", test.TestMeBool());
		
		assertEquals(" testmeint must return 1", 1, test.TestMeInt());
	}

}
