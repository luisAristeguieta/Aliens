package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestAlienCoberturaMejoradaJUnitIA {

	@Test
	public void testConstructorEnRango() {
		Alien alien = new Alien(15, "Morado");

		assertEquals(15, alien.getTamanio());
		assertEquals("Morado", alien.getColor());
		assertEquals(0, alien.getNumeroOjos());
		assertEquals(0, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPies());
		assertEquals(1.5, alien.getPrecioExtremidad(), 0.0001);
		assertEquals(0.75, alien.getPrecioOjo(), 0.0001);
		assertEquals(3.0, alien.getPrecioCuerpo(), 0.0001);
		assertEquals(0.0, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testConstructorTamanioMinimo() {
		Alien alien = new Alien(2, "Verde");

		assertEquals(5, alien.getTamanio());
		assertEquals("Verde", alien.getColor());
		assertEquals(0.5, alien.getPrecioExtremidad(), 0.0001);
		assertEquals(0.25, alien.getPrecioOjo(), 0.0001);
		assertEquals(1.0, alien.getPrecioCuerpo(), 0.0001);
		assertEquals(0.0, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testConstructorTamanioMaximo() {
		Alien alien = new Alien(100, "Azul");

		assertEquals(30, alien.getTamanio());
		assertEquals("Azul", alien.getColor());
		assertEquals(3.0, alien.getPrecioExtremidad(), 0.0001);
		assertEquals(1.5, alien.getPrecioOjo(), 0.0001);
		assertEquals(6.0, alien.getPrecioCuerpo(), 0.0001);
		assertEquals(0.0, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testAgregarBrazosValido() {
		Alien alien = new Alien(10, "Verde");

		boolean resultado = alien.agregarBrazos(4);

		assertTrue(resultado);
		assertEquals(4, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPies());
		assertEquals(6.0, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testAgregarBrazosInvalido() {
		Alien alien = new Alien(10, "Verde");

		boolean resultado = alien.agregarBrazos(11);

		assertFalse(resultado);
		assertEquals(0, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPies());
		assertEquals(0.0, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testAgregarPiernasValido() {
		Alien alien = new Alien(10, "Azul");

		boolean resultado = alien.agregarPiernas(3);

		assertTrue(resultado);
		assertEquals(0, alien.getNumeroBrazos());
		assertEquals(3, alien.getNumeroPies());
		assertEquals(5.0, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testAgregarPiernasInvalido() {
		Alien alien = new Alien(10, "Azul");
		alien.agregarBrazos(8);

		boolean resultado = alien.agregarPiernas(3);

		assertFalse(resultado);
		assertEquals(8, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPies());
		assertEquals(10.0, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testAgregarOjosRangoPequenio() {
		Alien alien = new Alien(8, "Gris");

		boolean resultado = alien.agregarOjos(3);

		assertTrue(resultado);
		assertEquals(3, alien.getNumeroOjos());
		assertEquals(2.8, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testAgregarOjosRangoMediano() {
		Alien alien = new Alien(15, "Negro");

		boolean resultado = alien.agregarOjos(5);

		assertTrue(resultado);
		assertEquals(5, alien.getNumeroOjos());
		assertEquals(6.75, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testAgregarOjosRangoGrande() {
		Alien alien = new Alien(25, "Blanco");

		boolean resultado = alien.agregarOjos(7);

		assertTrue(resultado);
		assertEquals(7, alien.getNumeroOjos());
		assertEquals(13.75, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testAgregarOjosInvalido() {
		Alien alien = new Alien(10, "Celeste");

		boolean resultado = alien.agregarOjos(4);

		assertFalse(resultado);
		assertEquals(0, alien.getNumeroOjos());
		assertEquals(0.0, alien.getPrecioTotal(), 0.0001);
	}

	@Test
	public void testImprimir() {
		Alien alien = new Alien(10, "Rojo");
		alien.agregarBrazos(2);
		alien.agregarPiernas(2);
		alien.agregarOjos(3);

		ByteArrayOutputStream salida = new ByteArrayOutputStream();
		PrintStream original = System.out;
		System.setOut(new PrintStream(salida));

		try {
			alien.imprimir();
		} finally {
			System.setOut(original);
		}

		String texto = salida.toString();

		assertTrue(texto.contains("Tamaño: 10 cm"));
		assertTrue(texto.contains("Color: Rojo"));
		assertTrue(texto.contains("Numero de Ojos: 3"));
		assertTrue(texto.contains("Numero de Brazos: 2"));
		assertTrue(texto.contains("Numero de Pies: 2"));
		assertTrue(texto.contains("Precio Total: 7.5$"));
	}
}