package JUNIT5.VideoJuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSerie {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	
	   public void testEntregar() {
		
		Serie s = new Serie();
	       
		s.entregar();	
		
		boolean resultado = s.isEntregado();
		
		assertTrue(resultado);
		
	   }
	 
	  @Test
	  
	   public void testDevolver() {
		  Serie s = new Serie();
	       
	       s.devolver();
	       
	       boolean resultado = s.isEntregado();
	       
	       assertFalse(resultado);
	   }
	 
}
