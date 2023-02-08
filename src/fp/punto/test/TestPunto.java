package fp.punto.test;

import fp.punto.PuntoImpl;

public class TestPunto {

	public static void main(String[] args) {
		PuntoImpl p = new PuntoImpl();
		System.out.println(p.getX());
		p.setX(3.0);
		System.out.println(p.getX());
		System.out.println(p.toString());
		PuntoImpl p2 = new PuntoImpl();
		System.out.println(p.getDistanciaEuclideaA(p2));

	}

}
