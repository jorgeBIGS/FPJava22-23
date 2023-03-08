package fp.aeropuerto;

import java.util.ArrayList;
import java.util.List;

import fp.utils.Ficheros;

public class Factoria {

	
	public static Aeropuerto creaAeropuerto(String ciudad, String nombre, 
			String ruta) {
		List<String> lineas = Ficheros.leeLineas(ruta);
		
		List<Vuelo> vuelos = new ArrayList<>();
		for(String linea: lineas) {
			vuelos.add(VueloInmutable.parse(linea));
		}
		
		return new Aeropuerto(ciudad, nombre, vuelos);
	}

}
