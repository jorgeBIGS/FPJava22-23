package fp.punto.test;

import fp.punto.PuntoInmutable;

public class TestPuntoInmutable {

	public static void main(String[] args) {
		PuntoInmutable punto = new PuntoInmutable(3.0, 0.0);
		System.out.println(punto);
		System.out.println(punto.x());
		System.out.println(punto.y());

	}

}
