package com.marialuque.iessotero.ExamenTesting;


import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import empleado.Empleado;


class TestEmpleado extends CoreMatchers{

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	private Empleado e;
	
	@BeforeEach
	void init() {
		e = new Empleado ("Maria","Luque",24,1000);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	
    void TestPlus(){
		
    	 
		e.plus(2000);
		
		
		assertEquals(1000,e.getSalario());
       
    }

	@Test
     void TestEquals(){
		
        
        assertThat(e.getNombre(),is("Maria"));
        assertThat(e.getApellido(), is("Luque"));
    }
 
   @Test
   
   void TestCompareTo(){
 
	   Empleado a = new Empleado ("Maria","Luque",29,123456);
	   e.compareTo(a);
	   
            assertEquals(e.getNombre(),a.getNombre());
            assertEquals(e.getApellido(),a.getApellido());
            
 
    }

}
