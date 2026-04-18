package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestPrecioTotalJUnit {
	@Test
	public void testCalcularPrecioTotalConElementosValidos() {
		Alien alien = new Alien(20, "Verde");

		boolean brazos = alien.agregarBrazos(2);
		boolean piernas = alien.agregarPiernas(2);
		boolean ojos = alien.agregarOjos(3);

		assertTrue(brazos);
		assertTrue(piernas);
		assertTrue(ojos);

		assertEquals(2, alien.getNumeroBrazos());
		assertEquals(2, alien.getNumeroPies());
		assertEquals(3, alien.getNumeroOjos());

		assertEquals(15, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testPrecioTotalSeActualizaAutomaticamente() {
		Alien alien = new Alien(10, "Azul");

		assertEquals(0, alien.getPrecioTotal(), 0.0001);

		alien.agregarBrazos(4);
		assertEquals(6, alien.getPrecioTotal(), 0.0001);

		alien.agregarPiernas(3);
		assertEquals(9, alien.getPrecioTotal(), 0.0001);

		alien.agregarOjos(2);
		assertEquals(10, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testNoAgregarPiernasSiSuperaLimiteDeExtremidades() {
		Alien alien = new Alien(15, "Rojo");

		boolean brazos = alien.agregarBrazos(8);
		boolean piernas = alien.agregarPiernas(3);

		assertTrue(brazos);
		assertFalse(piernas);

		assertEquals(8, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPies());
		assertEquals(15, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testNoAgregarOjosSiSuperaLimitePorTamanio() {
		Alien alien = new Alien(9, "Morado");

		boolean primeraCarga = alien.agregarOjos(3);
		boolean segundaCarga = alien.agregarOjos(1);

		assertTrue(primeraCarga);
		assertFalse(segundaCarga);

		assertEquals(3, alien.getNumeroOjos());
		assertEquals(3.15, alien.getPrecioTotal(), 0.0001);
	}
}
