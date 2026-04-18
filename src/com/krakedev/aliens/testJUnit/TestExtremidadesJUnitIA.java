package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestExtremidadesJUnitIA {
	@Test
	public void testAgregarBrazosValido() {
		// Valida que se puedan agregar brazos si no supera el límite de 10 extremidades
		Alien alien = new Alien(10, "Verde");

		boolean resultado = alien.agregarBrazos(4);

		assertTrue(resultado);
		assertEquals(4, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPies());
	}

	@Test
	public void testAgregarPiernasValido() {
		// Valida que se puedan agregar piernas si no supera el límite de 10 extremidades
		Alien alien = new Alien(12, "Azul");

		boolean resultado = alien.agregarPiernas(3);

		assertTrue(resultado);
		assertEquals(0, alien.getNumeroBrazos());
		assertEquals(3, alien.getNumeroPies());
	}

	@Test
	public void testAgregarBrazosAlLimite() {
		// Valida el caso límite exacto: se pueden agregar 10 brazos
		Alien alien = new Alien(15, "Rojo");

		boolean resultado = alien.agregarBrazos(10);

		assertTrue(resultado);
		assertEquals(10, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPies());
	}

	@Test
	public void testAgregarPiernasAlLimite() {
		// Valida el caso límite exacto: se pueden agregar 10 piernas
		Alien alien = new Alien(15, "Morado");

		boolean resultado = alien.agregarPiernas(10);

		assertTrue(resultado);
		assertEquals(0, alien.getNumeroBrazos());
		assertEquals(10, alien.getNumeroPies());
	}

	@Test
	public void testAgregarBrazosSuperaLimite() {
		// Valida que no se agreguen brazos si excede el máximo de 10 extremidades
		Alien alien = new Alien(18, "Negro");

		boolean resultado = alien.agregarBrazos(11);

		assertFalse(resultado);
		assertEquals(0, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPies());
	}

	@Test
	public void testAgregarPiernasSuperaLimite() {
		// Valida que no se agreguen piernas si excede el máximo de 10 extremidades
		Alien alien = new Alien(18, "Blanco");

		boolean resultado = alien.agregarPiernas(12);

		assertFalse(resultado);
		assertEquals(0, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPies());
	}

	@Test
	public void testAgregarBrazosYLuegoPiernasValido() {
		// Valida un caso combinado válido: primero brazos y luego piernas sin superar 10
		Alien alien = new Alien(20, "Gris");

		boolean resultadoBrazos = alien.agregarBrazos(4);
		boolean resultadoPiernas = alien.agregarPiernas(6);

		assertTrue(resultadoBrazos);
		assertTrue(resultadoPiernas);
		assertEquals(4, alien.getNumeroBrazos());
		assertEquals(6, alien.getNumeroPies());
	}

	@Test
	public void testAgregarBrazosYLuegoPiernasSuperaLimite() {
		// Valida un caso combinado donde la segunda operación supera el límite
		Alien alien = new Alien(20, "Amarillo");

		boolean resultadoBrazos = alien.agregarBrazos(7);
		boolean resultadoPiernas = alien.agregarPiernas(4);

		assertTrue(resultadoBrazos);
		assertFalse(resultadoPiernas);
		assertEquals(7, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPies());
	}

	@Test
	public void testAgregarPiernasYLuegoBrazosSuperaLimite() {
		// Valida un caso combinado inverso donde la segunda operación supera el límite
		Alien alien = new Alien(20, "Celeste");

		boolean resultadoPiernas = alien.agregarPiernas(8);
		boolean resultadoBrazos = alien.agregarBrazos(3);

		assertTrue(resultadoPiernas);
		assertFalse(resultadoBrazos);
		assertEquals(0, alien.getNumeroBrazos());
		assertEquals(8, alien.getNumeroPies());
	}
}
