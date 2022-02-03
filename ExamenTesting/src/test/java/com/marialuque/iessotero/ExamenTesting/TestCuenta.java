package com.marialuque.iessotero.ExamenTesting;

import static org.junit.Assert.assertThat;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cuentas.IngresoNegativoException;
import cuentas.Movimiento;
import cuentas.SaldoInsuficienteException;
import cuentas.Cuenta;



class TestCuenta extends CoreMatchers{

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	private Cuenta c;
	private Movimiento m;
	
	@BeforeEach
	 void init() {
	c = new Cuenta ("1234","Maria Luque");
	
	m = new Movimiento();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void TestIngresar() {
		
		m.setConcepto("Hola");
		m.setImporte(11.5);
		
		try {
			c.ingresar("Hola", 11.5);
		} catch (IngresoNegativoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertThat(m.getImporte(), is(11.5));
		assertThat(m.getConcepto(),is("Hola"));
		
		
	}
	
	
	@Test
	void TestRetirar() {
		
		m.setConcepto("Hola");
		m.setImporte(11.5);
		
		
			try {
				c.retirar("Hola", 11.5);
			} catch (IngresoNegativoException | SaldoInsuficienteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		assertThat(m.getImporte(), is(11.5));
		assertThat(m.getConcepto(),is("Hola"));
		
	}	
	
	
}
