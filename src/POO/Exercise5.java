package POO;

public class Exercise5 {

	public static void main(String[] args) {
		Double double1 = 11.7;
		Double double2 = 13.5, double3 = 52.01;
		Double double4 = 9.67;

		System.out.println(Double.compare(7.56, 72.6));
		System.out.println(double3.compareTo(double3));
		System.out.println(double3.doubleValue());
		System.out.println(double3.equals(double3));
		System.out.println(double4.floatValue());
		System.out.println(double1.intValue());
		System.out.println(double3.isInfinite());
		System.out.println(Double.isInfinite(24.3));
		System.out.println(double3.isNaN());
		System.out.println(Double.isInfinite(-1));
		System.out.println(Double.max(12.4, 24.8));
		System.out.println(Double.min(17.6, 17.7));
		System.out.println(Double.parseDouble("234"));
		System.out.println(Double.sum(23.5, 34.5));
		System.out.println(Double.valueOf(double2));
		System.out.println(Double.valueOf("786.45"));
	}

}
