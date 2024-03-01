package es.iessoterhernandez.daw.endes.Test4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit test for simple App.
 */
public class TestBoa {

	Boa boa;

	@BeforeEach
	public void inicio() {
		boa = new Boa("A", 100, "B");
	}

	@AfterEach
	public void finish() {
		boa = null;
	}

	 @ParameterizedTest
	    @CsvSource({ "Anaconda, 10, raton, false", 
	                 "Python, 15, plátanos, false",
	                 "Cobra, 8, granola bars, true"})
	    void testIsHealthy(String nombre, int longitud, String comidaFavorita, boolean esperado) {
	        Boa boa = new Boa(nombre, longitud, comidaFavorita);
	        assertEquals(esperado, boa.isHealthy());
	    }

	    @ParameterizedTest
	    @CsvSource({ "10, 15, true", 
	                 "15, 10, false",
	                 "8, 8, false"})
	    void testCabe(int longitudBoa, int longitudJaula, boolean esperado) {
	        Boa boa = new Boa("Boa de prueba", longitudBoa, "barras de granola");
	        assertEquals(esperado, boa.fitsInCage(longitudJaula));
	    }

}
