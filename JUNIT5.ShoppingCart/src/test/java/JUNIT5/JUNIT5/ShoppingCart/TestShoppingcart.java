package JUNIT5.JUNIT5.ShoppingCart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestShoppingcart {

	private static ShoppingCart s;
	private static Product p;
	
	@BeforeAll
	static void init() {
		ShoppingCart s = new ShoppingCart();
		Product p = new Product("chicle",1.5);
		
	}

	@AfterAll
	static void finish() {
		s = null;
	}

	
	@Test
	void testShoppingCart(){

		int esperado=0;
		int resultado = s.getItemCount();
		
	
		assertEquals(esperado, resultado);
	}

	
	@Test
	void testAddItem(){

		s.addItem(p);
		int esperado=1;
		int resultado=s.getItemCount();
		assertEquals(esperado, resultado);
	}
	

	@Test
	void testRemoveItem() throws ProductNotFoundException{
		
		
		s.addItem(p);
		s.removeItem(p);
	
		int esperando=s.getItemCount();
		int resultado=0;
		
		assertEquals(resultado, esperando);
	}


	@Test
	void testEmpty(){
		
		
		s.addItem(p);
		s.empty();
		
		int esperando=s.getItemCount();
		int resultado=0;
		assertEquals(resultado, esperando);
	}

}


