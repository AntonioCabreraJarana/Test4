package es.iessoterhernandez.daw.endes.Test4;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TestOperadorAritmetico {
	
	private static OperadorAritmetico op;

	@BeforeAll
	public static void inicio() {
		op = new OperadorAritmetico();
	}

	@AfterAll
	public static void finish() {
		op = null;
	}

	@Test
	public void testSuma() {
		int a = 1,b = 2;
		assertEquals(3, op.suma(a, b));
	}
	@Test
	public void testDivisionValida() throws Exception{
		int a = 10,b = 2;
		assertEquals(5, op.division(a,b));
	}
	
	   @Test
	    void triangularMinus5() {         

	        assertThrows(
	            Exception.class, 
	            () -> op.division(42, 0));
	       
	        
	}
	
}
