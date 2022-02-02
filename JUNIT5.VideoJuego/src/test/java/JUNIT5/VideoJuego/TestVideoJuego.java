package JUNIT5.VideoJuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestVideoJuego {

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
		
		Videojuego v = new Videojuego();
	       
		v.entregar();	
		
		boolean resultado = v.isEntregado();
		
		assertTrue(resultado);
		
	   }
	 
	  @Test
	  
	   public void testDevolver() {
	       Videojuego v = new Videojuego();
	       
	       v.devolver();
	       
	       boolean resultado = v.isEntregado();
	       
	       assertFalse(resultado);
	   }
	 
	 
	 
	   
}
