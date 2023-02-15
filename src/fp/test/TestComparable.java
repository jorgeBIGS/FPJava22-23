package fp.test;

import fp.punto.Punto;
import fp.punto.PuntoImpl;
import fp.punto.PuntoImpl2;

public class TestComparable {

	public static void main(String[] args) {
		Integer i = 3;
		Integer i2 = 4;
		System.out.println(i>i2);
		
		Punto p1 = new PuntoImpl();
		Punto p2 = new PuntoImpl2();
		System.out.println(p1.compareTo(p2));
	

	}

}
