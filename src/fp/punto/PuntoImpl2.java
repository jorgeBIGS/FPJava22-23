package fp.punto;

public class PuntoImpl2 extends PuntoImpl implements Punto{
	public Double getDistanciaA(Punto referencia) {
		
		Double dx = getX() - referencia.getX();
		Double dy = getY() - referencia.getY();
		
		return Math.abs(dx + dy);
	}
}
