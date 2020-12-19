package ism.ase.ro;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestUnit2 {

private Dog dog1;
private Dog dog2;
private Dog dog3;
	
	@Before
	public void setUp() {
		this.dog1 = new Dog("Lucky", Breed.GOLDEN, 15);
		this.dog2 = new Dog("Gigel", Breed.CANICHE,2);
		this.dog3 = new Dog("Mistrie", Breed.HUSKY,1);
	}
	
	@Test
	public void testIsPuppy() {
		assertEquals(this.dog1.isPuppy(),false);
		assertEquals(this.dog2.isPuppy(),true);
		assertEquals(this.dog3.isPuppy(),true);
	}

}
