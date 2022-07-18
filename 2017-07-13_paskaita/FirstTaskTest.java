import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstTaskTest {
	
	//static FirstTask task;

	@BeforeEach
 void setUpBeforeClass() throws Exception {
		
		//task = new FirstTask();
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void uzduotisTest() {
		
		FirstTask task = new FirstTask();
		
		
		
		String men = task.uzduotis(8);
		assertEquals("Rugpjutis", men);
		
	}

}
