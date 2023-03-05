package fp.utils.test;

import java.util.ArrayList;
import java.util.List;

import fp.persona.Persona;

public class TestLists {
	public static void main(String... args) {
		Persona p = new Persona("11111111X ,Jorge ,Garcia Gutierrez ,03/05/1981");
		List<Persona> lista = new ArrayList<>();
		lista.add(p);
		//lista = Collections.unmodifiableList(lista);
		p.setApellidos("");
		System.out.println(lista.get(0).getApellidos());
	}
}
