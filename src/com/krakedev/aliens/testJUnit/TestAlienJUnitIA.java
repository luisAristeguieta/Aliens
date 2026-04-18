package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestAlienJUnitIA {
	@Test
	public void testAlienDentroDeRango() {
		Alien alien = new Alien(15, "Morado");

		assertEquals(15, alien.getTamanio());
		assertEquals("Morado", alien.getColor());
		assertEquals(3.0, alien.getPrecioCuerpo(), 0.0001);
		assertEquals(1.5, alien.getPrecioExtremidad(), 0.0001);
		assertEquals(0.75, alien.getPrecioOjo(), 0.0001);
		assertEquals(0, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testAlienAjustaTamanioMinimo() {
		Alien alien = new Alien(1, "Verde");

		assertEquals(5, alien.getTamanio());
		assertEquals(1.0, alien.getPrecioCuerpo(), 0.0001);
		assertEquals(0.5, alien.getPrecioExtremidad(), 0.0001);
		assertEquals(0.25, alien.getPrecioOjo(), 0.0001);
		assertEquals(0, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testAlienAjustaTamanioMaximo() {
		Alien alien = new Alien(100, "Azul");

		assertEquals(30, alien.getTamanio());
		assertEquals(6.0, alien.getPrecioCuerpo(), 0.0001);
		assertEquals(3.0, alien.getPrecioExtremidad(), 0.0001);
		assertEquals(1.5, alien.getPrecioOjo(), 0.0001);
		assertEquals(0, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testAtributosPorDefecto() {
		Alien alien = new Alien(10, "Gris");

		assertEquals(0, alien.getNumeroOjos());
		assertEquals(0, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPies());
		assertEquals(0, alien.getPrecioTotal(), 0.0001);
	}
}
