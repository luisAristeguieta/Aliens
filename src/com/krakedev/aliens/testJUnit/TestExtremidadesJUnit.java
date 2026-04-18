package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestExtremidadesJUnit {
	
	@Test
	public void testAgregarBrazos() {
		Alien alien = new Alien(10, "Verde");
		
		
		// alien.imprimir();
		
		boolean resultado = alien.agregarBrazos(4);

		assertTrue(resultado);
		assertEquals(4, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPies());
	}
	
	@Test
	public void testAgregarPiernas() {
		Alien alien = new Alien(10, "Azul");
		
		// alien.imprimir();
		boolean resultado = alien.agregarPiernas(3);

		assertTrue(resultado);
		assertEquals(0, alien.getNumeroBrazos());
		assertEquals(3, alien.getNumeroPies());
	}
	
	
}
