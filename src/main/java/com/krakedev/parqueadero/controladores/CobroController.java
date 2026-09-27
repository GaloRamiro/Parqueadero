package com.krakedev.parqueadero.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.parqueadero.servicios.ServicioCobro;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.krakedev.parqueadero.modelo.TicketCobro;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import com.krakedev.parqueadero.modelo.TicketCobro;

@RestController
@RequestMapping("/cobros")
public class CobroController {
	private ServicioCobro servicioCobro;

	public CobroController(ServicioCobro servicioCobro) {
		this.servicioCobro = servicioCobro;
	}

	@PostMapping("/{placa}/{horas}")
	public TicketCobro procesarSalida(@PathVariable String placa, @PathVariable int horas) {
		return servicioCobro.procesarSalida(placa, horas);
	}
	
	@GetMapping
	public ArrayList<TicketCobro> listarTickets() {
	    return servicioCobro.listarTickets();
	}
	
	@GetMapping("/total")
	public double totalRecaudado() {
	    return servicioCobro.calcularTotalRecaudado();
	}
}
