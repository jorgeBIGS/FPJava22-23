package fp.aeropuerto.test;

import fp.aeropuerto.Aeropuerto;
import fp.aeropuerto.Factoria;

public class TestAeropuerto {
	public static void main(String... strings) {
		Aeropuerto a = Factoria.creaAeropuerto("Sevilla",
				"San Pablo", "data/vuelos.csv");

		System.out.println(a.getVuelosProgramados().get(0));
		System.out.println(a.getVuelosProgramados().size());

	}
}
