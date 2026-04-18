package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestAlienJUnit {
	
	@Test
	public void testConstructorDatosValidos() {
		Alien alien = new Alien(20, "Verde");

		assertEquals(20, alien.getTamanio(), 0.0001);
		assertEquals("Verde", alien.getColor());
		assertEquals(0, alien.getNumeroOjos(), 0.0001);
		assertEquals(0, alien.getNumeroBrazos(), 0.0001);
		assertEquals(0, alien.getNumeroPies(), 0.0001);
		
		assertEquals(2, alien.getPrecioExtremidad(), 0.0001);
		assertEquals(1, alien.getPrecioOjo(), 0.0001);
		assertEquals(4, alien.getPrecioCuerpo(), 0.0001);	
	}
	
	
}
