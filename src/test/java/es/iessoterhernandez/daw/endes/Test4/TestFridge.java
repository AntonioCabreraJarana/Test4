package es.iessoterhernandez.daw.endes.Test4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Unit test for simple App.
 */
public class TestFridge {	

	 private Fridge fridge;

	    @BeforeEach
	    void inicio() {
	        fridge = new Fridge();
	    }
	    
	    @AfterEach
	    void finish() {
	    	fridge = null;	    	
	    }

	    @ParameterizedTest
	    @CsvSource({"Leche", "Huevos", "Tomates"})
	    void testPut(String item) {
	        assertTrue(fridge.put(item));
	        
	    }
	    @ParameterizedTest
	    @CsvSource({"Leche", "Huevos", "Tomates"})
	    void testContains(String item) {
	    	fridge.put(item);
	    	assertTrue(fridge.contains(item));
	    }

	    @ParameterizedTest
	    @CsvSource({"Leche", "Huevos", "Tomates"})
	    void testTake(String item) throws NoSuchItemException {
	        fridge.put(item);
	        assertTrue(fridge.contains(item));
	        fridge.take(item);
	        assertFalse(fridge.contains(item));
	    }

	    @ParameterizedTest
	    @CsvSource({"Leche", "Huevos", "Tomates"})
	    void testTakeNoSuchItemException(String item) {
	        assertThrows(NoSuchItemException.class, () -> {
	            fridge.take(item);
	        });
	    }
}
