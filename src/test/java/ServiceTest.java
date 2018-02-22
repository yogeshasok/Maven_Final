import static org.junit.Assert.*;

import org.junit.Test;


public class ServiceTest {

	@Test
	public void testValidate() {
		assertEquals("SUCCESS", new Service().validate("yogesh", "1234"));
	}

}
