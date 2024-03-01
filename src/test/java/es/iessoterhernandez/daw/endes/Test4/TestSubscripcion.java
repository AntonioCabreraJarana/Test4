package es.iessoterhernandez.daw.endes.Test4;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
public class TestSubscripcion 
{
	Subscripcion sub;

	@BeforeEach
	public void inicio() {
		sub = new Subscripcion(20, 10);
	}

	@AfterEach
	public void finish() {
		sub = null;
	}
	
	@Test
	public void testPrecioMesValidoExacto() {
		assertEquals(2, sub.precioPorMes());	
		
	}
	@Test
	public void testPrecioMesValidoNoExacto() {
		sub = new Subscripcion(15, 10);
		assertEquals(2.5, sub.precioPorMes());	
		
	}
	@Test
	public void testPrecioNegativo() {
		sub = new Subscripcion(-20, 10);
		assertEquals(0, sub.precioPorMes());	
		
	}
	@Test
	public void testMesNegativo() {
		sub = new Subscripcion(20, -10);
		assertEquals(0, sub.precioPorMes());	
		
	}
	@Test
	public void testCancelaSubscripcion() {
		sub.cancel();
		assertEquals(0, sub.precioPorMes());	
		
	}
}
