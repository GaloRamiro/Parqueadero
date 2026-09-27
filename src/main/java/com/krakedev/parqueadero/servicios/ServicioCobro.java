package com.krakedev.parqueadero.servicios;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.parqueadero.modelo.TicketCobro;

@Service
public class ServicioCobro {
	private ArrayList<TicketCobro> tickets = new ArrayList<TicketCobro>();
	private ServicioVehiculos servicioVehiculos;
	public ServicioCobro(ServicioVehiculos servicioVehiculos) {
	    this.servicioVehiculos = servicioVehiculos;
	}
}
