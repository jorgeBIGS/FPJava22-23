package fp.punto;

public class PuntoImpl implements Punto{
	private Double x;
	private Double y;

	public PuntoImpl() {
		x = 0.0;
		y = 0.0;
	}

	public PuntoImpl(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public Double getX() {
		return x;
	}

	public Double getDistanciaA(Punto referencia) {
		Double dx = getX() - referencia.getX();
		Double dy = getY() - referencia.getY();
		Double suma = dx * dx + dy * dy;
		return Math.sqrt(suma);
	}

	public String toString() {
		return  "(" + this.getX() + "," + this.y + ")";
	}
	
	public boolean equals(Object o) {
		boolean result = false;
		
		if (o instanceof Punto) {
			Punto p = (Punto) o;
			result = this.getX().equals(p.getX())
					&& this.getY().equals(p.getY());
		}
		
		return result;
	}
	
	public int hashCode() {
		return getX().hashCode() +  31 * getY().hashCode();
	}

	
	public int compareTo(Punto o) {
		int cmp = getX().compareTo(o.getX());
		if (cmp == 0) {
			cmp = getY().compareTo(o.getY());
		}
		return cmp;
	}
}
