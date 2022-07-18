import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MainCalTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void calculator() throws Exception {
		
		Main cal = new Main();
		
		Integer calculator  = cal.calculator(6, '-', 2);
		assertEquals(4, calculator);
		
	}
	
	@Test
	void calculator2() {
		
		Main cal = new Main();
		
		Integer calculator = cal.calculator2("8-2");
		assertEquals(6,calculator);
	}
	
	@Test
	void countWordsTest() {
		Main cal = new Main();
		
		Integer call = cal.countWords("As jau laukiu savaitgalio");
		assertEquals(4,call);
	}
	

}
