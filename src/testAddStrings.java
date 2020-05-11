import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		JUnitTesting junit = new JUnitTesting();
		String result = junit.addString("Tejas", "Amle");
		assertEquals ("TejasAmle", result);
	}

}
