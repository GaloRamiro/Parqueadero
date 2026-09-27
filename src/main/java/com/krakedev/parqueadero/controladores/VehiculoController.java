package com.krakedev.parqueadero.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.krakedev.parqueadero.servicios.ServicioVehiculos;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import com.krakedev.parqueadero.modelo.Vehiculo;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {
	private ServicioVehiculos servicioVehiculos;

	public VehiculoController(ServicioVehiculos servicioVehiculos) {
		this.servicioVehiculos = servicioVehiculos;
	}

	@GetMapping
	public ArrayList<Vehiculo> listar() {
		return servicioVehiculos.listarVehiculos();
	}
}
