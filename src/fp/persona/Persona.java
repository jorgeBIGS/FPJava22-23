package fp.persona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Persona implements Comparable<Persona> {
	private String nombre, apellidos, dni;
	private LocalDate fechaNacimiento;
	private static final LocalDate FECHA_LIMITE = LocalDate.of(1850, 1, 1);
	private static final String DELIMITADOR = ",";

	public Persona(String linea) {
		//11111111X ,Jorge ,Garcia Gutierrez ,03/05/1981
		List<String> array = Collections.unmodifiableList(Arrays.asList(linea.split(DELIMITADOR)));
		checkTamanyo(array);
		String dni = array.get(0).trim();
		String nombre = array.get(1).trim();
		String apellidos = array.get(2).trim();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNacimiento = LocalDate.parse(array.get(3).trim(), formatter);
		
		checkFecha(fechaNacimiento);
		
		this.dni = dni;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.fechaNacimiento= fechaNacimiento;
		
	}
	
	private void checkTamanyo(List<String> array) {
		if(array.size()!=4) {
			throw new IllegalArgumentException("Número de elementos no válido");
		}
		
	}

	public Persona(String nombre, String apellidos, String dni, LocalDate fechaNacimiento) {
		checkFecha(fechaNacimiento);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	private void checkFecha(LocalDate fecha) {
		if(fecha.isBefore(FECHA_LIMITE)
				|| fecha.isAfter(LocalDate.now())) {
			IllegalArgumentException excepcion = new IllegalArgumentException();
			throw excepcion;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		checkFecha(fechaNacimiento);
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getEdad() {
		LocalDate hoy = LocalDate.now();
		return getFechaNacimiento().until(hoy).getYears();
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", fechaNacimiento="
				+ fechaNacimiento + ", getEdad()=" + getEdad() + "]";
	}

	public int compareTo(Persona o) {
		int result = this.getDni().compareTo(o.getDni());
		if (result == 0) {
			result = getApellidos().compareTo(o.getApellidos());
			if (result == 0) {
				result = getNombre().compareTo(o.getNombre());
			}
		}

		return result;
	}

}
