import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestKlase {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void smallestNumberTest() {
		Metodai metodai = new Metodai();
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,50,11,12,31,53,21,45,69));
		Integer smallestNumber = Metodai.smallestNumber(numbers);
		assertEquals(smallestNumber,10);
	}
	
	@Test 
	void averageTest(){
		Metodai metodai = new Metodai();
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(25,45,65));
		Integer averege = metodai.average(numbers);
		assertEquals(averege, 45);
	}

}
