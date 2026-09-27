package com.krakedev.parqueadero.modelo;

public class Auto extends Vehiculo {
	private int numeroPuertas;

	public Auto(String placa, String propietario, int numeroPuertas) {
		super(placa, propietario);
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public double calcularTarifa(int horas) {
		double total = horas * 1.50;
		if (horas > 4) {
			total = total + 2.00;
		}
		return total;
	}
}
