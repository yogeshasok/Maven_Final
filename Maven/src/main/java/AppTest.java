import static org.junit.Assert.*;

import org.junit.Test;


public class AppTest {

	@Test
	public void test() {
		Service ser = new Service();
		assertTrue("SUCCESS".equals(ser.validate("yogesh", "1234")));
		
	}
	
	

}
