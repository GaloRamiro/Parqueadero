package com.krakedev.parqueadero.servicios;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.parqueadero.modelo.Vehiculo;

@Service
public class ServicioVehiculos {
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	// BUSCAR
	public Vehiculo buscarPorPlaca(String placa) {
		for (Vehiculo v : vehiculos) {
			if (v.getPlaca().equals(placa)) {
				return v;
			}
		}
		return null;
	}
//agregar 
	public boolean agregarVehiculo(Vehiculo vehiculo) {
		if (buscarPorPlaca(vehiculo.getPlaca()) != null) {
			return false;
		}
		if (vehiculos.size() >= 10) {
			return false;
		}
		vehiculos.add(vehiculo);
		return true;
	}

	public ArrayList<Vehiculo> listarVehiculos() {
		return vehiculos;
	}
	
	public Vehiculo retirarVehiculo(String placa) {
		Vehiculo vehiculo = buscarPorPlaca(placa);
		if(vehiculo != null) {
			vehiculos.remove(vehiculo);
			return vehiculo;
		}
		return null;
	}
}
