package com.krakedev.parqueadero.servicios;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.parqueadero.modelo.Vehiculo;

@Service
public class ServicioVehiculos {
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	//BUSCAR
	public Vehiculo buscarPorPlaca(String placa) {
		for (Vehiculo v : vehiculos) {
		    if (v.getPlaca().equals(placa)) {
		        return v;
		    }
		}
	
	}

}


