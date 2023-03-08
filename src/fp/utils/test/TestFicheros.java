package fp.utils.test;

import java.util.List;

import fp.utils.Ficheros;

public class TestFicheros {

	public static void main(String[] args) {
		List<String> lineas = Ficheros.leeLineas("data/vuelos.csv");
		System.out.println(lineas.get(0));
		System.out.println(lineas.size());

	}

}
