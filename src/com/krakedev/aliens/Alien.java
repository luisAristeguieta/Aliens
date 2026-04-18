package com.krakedev.aliens;

public class Alien {
	private int tamanio;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;

	public Alien(int tamanio, String color) {

		if (tamanio < 5) {
			this.tamanio = 5;
		} else if (tamanio > 30) {
			this.tamanio = 30;
		} else {
			this.tamanio = tamanio;
		}

		this.color = color;

		this.precioCuerpo = this.tamanio * 0.20;
		this.precioExtremidad = this.tamanio * 0.10;
		this.precioOjo = this.tamanio * 0.05;
	}

	public int getTamanio() {
		return tamanio;
	}

	public String getColor() {
		return color;
	}

	public int getNumeroOjos() {
		return numeroOjos;
	}

	public int getNumeroBrazos() {
		return numeroBrazos;
	}

	public int getNumeroPies() {
		return numeroPies;
	}

	public double getPrecioExtremidad() {
		return precioExtremidad;
	}

	public double getPrecioOjo() {
		return precioOjo;
	}

	public double getPrecioCuerpo() {
		return precioCuerpo;
	}

	public void imprimir() {
		String mensaje = "Tamaño: " + tamanio + " cm" + " , Color: " + color + " , Numero de Ojos: " + numeroOjos
				+ " , Numero de Brazos: " + numeroBrazos + " , Numero de Pies: " + numeroPies
				+ " , Precio Extremidad(es): " + precioExtremidad + "$" + " , Precio Ojo(s): " + precioOjo + "$"
				+ " , Precio Cuerpo: " + precioCuerpo + "$";
		System.out.println(mensaje);
	}

}