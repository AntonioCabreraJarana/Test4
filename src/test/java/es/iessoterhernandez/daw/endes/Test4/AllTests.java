package es.iessoterhernandez.daw.endes.Test4;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestAcount.class, TestAcount2.class, TestBoa.class, TestFridge.class, TestOperadorAritmetico.class,
		TestPila.class, TestSubscripcion.class })
public class AllTests {

}
