import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testLeft() {
		assertEquals (0,3);
		fail("ERRO!!");
	}

	@Test
	void testRight() {
		assertEquals (3,0);
		fail("ERRO!!");
	}

}
