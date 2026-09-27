package com.krakedev.parqueadero.modelo;

import java.time.LocalDate;

public class TicketCobro {
	private String codigo;
	private String placa;
	private int horas;
	private double total;
	private LocalDate fechaSalida;

	public TicketCobro(String codigo, String placa, int horas, double total) {
		this.codigo = codigo;
		this.placa = placa;
		this.horas = horas;
		this.total = total;
		this.fechaSalida = LocalDate.now();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	

}
