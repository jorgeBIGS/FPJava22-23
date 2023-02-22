package fp.persona;

import java.time.LocalDate;

public class TestPersona {

	public static void main(String[] args) {
		Persona p = new Persona("Jorge", "García Gutiérrez", "11111111X", 
				LocalDate.of(1981, 5, 3));
		System.out.println(p);
		Persona p2 = new Persona("21111111X ,Germán ,García Gutiérrez ,05/09/1985");
		System.out.println(p2);
	}

}
