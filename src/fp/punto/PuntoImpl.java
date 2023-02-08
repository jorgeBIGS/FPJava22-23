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

	public Double getDistanciaEuclideaA(Punto referencia) {
		Double dx = getX() - referencia.getX();
		Double dy = getY() - referencia.getY();
		Double suma = dx * dx + dy * dy;
		return Math.sqrt(suma);
	}

	public String toString() {
		return "(" + this.getX() + "," + this.y + ")";
	}

	

}
