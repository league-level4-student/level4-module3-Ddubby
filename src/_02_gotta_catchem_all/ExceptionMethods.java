package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double x, double y) throws IllegalArgumentException {
		if (y == 0.0) {
			throw new IllegalArgumentException();
		}
		return x/y;
	}
	
	public String reverseString(String s) throws IllegalStateException{
		String s2 = "";
		if (s.length() == 0) {
			throw new IllegalStateException();
		}
		for (int i = s.length(); i > 0; i--) {
			s2 += s.substring(i - 1,i);
		}
		return s2;
	}
}
