import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PicaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	
	
	
	@Test
	void skaiciuotiKainaTest() {
		
		Pica pica = new Pica(Dydziai.DIDELIS, 2, 2);
		Pica pica1 = new Pica(Dydziai.MAZAS, 1, 1);
		
		Integer kaina = pica1.skaiciuotiKaina();
		assertEquals(15, kaina);
	}
	
	@Test 
	void skaiciuotiUzsakymoSumaTest() throws Exception {
		ArrayList<Pica> picos = new ArrayList<>();
		Uzsakymas uzs = new Uzsakymas("String", picos);
		Pica pica = new Pica(Dydziai.DIDELIS, 2, 2);
		Pica pica1 = new Pica(Dydziai.MAZAS, 1, 1);
		
		
		picos.add(pica);
		picos.add(pica1);
		
		Integer suma = uzs.skaiciuotiUzsakymoSuma();
		assertEquals(37, suma);
	}
	
	@Test
	void testUzsakymasTuscias() {
		Uzsakymas uzsk = new Uzsakymas("NR1", new ArrayList<>());
		assertThrows(
				NullPointerException.class, () -> uzsk.skaiciuotiUzsakymoSuma());
		
	}
	
	

}
