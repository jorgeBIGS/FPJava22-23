package fp.test;

public class TestExcepciones {

	public static void main(String[] args) {
		try {
			Integer dividendo = 23;
			Integer divisor = 0;

			System.out.println(dividendo / divisor);
		} catch (ArithmeticException ex) {
			System.out.println("Se ha lanzado una excepción.");
			Integer dividendo = 23;
			Integer divisor = 0;

			System.out.println(dividendo / divisor);
		} finally {
			System.out.println("Ya estoy terminando 1");
		}
		System.out.println("Ya estoy terminando 2");
	}

}
