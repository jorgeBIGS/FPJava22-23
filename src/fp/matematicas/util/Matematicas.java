package fp.matematicas.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Matematicas {

	public static Boolean esPar(Integer i) {
		return i % 2 == 0;
	}

	public static List<Integer> elevaAExponente(List<Integer> l, Integer exponente) {
		List<Integer> result = new ArrayList<>();
		for (Integer valor : l) {
			Double nuevoValor = Math.pow(valor, exponente);
			result.add(nuevoValor.intValue());
		}
		return result;
	}

	public static List<Integer> filtraPrimos(List<Integer> l) {
		List<Integer> result = new ArrayList<>();
		for (Integer valor : l) {
			if (esPrimo(valor)) {
				result.add(valor);
			}
		}
		return result;
	}

	private static Boolean esPrimo(Integer n) {
		Boolean result = true;
		Double raiz = Math.sqrt(n);
		for (int i = 2; i < raiz; i++) {
			if (n % i == 0) {
				result = false;
				break;
			}
		}
		return result;
	}

	public static List<Integer> getPares(List<Integer> valores) {
		List<Integer> result = new ArrayList<>();

		for (Integer numero : valores) {
			if (esPar(numero)) {
				result.add(numero);
			}
		}

		return result;
	}

	public static List<Integer> generaLista(Integer n) {
		List<Integer> result = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			result.add(r.nextInt());
		}
		return result;
	}

	public static List<Integer> generaListaSinRepetidos(Integer n) {
		Set<Integer> conjunto = new HashSet<>(generaLista(n));
		Random r = new Random();
		while (conjunto.size() < n) {
			conjunto.add(r.nextInt());
		}
		List<Integer> result = new ArrayList<>(conjunto);
		return result;
	}
}
