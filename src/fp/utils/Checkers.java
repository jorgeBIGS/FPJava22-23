package fp.utils;

public class Checkers {

	public static void checkSize(String[] splits, Integer tam) {
		if(splits.length != tam) {
			throw new IllegalArgumentException();
		}
		
	}

}
