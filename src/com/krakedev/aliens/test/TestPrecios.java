package com.krakedev.aliens.test;

import com.krakedev.aliens.Alien;

public class TestPrecios {

	public static void main(String[] args) {
		
		Alien alien = new Alien(10, "Verde");
		System.out.println("**Estado Inicial");
		alien.imprimir();
		
		alien.agregarBrazos(4);
		
		System.out.println("**Agrega Brazos**");
		alien.imprimir();
		
		alien.agregarPiernas(4);
		
		System.out.println("**Agrega Piernas**");
		alien.imprimir();
		
	}

}
