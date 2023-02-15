package fp.punto;

public interface Punto extends Comparable<Punto>{
	public Double getX();
	public Double getY();
	public void setX(Double x);
	public void setY(Double y);
	public Double getDistanciaA(Punto p);
}
