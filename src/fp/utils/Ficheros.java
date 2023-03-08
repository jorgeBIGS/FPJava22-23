package fp.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ficheros {
	
	public static List<String> leeLineas(String ruta){
		List<String> lineas = new ArrayList<>();
		try {
			lineas = Files.readAllLines(Paths.get(ruta));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lineas;
	}

}
