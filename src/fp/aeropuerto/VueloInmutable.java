package fp.aeropuerto;

import java.time.LocalDateTime;
import java.util.Objects;

import fp.utils.Checkers;

public record VueloInmutable(String destino, Double precio, Integer numeroPlazas, Integer numeroPasajeros,
		String codigo, LocalDateTime fechaHoraSalida) implements Vuelo{

	private static final String DELIM = ",";

	public static VueloInmutable parse(String s) {
		// Madrid,12.37,155,100,IB1123,22,11,2007,1,5
		String[] splits = s.split(DELIM);
		Checkers.checkSize(splits, 10);
		String destino = splits[0].trim();
		Double precio = Double.valueOf(splits[1].trim());
		Integer numeroPlazas = Integer.valueOf(splits[2].trim());
		Integer numeroPasajeros = Integer.valueOf(splits[3].trim());
		String codigo = splits[4].trim();
		Integer dia = Integer.valueOf(splits[5].trim());
		Integer mes = Integer.valueOf(splits[6].trim());
		Integer anyo = Integer.valueOf(splits[7].trim());
		Integer hora = Integer.valueOf(splits[8].trim());
		Integer minutos = Integer.valueOf(splits[9].trim());
		LocalDateTime fechaHoraSalida = LocalDateTime.of(anyo, mes, dia, hora, minutos);

		return new VueloInmutable(destino, precio, numeroPlazas, numeroPasajeros, codigo, fechaHoraSalida);
	}

	public VueloInmutable {
		checkFecha(fechaHoraSalida);
		checkNumeroPasajerosPlazas(numeroPasajeros, numeroPlazas);

	}

	private void checkNumeroPasajerosPlazas(Integer numeroPasajeros, Integer numeroPlazas) {
		if (numeroPasajeros > numeroPlazas) {
			throw new IllegalArgumentException();
		}
	}

	private void checkFecha(LocalDateTime fecha) {
		if (fecha.compareTo(LocalDateTime.now()) > 0) {
			throw new IllegalArgumentException();
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, destino, fechaHoraSalida);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VueloInmutable other = (VueloInmutable) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(destino, other.destino)
				&& Objects.equals(fechaHoraSalida, other.fechaHoraSalida);
	}

}
