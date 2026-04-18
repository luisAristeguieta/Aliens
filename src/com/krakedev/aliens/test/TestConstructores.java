package com.krakedev.aliens.test;

import com.krakedev.aliens.Alien;

public class TestConstructores {

	public static void main(String[] args) {
		
		// Caso 1: tamaño menor al mínimo 
		Alien alien1 = new Alien(3, "Rojo");
		alien1.imprimir();
		
		// Caso 2: tamaño mayor al máximo 
		Alien alien2 = new Alien(10, "Azul");
		alien2.imprimir();
	}

}
