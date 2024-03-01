package es.iessoterhernandez.daw.endes.Test4;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TestPila {
	
	private Pila pila;

	@BeforeEach
	public  void inicio() {
		pila = new Pila();
	}

	@AfterEach
	public  void finish() {
		pila = null;
	}
	
	
	@Test
	public void testIsEmpty() {
		assertTrue(pila.isEmpty());
	}
	@Test
	public void testPopVacio() {
		assertNull(pila.pop());
	}
	@Test
	public void testPopValido() {
		pila.push(5);
		pila.pop();
		assertTrue(pila.isEmpty()); 
		}
	@Test
	public void testPushValido() {
		pila.push(5);
		assertFalse(pila.isEmpty());
	}
	@Test
	public void testPushNoValido() {
		pila.push(0);
		assertTrue(pila.isEmpty());
	}
	@Test
	public void testTopVacio() {
		assertNull(pila.top());
	}
	@Test
	public void testTopo() {
		pila.push(5);
		pila.push(10);
		assertEquals(10, pila.top());
	}
	
	
	
	
}
