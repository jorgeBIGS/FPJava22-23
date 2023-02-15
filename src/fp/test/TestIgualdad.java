package fp.test;

import fp.punto.Punto;
import fp.punto.PuntoImpl;
import fp.punto.PuntoImpl2;

public class TestIgualdad {

	public static void main(String[] args) {
//		Integer i1 = 23000;
//		Integer i2 = 23000;
//
//		System.out.println(i1.equals(i2));
//
//		int i3 = 23000;
//		int i4 = 23000;
//
//		System.out.println(i3 == i4);
		
		Punto p1 = new PuntoImpl();
		Punto p2 = new PuntoImpl2();
		Punto p3 = p2;
		
		System.out.println(p1.equals(p2));
	}

}
