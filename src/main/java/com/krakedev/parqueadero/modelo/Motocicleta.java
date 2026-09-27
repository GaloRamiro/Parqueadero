package com.krakedev.parqueadero.modelo;

public class Motocicleta extends Vehiculo {
	private int cilindraje;

	public Motocicleta(String placa, String propietario, int cilindraje) {
		super(placa, propietario);
		this.cilindraje = cilindraje;
	}

	@Override
	public double calcularTarifa(int horas) {
		if (cilindraje > 250) {
			return horas * 1.00;
		}

		return horas * 0.75;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

}
