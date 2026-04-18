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
	
	@Test
	public void testTamanioAlMinimo() {
		Alien alien = new Alien(2, "Verde");

		assertEquals(5, alien.getTamanio());
		assertEquals("Verde", alien.getColor());
		
		assertEquals(0.5, alien.getPrecioExtremidad(), 0.0001);
		assertEquals(0.25, alien.getPrecioOjo(), 0.0001);
		assertEquals(1, alien.getPrecioCuerpo(), 0.0001);
	}
	
	@Test
	public void testTamanioAlMaximo() {
		Alien alien = new Alien(2000, "Verde");

		assertEquals(30, alien.getTamanio());
		assertEquals("Verde", alien.getColor());
		
		assertEquals(3, alien.getPrecioExtremidad(), 0.0001);
		assertEquals(1.5, alien.getPrecioOjo(), 0.0001);
		assertEquals(6, alien.getPrecioCuerpo(), 0.0001);
	}
	
	
}
