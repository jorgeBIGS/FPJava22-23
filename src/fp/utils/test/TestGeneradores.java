package fp.utils.test;

import java.util.List;

import fp.utils.Generadores;

public class TestGeneradores {

	public static void main(String[] args) {
		List<Integer> lista = Generadores.getListaEnteros(true);
		lista.add(3);
		System.out.println(lista);
		lista = Generadores.getListaEnteros(false);
		lista.add(3);
		System.out.println(lista);
	}

}
