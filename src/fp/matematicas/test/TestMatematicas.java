package fp.matematicas.test;

import fp.matematicas.util.*;

public class TestMatematicas {

	public static void testEsPar() {
		System.out.println(Matematicas.esPar(32));
	}

	public static void testGeneraLista() {
		System.out.println(Matematicas.generaLista(10));
	}

	public static void testGeneraListaSinRepetidos() {
		System.out.println(Matematicas.generaListaSinRepetidos(10));
	}

	public static void main(String[] args) {
		testGeneraLista();
		testGeneraListaSinRepetidos();
	}

}
