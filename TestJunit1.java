package ism.ase.ro;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJunit1 {
	private Dog dog;
	
	@Before
	public void setUp() {
		dog = new Dog("Lucky", Breed.CANICHE, 10);
	}

	@Test
	public void testAgeMethod() {
		assertEquals(0, this.dog.getAgeInHumanYears(),70 );
	}

}
