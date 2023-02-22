package fp.utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generadores {
	public static List<Integer> getListaEnteros(Boolean linked) {
		List<Integer> result = new ArrayList<>();
		if (linked) {
			result = new LinkedList<>();
		}
		return result;
	}
}
