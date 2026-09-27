package com.krakedev.parqueadero.servicios;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.parqueadero.modelo.TicketCobro;
import com.krakedev.parqueadero.modelo.Vehiculo;

@Service
public class ServicioCobro {
	private ArrayList<TicketCobro> tickets = new ArrayList<TicketCobro>();
	private ServicioVehiculos servicioVehiculos;

	public ServicioCobro(ServicioVehiculos servicioVehiculos) {
		this.servicioVehiculos = servicioVehiculos;
	}

	public TicketCobro procesarSalida(String placa, int horas) {
		Vehiculo vehiculo = servicioVehiculos.retirarVehiculo(placa);
		if (vehiculo == null) {
			return null;
		}
		double total = vehiculo.calcularTarifa(horas);
		String codigo = "T-" + (tickets.size() + 1);
		TicketCobro ticket = new TicketCobro(codigo, placa, horas, total);
		tickets.add(ticket);
		return ticket;
	}
	
	public ArrayList<TicketCobro> listarTickets() {
	    return tickets;
	}
}
