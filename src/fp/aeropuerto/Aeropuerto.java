package fp.aeropuerto;

import java.util.List;
import java.util.Objects;

public class Aeropuerto {
	private String ciudad, nombre;
	

	private List<Vuelo> vuelosProgramados;
	
	public Aeropuerto(String ciudad, String nombre, List<Vuelo> vuelosProgramados) {
		this.ciudad = ciudad;
		this.nombre = nombre;
		this.vuelosProgramados = vuelosProgramados;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Vuelo> getVuelosProgramados() {
		//TODO: Esto hay que revisarlo.
		return vuelosProgramados;
	}
	
	public List<Vuelo> getVuelosCompletos(){
		//TODO: Hacer para el próximo día.
		return null;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(ciudad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aeropuerto other = (Aeropuerto) obj;
		return Objects.equals(ciudad, other.ciudad) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Aeropuerto [ciudad=" + ciudad + ", nombre=" + nombre + ", vuelosProgramados=" + vuelosProgramados + "]";
	}
	
}
